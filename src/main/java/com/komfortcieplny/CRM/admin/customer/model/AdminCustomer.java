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
    @Enumerated(EnumType.STRING)
    private AdminProductInspected inspected;

    public AdminCustomer() {
    }



    public AdminCustomer(Long id,
                         String name,
                         String company,
                         String nip,
                         String street,
                         String postalCode,
                         String city,
                         int units,
                         AdminProductInspected inspected) {
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

    private AdminCustomer(Builder builder) {
        id = builder.id;
        name = builder.name;
        company = builder.company;
        nip = builder.nip;
        street = builder.street;
        postalCode = builder.postalCode;
        city = builder.city;
        units = builder.units;
        inspected = builder.inspected;
    }

    public static Builder builder() {
        return new Builder();
    }

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

    public AdminProductInspected isInspected() {
        return inspected;
    }

    public static final class Builder {
        private Long id;
        private String name;
        private String company;
        private String nip;
        private String street;
        private String postalCode;
        private String city;
        private int units;
        private AdminProductInspected inspected;

        private Builder() {
        }

        public Builder id(Long val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder company(String val) {
            company = val;
            return this;
        }

        public Builder nip(String val) {
            nip = val;
            return this;
        }

        public Builder street(String val) {
            street = val;
            return this;
        }

        public Builder postalCode(String val) {
            postalCode = val;
            return this;
        }

        public Builder city(String val) {
            city = val;
            return this;
        }

        public Builder units(int val) {
            units = val;
            return this;
        }

        public Builder inspected(AdminProductInspected val) {
            inspected = val;
            return this;
        }

        public AdminCustomer build() {
            return new AdminCustomer(this);
        }
    }
}
