package com.javainsights.patientregistrationsystem.entity;

import lombok.Data;

@Data
public class Address {

    private String flatNo;
    private String streetName;
    private String addInfo;
    private String city;
    private String state;
    private String postalCode;
}
