package com.nestdigital.Surveillance.controller;


import com.nestdigital.Surveillance.dao.PatientDao;
import com.nestdigital.Surveillance.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientDao ptdao;
    @CrossOrigin(origins = "*")
    @GetMapping("/viewpatients")
    public List<Patient>viewPatientDetails(){
        return ptdao.findAll();
    }
}
