package com.nestdigital.Surveillance.dao;

import com.nestdigital.Surveillance.model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityDao extends JpaRepository<Facility,Integer> {
}
