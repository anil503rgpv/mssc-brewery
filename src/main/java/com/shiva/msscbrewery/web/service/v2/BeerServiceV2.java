package com.shiva.msscbrewery.web.service.v2;

import com.shiva.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {


    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2);

    BeerDtoV2 updateBeer(UUID beerId, BeerDtoV2 beerDtoV2);

    void deleteBeerById(UUID beerId);
}
