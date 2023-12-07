package com.komfortcieplny.CRM.customer.repository;

import com.komfortcieplny.CRM.common.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
