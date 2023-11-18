package com.komfortcieplny.CRM.ac_unit.controller.dto;

import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

public record ACUnitDto(@Length(min=2, max = 32) String model,
                        double power,
                        @Length(min=6, max=16) String serialNumber,
                        LocalDate instalDate,
                        long customerId) {
}
