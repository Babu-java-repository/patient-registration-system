package com.javainsights.patientregistrationsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientInfo implements Serializable {

    @Id
    private Long id;
    private String name;
    private int age;
    private Address address;
    private int phoneNo;
    private String reason;
    private Long aadharNo;
    private String consultationDept;
}
