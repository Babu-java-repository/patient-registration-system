package com.javainsights.patientregistrationsystem.repository;

import com.javainsights.patientregistrationsystem.entity.PatientInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientInfoRepository extends JpaRepository<PatientInfo, Long> {
}
