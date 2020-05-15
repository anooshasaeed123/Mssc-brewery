package com.example.msscbrewery.services;
import com.example.msscbrewery.web.model.customer;

import java.util.UUID;


public interface CustService {
    customer getCustById(UUID customer_id);
}
