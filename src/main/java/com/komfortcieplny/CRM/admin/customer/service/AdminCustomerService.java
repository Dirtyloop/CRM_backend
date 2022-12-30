package com.komfortcieplny.CRM.admin.customer.service;

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
}
