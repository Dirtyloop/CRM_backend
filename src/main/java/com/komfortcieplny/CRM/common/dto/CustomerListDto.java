package com.komfortcieplny.CRM.common.dto;

public class CustomerListDto {
    private Long id;
    private String name;
    private String city;
    private int units;
    private String inspected;

    private CustomerListDto(Builder builder) {
        id = builder.id;
        name = builder.name;
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

    public String getCity() {
        return city;
    }

    public int getUnits() {
        return units;
    }

    public String getInspected() {
        return inspected;
    }

    public static final class Builder {
        private Long id;
        private String name;
        private String city;
        private int units;
        private String inspected;

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

        public Builder city(String val) {
            city = val;
            return this;
        }

        public Builder units(int val) {
            units = val;
            return this;
        }

        public Builder inspected(String val) {
            inspected = val;
            return this;
        }

        public CustomerListDto build() {
            return new CustomerListDto(this);
        }
    }
}
