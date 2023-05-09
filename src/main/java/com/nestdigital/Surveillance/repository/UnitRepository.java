package com.nestdigital.Surveillance.repository;

import com.nestdigital.Surveillance.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UnitRepository extends JpaRepository<Unit,Integer> {


    @Query(value = "SELECT * FROM `units` WHERE `facility_fk`=:id",nativeQuery = true)
    public List<Unit> getUnitByFacilityId(@Param("id")Integer id);
}
