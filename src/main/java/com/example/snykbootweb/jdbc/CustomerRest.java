package com.example.snykbootweb.jdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/customer")
public class CustomerRest {

    CustomerService customerService;

    public CustomerRest(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping ("/count")
    public int getCount() {
        return customerService.countCustomers();
    }
}
