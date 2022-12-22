package com.komfortcieplny.CRM.customer.model;

public class Customer {
    private String name;
    private String company;
    private String nip;
    private String street;
    private String postalCode;

    public Customer(String name, String company, String nip, String street, String postalCode, String city, int units, boolean inspected) {
        this.name = name;
        this.company = company;
        this.nip = nip;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.units = units;
        this.inspected = inspected;
    }

    private String city;

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

    private int units;
    private boolean inspected;
}
