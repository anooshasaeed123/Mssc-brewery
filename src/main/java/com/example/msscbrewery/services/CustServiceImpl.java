package com.example.msscbrewery.services;

import com.example.msscbrewery.web.model.BeerDto;
import com.example.msscbrewery.web.model.customer;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustServiceImpl implements CustService {
    @Override
    public customer getCustById(UUID customer_id) {
        return customer.builder().id(UUID.randomUUID()).name("Galaxy cat").build();
    }
}
