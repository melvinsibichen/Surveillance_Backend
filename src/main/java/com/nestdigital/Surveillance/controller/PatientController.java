package com.nestdigital.Surveillance.controller;


import com.nestdigital.Surveillance.dao.FacilityDao;
import com.nestdigital.Surveillance.dao.PatientDao;
import com.nestdigital.Surveillance.model.Facility;
import com.nestdigital.Surveillance.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired

    public PatientDao ptdao;
    @Autowired
    public FacilityDao facilityDao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/getPatients",consumes = "application/json", produces = "application/json")
    public List<Patient> viewPatientDetails(@RequestBody Facility facility){


        String factilityName= facility.getFacility();
        String unitName=facility.getUnit();
        System.out.println(facilityDao.getFacility(factilityName,unitName));
        int id=facilityDao.getFacility(factilityName,unitName);
        System.out.println(ptdao.getPatient(id));
        List<Patient> patientsList=ptdao.getPatient(id);

        return patientsList;
    }
}
