package com.nestdigital.Surveillance.repository;

import com.nestdigital.Surveillance.model.Facility;
import com.nestdigital.Surveillance.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacilityRepository extends JpaRepository<Facility,Integer> {

    @Query(value = "SELECT * FROM `facilitydetails` WHERE `facility`= :facilityName and `unit`= :unit LIMIT 1",nativeQuery = true)
    Integer getFacility(@Param("facilityName")String facilityName, @Param("unit")String unit);


}
