package com.komfortcieplny.CRM.admin.customer.repository;

import com.komfortcieplny.CRM.admin.customer.model.AdminCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminCustomerRepository extends JpaRepository<AdminCustomer, Long> {
    public Page<AdminCustomer> findByNameContaining(String name, Pageable pageable);
}
