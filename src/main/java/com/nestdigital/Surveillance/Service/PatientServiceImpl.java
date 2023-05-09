package com.nestdigital.Surveillance.Service;

import com.nestdigital.Surveillance.model.Patient;
import com.nestdigital.Surveillance.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{
    @Autowired
    public PatientRepository patientRepository;


    @Override
    public List<Patient> getPatientsByUnitId(int id) {
        return patientRepository.getPatientByUnitId(id);
    }
}
