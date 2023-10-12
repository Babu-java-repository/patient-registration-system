package com.javainsights.patientregistrationsystem.controller;

import com.javainsights.patientregistrationsystem.entity.PatientInfo;
import com.javainsights.patientregistrationsystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    public ResponseEntity<List<PatientInfo>> getAllPatientDetails(){
        return ResponseEntity.ok(patientService.getAllPatientDetails());
    }

}
