package com.nestdigital.Surveillance.dao;

import com.nestdigital.Surveillance.model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FacilityDao extends JpaRepository<Facility,Integer> {
    @Query(value = "SELECT * FROM `facilitydetails` WHERE `facility`= :facilityName and `unit`= :unit LIMIT 1",nativeQuery = true)
    Integer getFacility(@Param("facilityName")String facilityName, @Param("unit")String unit);

    @Query(value = "SELECT DISTINCT `facility` FROM `facilitydetails`",nativeQuery = true)
    public List<String>GetAfcilityNAmes();


    @Query(value = "SELECT DISTINCT `unit` FROM `facilitydetails`",nativeQuery = true)
    public List<String>GetUnitNAmes();
}
