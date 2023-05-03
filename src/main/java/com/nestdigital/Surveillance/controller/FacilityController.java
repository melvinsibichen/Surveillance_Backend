package com.nestdigital.Surveillance.controller;

import com.nestdigital.Surveillance.dao.FacilityDao;
import com.nestdigital.Surveillance.model.Facility;
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
    public FacilityDao facilityDao;

    @CrossOrigin("*")
    @GetMapping("/getAllFacility")
    public List<Facility> getAllFacility() {
        return facilityDao.findAll();
    }

    @CrossOrigin("*")
    @GetMapping("/getFacilityNames")
    public List<String> getFacilityNames() {
        return facilityDao.GetAfcilityNAmes();
    }

    @CrossOrigin("*")
    @GetMapping("/getUnitNames")
    public List<String> getUnitNames(){
      return facilityDao.GetUnitNAmes();
    };


}
