package com.nestdigital.Surveillance.controller;


import com.nestdigital.Surveillance.repository.FacilityRepository;
import com.nestdigital.Surveillance.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

//    @Autowired
//
//    public PatientRepository ptdao;
//    @Autowired
//    public FacilityRepository facilityDao;
//    @CrossOrigin(origins = "*")
//    @PostMapping(path = "/getPatients",consumes = "application/json", produces = "application/json")
//    public List<com.nestdigital.Surveillance.model.Patient> viewPatientDetails(@RequestBody com.nestdigital.Surveillance.model.Facility facility){
//
//
//        String factilityName= facility.getFacility();
//        String unitName=facility.get
//        System.out.println(facilityDao.getFacility(factilityName,unitName));
//        int id=facilityDao.getFacility(factilityName,unitName);
//        System.out.println(ptdao.getPatient(id));
//        List<com.nestdigital.Surveillance.model.Patient> patientsList=ptdao.getPatient(id);
//
//        return patientsList;
//    }

}
