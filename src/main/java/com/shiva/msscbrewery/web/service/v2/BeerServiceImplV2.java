package com.shiva.msscbrewery.web.service.v2;

import com.shiva.msscbrewery.web.model.BeerDto;
import com.shiva.msscbrewery.web.model.v2.BeerDtoV2;
import com.shiva.msscbrewery.web.service.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImplV2 implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2) {
        return null;
    }

    @Override
    public BeerDtoV2 updateBeer(UUID beerId, BeerDtoV2 beerDtoV2) {
        return null;
    }

    @Override
    public void deleteBeerById(UUID beerId) {

    }
}
