package com.nestdigital.Surveillance.Service;

import com.nestdigital.Surveillance.model.Facility;
import com.nestdigital.Surveillance.repository.FacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityServiceImpl implements FacilityService{

    @Autowired
    private FacilityRepository facilityRepository;
    @Override
    public List<Facility> getFacilityNames() {
        return facilityRepository.findAll();
    }
}
