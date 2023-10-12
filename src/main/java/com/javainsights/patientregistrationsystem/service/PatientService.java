package com.javainsights.patientregistrationsystem.service;

import com.javainsights.patientregistrationsystem.entity.PatientInfo;
import com.javainsights.patientregistrationsystem.repository.PatientInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientInfoRepository patientInfoRepository;

    public List<PatientInfo> getAllPatientDetails(){
       return patientInfoRepository.findAll();
    }
}
