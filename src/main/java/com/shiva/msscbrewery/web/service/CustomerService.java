package com.shiva.msscbrewery.web.service;

import com.shiva.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {


    CustomerDto getCustomerById(UUID customerId);
}
