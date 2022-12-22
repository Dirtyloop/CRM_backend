package com.komfortcieplny.CRM.customer.controller;

import com.komfortcieplny.CRM.customer.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return List.of(
                new Customer("Joanna Nowak", "AngloAnglo", "8882223311", "Dolinowa 13", "80-456", "Gdańsk", 2, true),
                new Customer("Anula Grochowska", "", "", "Owocowa 2", "82-456", "Sopot", 1, true),
                new Customer("Krystyna Ronaldo", "", "", "Wesoła 6/2", "62-123", "Konin", 5, false),
                new Customer("Julian Embabe", "Futbal", "5653421212", "Kolorowa 16/4", "80-234", "Gdańsk", 1, false)
        );
    }
}
