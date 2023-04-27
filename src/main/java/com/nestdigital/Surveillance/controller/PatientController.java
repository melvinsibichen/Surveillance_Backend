package com.nestdigital.Surveillance.controller;


import com.nestdigital.Surveillance.dao.PatientDao;
import com.nestdigital.Surveillance.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientDao ptdao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/getPatients",consumes = "application/json", produces = "application/json")
    public List<Patient>viewPatientDetails(@RequestBody Patient patient){
        return ptdao.getPatient(patient.getFacilityName(),patient.getUnitName());
    }
}
