package com.objectiveplatformtest.optest.utility;

import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("tagline")
    private String tagline;

    @SerializedName("first_brewed")
    private String first_brewed;

    @SerializedName("description")
    private String description;

    @SerializedName("image_url")
    private String image_url;

    @SerializedName("abv")
    private Float abv;

    @SerializedName("ibu")
    private Float ibu;

    @SerializedName("target_fg")
    private Float target_fg;

    @SerializedName("target_og")
    private Float target_og;

    @SerializedName("ebc")
    private Float ebc;

    @SerializedName("srm")
    private Float srm;

    @SerializedName("ph")
    private Float ph;

    @SerializedName("attenuation_level")
    private Float attenuation_level;

    @SerializedName("brewers_tips")
    private String brewers_tips;

    @SerializedName("contributed_by")
    private String contributed_by;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getContributed_by() {
        return contributed_by;
    }

    public void setContributed_by(String contributed_by) {
        this.contributed_by = contributed_by;
    }
}