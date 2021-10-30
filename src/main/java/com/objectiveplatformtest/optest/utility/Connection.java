package com.objectiveplatformtest.optest.utility;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.objectiveplatformtest.optest.repository.BeerRepository;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Component
@Service
public final class Connection {
    private URL url;
    private String inline = "";
    private Scanner scanner;
    @Autowired
    private BeerRepository iBeerRepository;


    public Connection() {
    }

    public  int getConnection() throws IOException {
        url = new URL("https://api.punkapi.com/v2/beers");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        return conn.getResponseCode();
    }

    public  List<Response> getBeers() throws IOException {
        scanner = new Scanner(url.openStream());
        //Write all the JSON data into a string using a scanner
        while (scanner.hasNext()) {
            inline += scanner.nextLine();
        }
        //Close the scanner
        scanner.close();

        JSONParser parse = new JSONParser(inline);
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        Response[] beers = gson.fromJson(inline, Response[].class);
        return Arrays.asList(beers);
    }

    public void createFile(){
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeFile(String str){
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(str);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
