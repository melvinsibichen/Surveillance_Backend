package com.nestdigital.Surveillance.controller;


import com.nestdigital.Surveillance.Service.PatientService;
import com.nestdigital.Surveillance.model.Patient;
import com.nestdigital.Surveillance.repository.FacilityRepository;
import com.nestdigital.Surveillance.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;
    @CrossOrigin("*")
    @GetMapping(value = "/getPatientsByUnit/{id}",produces = "application/json")
    public List<Patient> getPatientsByUnit(@PathVariable("id")int id){
        return patientService.getPatientsByUnitId(id);
    }
}
