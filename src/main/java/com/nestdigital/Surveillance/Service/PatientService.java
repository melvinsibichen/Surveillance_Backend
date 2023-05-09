package com.nestdigital.Surveillance.Service;

import com.nestdigital.Surveillance.model.Facility;
import com.nestdigital.Surveillance.model.Patient;

import java.util.List;

public interface PatientService {
    public List<Patient> getPatientsByUnitId(int id);

}
