package com.nestdigital.Surveillance.controller;

import com.nestdigital.Surveillance.Service.FacilityServiceImpl;
import com.nestdigital.Surveillance.model.Facility;
import com.nestdigital.Surveillance.repository.FacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/facility")
public class FacilityController {

    @Autowired
    private FacilityServiceImpl facilityServiceImpl;
    @CrossOrigin("*")
    @GetMapping("/getFacilityNames")
    public List<Facility> getFacilityNames() {
        return facilityServiceImpl.getFacilityNames();
    }


}
