package com.objectiveplatformtest.optest.controller;

import com.objectiveplatformtest.optest.model.Beer;
import com.objectiveplatformtest.optest.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("beer")
public class BeerController {
    @Autowired
    private BeerService beerService;

    //Use case 1: As a beer lover I want to browse through the available beers with 10 beers per screen
    @RequestMapping(value= "", method = RequestMethod.GET)
    public ResponseEntity<Page<Beer>> getPaginatedBeers(@RequestParam("page") int page){
        return new ResponseEntity<Page<Beer>>(beerService.getPaginatedBeers(page), HttpStatus.OK);
    }

    //Use case 2: As a beer lover I want to search beers based on name
    @RequestMapping(value= "/byName", method = RequestMethod.GET)
    public Beer getBeerByName(String name){
        return beerService.getBeersByName(name);
    }

    //Use case 2: As a beer lover I want to search beers based on description
    @RequestMapping(value= "/byDescription", method = RequestMethod.GET)
    public Iterable<Beer> getBeerByDescription(String description){
        return beerService.getBeersByDescription(description);
    }

    //Use case 3: As a beer lover I want to mark beers as my favourite
    @RequestMapping(value="/favourite/{id}", method = RequestMethod.PATCH)
    public void setFavouriteBeer(@PathVariable Long id){
        beerService.setFav(id);
    }

    //Use case 4: As a beer lover I want to view my favourite beers
    @RequestMapping(value= "/favourites", method = RequestMethod.GET)
    public Iterable<Beer> getMyFavouriteBeers(){
        return beerService.getMyFavouriteBeers();
    }

    @RequestMapping(value= "/all", method = RequestMethod.GET)
    public Iterable<Beer> getBeers(){
        return beerService.getAllBeers();
    }
}
