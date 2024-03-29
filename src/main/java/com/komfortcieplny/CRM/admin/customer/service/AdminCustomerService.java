package com.komfortcieplny.CRM.admin.customer.service;

import com.komfortcieplny.CRM.admin.customer.exceptions.CustomerNotFoundException;
import com.komfortcieplny.CRM.admin.customer.model.AdminCustomer;
import com.komfortcieplny.CRM.admin.customer.repository.AdminCustomerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AdminCustomerService {

    private final AdminCustomerRepository adminCustomerRepository;

    public AdminCustomerService(AdminCustomerRepository adminCustomerRepository) {
        this.adminCustomerRepository= adminCustomerRepository;
    }

    public Page<AdminCustomer> getCustomers(Pageable pageable) {
        return adminCustomerRepository.findAll(pageable);
    }

    public Page<AdminCustomer> getCustomersSortByName(String name, Pageable pageable) {
        return adminCustomerRepository.findByNameContaining(name, pageable);
    }

    public AdminCustomer getCustomer(Long id) {
        return adminCustomerRepository.findById(id).orElseThrow(() ->
                new CustomerNotFoundException(String.format("Customer with id %s was not found", id)));
    }

    public AdminCustomer createCustomer(AdminCustomer customer) {
        return adminCustomerRepository.save(customer);
    }

    public AdminCustomer updateCustomer(AdminCustomer customer) {
        return adminCustomerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        adminCustomerRepository.deleteById(id);
    }
}
