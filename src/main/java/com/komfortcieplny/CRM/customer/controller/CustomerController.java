package com.komfortcieplny.CRM.customer.controller;

import com.komfortcieplny.CRM.customer.controller.dto.CustomerListDto;
import com.komfortcieplny.CRM.customer.model.Customer;
import com.komfortcieplny.CRM.customer.service.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public Page<CustomerListDto> getCustomers(Pageable pageable) {
        Page<Customer> customers = customerService.getCustomers(pageable);
        List<CustomerListDto> customerListDtos = customers.getContent().stream()
                .map(customer -> CustomerListDto.builder()
                        .id(customer.getId())
                        .name(customer.getName())
                        .city(customer.getCity())
                        .units(customer.getUnits())
                        .inspected(customer.getInspected())
                        .build())
                .toList();
        return new PageImpl<>(customerListDtos, pageable, customers.getTotalElements());
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return customerService.getCustomer(id);
    }
}
