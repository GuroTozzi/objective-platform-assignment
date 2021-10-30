package com.objectiveplatformtest.optest.service;

import com.objectiveplatformtest.optest.model.Beer;
import com.objectiveplatformtest.optest.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BeerService {

    private final int ELEMENT_PER_PAGE = 10;

    @Autowired
    private BeerRepository beerRepository;

    public void addBeer(Beer beer){
        beerRepository.save(beer);
    }

    public Iterable<Beer> getAllBeers(){
        return beerRepository.findAll();
    }

    public Iterable<Beer> getMyFavouriteBeers(){
        return beerRepository.getMyFavouriteBeers();
    }

    public void setFav(Long id){
        beerRepository.setFav(id);
    }

    public Page<Beer> getPaginatedBeers(int page){
        Pageable pageable = PageRequest.of(page, ELEMENT_PER_PAGE);
        return beerRepository.findAll(pageable);
    }

    public Beer getBeersByName(String name){
        return beerRepository.findBeerByName(name);
    }

    public Iterable<Beer> getBeersByDescription(String description) {
        return beerRepository.getBeersByDescription(description);
    }
}
