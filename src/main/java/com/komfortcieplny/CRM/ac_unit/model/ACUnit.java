package com.komfortcieplny.CRM.ac_unit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class ACUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customerId;
    private String model;
    private double power;
    private String serialNumber;
    private LocalDate instalDate;

    private ACUnit(Builder builder) {
        id = builder.id;
        customerId = builder.customerId;
        model = builder.model;
        power = builder.power;
        serialNumber = builder.serialNumber;
        instalDate = builder.instalDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public LocalDate getInstalDate() {
        return instalDate;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }

    public String getSerialNumber() {
        return serialNumber;
    }


    public static final class Builder {
        private Long id;
        private Long customerId;
        private String model;
        private double power;
        private String serialNumber;
        private LocalDate instalDate;

        private Builder() {
        }

        public Builder id(Long val) {
            id = val;
            return this;
        }

        public Builder customerId(Long val) {
            customerId = val;
            return this;
        }

        public Builder model(String val) {
            model = val;
            return this;
        }

        public Builder power(double val) {
            power = val;
            return this;
        }

        public Builder serialNumber(String val) {
            serialNumber = val;
            return this;
        }

        public Builder instalDate(LocalDate val) {
            instalDate = val;
            return this;
        }

        public ACUnit build() {
            return new ACUnit(this);
        }
    }
}
