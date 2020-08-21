package com.shiva.msscbrewery.web.service;

import com.shiva.msscbrewery.web.model.BeerDto;
import com.shiva.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {


    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Anil").build();
    }
}
