package com.komfortcieplny.CRM.admin.customer.repository;

import com.komfortcieplny.CRM.admin.customer.model.AdminCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminCustomerRepository extends JpaRepository<AdminCustomer, Long> {
}
