package com.nestdigital.Surveillance.dao;

import com.nestdigital.Surveillance.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDao extends JpaRepository<Patient,Integer> {
}
