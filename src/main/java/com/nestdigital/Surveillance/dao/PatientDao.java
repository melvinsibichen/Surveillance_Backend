package com.nestdigital.Surveillance.dao;

import com.nestdigital.Surveillance.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends JpaRepository<Patient,Integer> {

    @Query(value = "SELECT * FROM `patients` WHERE `facility_name`= :facilityName and `unit_name`= :unitName",nativeQuery = true)
    List<Patient> getPatient(@Param("facilityName") String facilityName,@Param("unitName")String unitName);


}
