package com.komfortcieplny.CRM.customer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
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
    private String inspected;

    public Customer() {
    }
    public Customer(Long id, String name, String company, String nip, String street, String postalCode, String city, int units, String inspected) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.nip = nip;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.units = units;
        this.inspected = inspected;
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

    public String getInspected() {
        return inspected;
    }


    public Long getId() {
        return id;
    }
}
