package com.objectiveplatformtest.optest.model;

import javax.persistence.*;


@Entity
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    private String name;
    private String tagline;
    private String first_brewed;
    private String description;
    private String image_url;
//    private String volume_unit;
//    private Float volume_quantity;
//    private String boil_volume_unit;
//    private Float boil_volume_quantity;
    private Float abv;
    private Float ibu;
    private Float target_fg;
    private Float target_og;
    private Float ebc;
    private Float srm;
    private Float ph;
    private Float attenuation_level;
    private String brewers_tips;
    private Boolean fav;
//    @OneToMany
//    private List<FoodPairing> foodPairingList;

    public Beer(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Beer() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getFirst_brewed() {
        return first_brewed;
    }

    public void setFirst_brewed(String first_brewed) {
        this.first_brewed = first_brewed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

//    public String getVolume_unit() {
//        return volume_unit;
//    }
//
//    public void setVolume_unit(String volume_unit) {
//        this.volume_unit = volume_unit;
//    }
//
//    public Float getVolume_quantity() {
//        return volume_quantity;
//    }
//
//    public void setVolume_quantity(Float volume_quantity) {
//        this.volume_quantity = volume_quantity;
//    }
//
//    public String getBoil_volume_unit() {
//        return boil_volume_unit;
//    }
//
//    public void setBoil_volume_unit(String boil_volume_unit) {
//        this.boil_volume_unit = boil_volume_unit;
//    }
//
//    public Float getBoil_volume_quantity() {
//        return boil_volume_quantity;
//    }
//
//    public void setBoil_volume_quantity(Float boil_volume_quantity) {
//        this.boil_volume_quantity = boil_volume_quantity;
//    }

    public Float getAbv() {
        return abv;
    }

    public void setAbv(Float abv) {
        this.abv = abv;
    }

    public Float getIbu() {
        return ibu;
    }

    public void setIbu(Float ibu) {
        this.ibu = ibu;
    }

    public Float getTarget_fg() {
        return target_fg;
    }

    public void setTarget_fg(Float target_fg) {
        this.target_fg = target_fg;
    }

    public Float getTarget_og() {
        return target_og;
    }

    public void setTarget_og(Float target_og) {
        this.target_og = target_og;
    }

    public Float getEbc() {
        return ebc;
    }

    public void setEbc(Float ebc) {
        this.ebc = ebc;
    }

    public Float getSrm() {
        return srm;
    }

    public void setSrm(Float srm) {
        this.srm = srm;
    }

    public Float getPh() {
        return ph;
    }

    public void setPh(Float ph) {
        this.ph = ph;
    }

    public Float getAttenuation_level() {
        return attenuation_level;
    }

    public void setAttenuation_level(Float attenuation_level) {
        this.attenuation_level = attenuation_level;
    }

    public String getBrewers_tips() {
        return brewers_tips;
    }

    public void setBrewers_tips(String brewers_tips) {
        this.brewers_tips = brewers_tips;
    }

    public Boolean getFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }

    //    public List<FoodPairing> getFoodPairingList() {
//        return foodPairingList;
//    }
//
//    public void setFoodPairingList(List<FoodPairing> foodPairingList) {
//        this.foodPairingList = foodPairingList;
//    }
}
