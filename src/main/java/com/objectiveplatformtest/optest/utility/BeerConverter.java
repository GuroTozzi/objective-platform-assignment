package com.objectiveplatformtest.optest.utility;

import com.objectiveplatformtest.optest.model.Beer;

public final class BeerConverter {

    private BeerConverter(){

    }

    public static final void convert(Response response, Beer beer){

        beer.setName(response.getName());
        beer.setTagline(response.getTagline());
        beer.setFirst_brewed(response.getFirst_brewed());
        beer.setDescription(response.getDescription());
        beer.setImage_url(response.getImage_url());
        beer.setAbv(response.getAbv());
        beer.setIbu(response.getIbu());
        beer.setTarget_fg(response.getTarget_fg());
        beer.setTarget_og(response.getTarget_og());
        beer.setEbc(response.getEbc());
        beer.setSrm(response.getSrm());
        beer.setPh(response.getPh());
        beer.setAttenuation_level(response.getAttenuation_level());
        beer.setBrewers_tips(response.getBrewers_tips());
        beer.setFav(false);
    }
}
