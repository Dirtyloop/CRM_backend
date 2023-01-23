package com.komfortcieplny.CRM.admin.customer.controller;

import com.komfortcieplny.CRM.admin.customer.controller.dto.AdminCustomerDto;
import com.komfortcieplny.CRM.admin.customer.model.AdminCustomer;
import com.komfortcieplny.CRM.admin.customer.service.AdminCustomerService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AdminCustomerController {

    public static final Long EMPTY_ID = null;
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

    @PostMapping("/admin/customers")
    public AdminCustomer createCustomer(@RequestBody @Valid AdminCustomerDto adminCustomerDto) {
        return adminCustomerService.createCustomer(mapAdminCustomer(adminCustomerDto, EMPTY_ID));
    }

    @PutMapping("/admin/customers/{id}")
    public AdminCustomer updateCustomer(@RequestBody @Valid AdminCustomerDto adminCustomerDto, @PathVariable Long id) {
        return adminCustomerService.updateCustomer(mapAdminCustomer(adminCustomerDto, id));
    }

    private static AdminCustomer mapAdminCustomer(AdminCustomerDto adminCustomerDto, Long id) {
        return AdminCustomer.builder()
                .id(id)
                .name(adminCustomerDto.getName())
                .company(adminCustomerDto.getCompany())
                .nip(adminCustomerDto.getNip())
                .street(adminCustomerDto.getStreet())
                .postalCode(adminCustomerDto.getPostalCode())
                .city(adminCustomerDto.getCity())
                .units(adminCustomerDto.getUnits())
                .inspected(adminCustomerDto.isInspected())
                .build();
    }
}
