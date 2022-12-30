package com.komfortcieplny.CRM.admin.customer.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class AdminCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String company;
    private String nip;
    private String street;
    private String postalCode;
    private String city;
    private int units;
    private boolean inspected;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getNip() {
        return nip;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public int getUnits() {
        return units;
    }

    public boolean isInspected() {
        return inspected;
    }
}
