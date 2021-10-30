package com.objectiveplatformtest.optest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FoodPairing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Float idFP;
    private Float idIngredients;
    private String food_pairing;

    public Float getIdFP() {
        return idFP;
    }

    public void setIdFP(Float idFP) {
        this.idFP = idFP;
    }

    public Float getIdIngredients() {
        return idIngredients;
    }

    public void setIdIngredients(Float idIngredients) {
        this.idIngredients = idIngredients;
    }

    public String getFood_pairing() {
        return food_pairing;
    }

    public void setFood_pairing(String food_pairing) {
        this.food_pairing = food_pairing;
    }
}
