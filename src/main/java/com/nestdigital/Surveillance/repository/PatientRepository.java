package com.nestdigital.Surveillance.repository;

import com.nestdigital.Surveillance.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {

    @Query(value = "SELECT * FROM `patients` WHERE `location_id`= :id",nativeQuery = true)
    List<com.nestdigital.Surveillance.model.Patient> getPatient(@Param("id") int id);


}
