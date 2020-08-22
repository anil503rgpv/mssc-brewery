package com.shiva.msscbrewery.web.service;

import com.shiva.msscbrewery.web.model.BeerDto;
import com.shiva.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {


    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Anil").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public CustomerDto updateOrCreateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo for update logic
        return null;
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        //todo for delete logic
        log.debug("Deleting a Customer.....");
    }
}
