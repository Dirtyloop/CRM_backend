package com.komfortcieplny.CRM.customer.controller;

import com.komfortcieplny.CRM.customer.model.Customer;
import com.komfortcieplny.CRM.customer.service.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public Page<Customer> getCustomers(Pageable pageable) {
        return customerService.getCustomers(pageable);
    }
}
