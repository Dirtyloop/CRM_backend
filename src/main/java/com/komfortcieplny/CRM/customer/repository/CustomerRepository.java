package com.komfortcieplny.CRM.customer.repository;

import com.komfortcieplny.CRM.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
