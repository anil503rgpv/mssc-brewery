package com.shiva.msscbrewery.web.controller;


import com.shiva.msscbrewery.web.model.CustomerDto;
import com.shiva.msscbrewery.web.service.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId){
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity newCustomer(@RequestBody CustomerDto customerDto){

        CustomerDto newCustomer = customerService.saveNewCustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location","/api/v1/beer/"+newCustomer.getId().toString());
        return new ResponseEntity(headers,HttpStatus.CREATED);
    }

    @PutMapping({"/{customerId}"})
    public ResponseEntity updateCustomer(@PathVariable("customerId") UUID customerId,@RequestBody CustomerDto customerDto){
        CustomerDto updateOrCreateDto = customerService.updateOrCreateCustomer(customerId,customerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("customerId") UUID customerId){
        customerService.deleteCustomerById(customerId);
    }

}
