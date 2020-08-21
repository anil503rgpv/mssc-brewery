package com.shiva.msscbrewery.web.service;

import com.shiva.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}
