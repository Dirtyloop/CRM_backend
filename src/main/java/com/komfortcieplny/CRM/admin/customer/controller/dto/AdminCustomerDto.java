package com.komfortcieplny.CRM.admin.customer.controller.dto;

import com.komfortcieplny.CRM.admin.customer.model.AdminProductInspected;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public class AdminCustomerDto {
    @NotBlank
    @Length(min = 3, max = 32)
    private String name;
    @NotBlank
    @Length(min = 3, max = 32)
    private String company;
    @NotBlank
    @Length(min = 3, max = 32)
    private String nip;
    @NotBlank
    @Length(min = 3, max = 32)
    private String street;
    @NotBlank
    @Length(min = 3, max = 32)
    private String postalCode;
    @NotBlank
    @Length(min = 3, max = 32)
    private String city;
    @Min(0)
    private int units;
    private AdminProductInspected inspected;

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
}
