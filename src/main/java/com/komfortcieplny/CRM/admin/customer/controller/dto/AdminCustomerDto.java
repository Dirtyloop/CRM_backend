package com.komfortcieplny.CRM.admin.customer.controller.dto;

import com.komfortcieplny.CRM.admin.customer.model.AdminCustomerInspected;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Length;

public class AdminCustomerDto {
    @NotBlank
    @Length(min = 3, max = 32)
    private String name;
    @Length(min = 0, max = 32)
    private String company;
    @Length(min = 0, max = 32)
    private String nip;
    @NotBlank
    @Length(min = 3, max = 32)
    private String street;
    @NotBlank
    @Pattern(regexp = "[0-9]{2}-[0-9]{3}")
    private String postalCode;
    @NotBlank
    @Length(min = 3, max = 32)
    private String city;
    @Min(0)
    @Max(99)
    private int units;
    private AdminCustomerInspected inspected;

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

    public AdminCustomerInspected getInspected() {
        return inspected;
    }
}
