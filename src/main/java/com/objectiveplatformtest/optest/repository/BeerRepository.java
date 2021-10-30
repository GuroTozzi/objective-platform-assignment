package com.objectiveplatformtest.optest.repository;


import com.objectiveplatformtest.optest.model.Beer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface BeerRepository extends CrudRepository<Beer, Long>, PagingAndSortingRepository<Beer, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE Beer b SET b.fav = true WHERE b.id = :id")
    void setFav(@Param("id") Long id);

    @Query("SELECT b FROM Beer b WHERE b.fav = true")
    Iterable<Beer> getMyFavouriteBeers();

    @Query("SELECT b FROM Beer b WHERE b.name = :name")
    Beer findBeerByName(@Param("name") String name);

    @Query("SELECT b FROM Beer b WHERE b.description LIKE CONCAT('%',:description,'%')")
    Iterable<Beer> getBeersByDescription(@Param("description") String description);
}
