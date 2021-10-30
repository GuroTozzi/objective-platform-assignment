package com.objectiveplatformtest.optest;

import com.objectiveplatformtest.optest.model.Beer;
import com.objectiveplatformtest.optest.service.BeerService;
import com.objectiveplatformtest.optest.utility.BeerConverter;
import com.objectiveplatformtest.optest.utility.Connection;
import com.objectiveplatformtest.optest.utility.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class OptestApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(OptestApplication.class, args);
		BeerService beerService = configurableApplicationContext.getBean(BeerService.class);

		try {
			Connection connection = new Connection();
			//Stablish the connection
			int status = connection.getConnection();
			if (status != 200) {
				throw new RuntimeException("HttpResponseCode: " + status);
			} else {
				List<Response> response = connection.getBeers();
				response.forEach(resp -> {
					Beer beerTmp = new Beer();
					BeerConverter.convert(resp, beerTmp);
					beerService.addBeer(beerTmp);
				});
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}