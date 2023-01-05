package com.komfortcieplny.CRM.admin.customer.controller;

import com.komfortcieplny.CRM.admin.customer.model.AdminCustomer;
import com.komfortcieplny.CRM.admin.customer.service.AdminCustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminCustomerController {

    private final AdminCustomerService adminCustomerService;

    public AdminCustomerController(AdminCustomerService adminCustomerService) {
        this.adminCustomerService = adminCustomerService;
    }

    @GetMapping("/admin/customers")
    public Page<AdminCustomer> getCustomers(Pageable pageable) {
        return adminCustomerService.getCustomers(pageable);
    }

    @GetMapping("/admin/customersSortByName")
    public Page<AdminCustomer> getCustomersSortByName(String name, Pageable pageable) {
        return adminCustomerService.getCustomersSortByName(name, pageable);
    }

    @GetMapping("/admin/customers/{id}")
    public AdminCustomer getCustomer(@PathVariable Long id) {
        return adminCustomerService.getCustomer(id);
    }
}
