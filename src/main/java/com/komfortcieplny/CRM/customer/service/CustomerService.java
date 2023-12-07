package com.komfortcieplny.CRM.customer.service;

import com.komfortcieplny.CRM.admin.customer.exceptions.CustomerNotFoundException;
import com.komfortcieplny.CRM.common.model.Customer;
import com.komfortcieplny.CRM.customer.repository.CustomerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Page<Customer> getCustomers(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }


    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).orElseThrow(() ->
                new CustomerNotFoundException(String.format("Customer with id %s was not found", id)));
    }
}
