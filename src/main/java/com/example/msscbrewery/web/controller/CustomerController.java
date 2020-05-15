package com.example.msscbrewery.web.controller;


import com.example.msscbrewery.services.CustService;
import com.example.msscbrewery.web.model.customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
    private CustService customerservice;

    public  CustomerController(CustService customerservice) {
        this.customerservice = customerservice;
    }


    @GetMapping({"/{customer_id}"})
    public ResponseEntity<customer> getCustomer(@PathVariable("customer_id") UUID customer_id){
        return new ResponseEntity<>(customerservice.getCustById(customer_id), HttpStatus.OK);
    }
}


