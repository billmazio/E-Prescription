package com.eprescription.eprescription.service;

import com.eprescription.eprescription.entity.Patient;
import java.util.List;

public interface PatientService {

    //create
    Patient savePatient(Patient patient);

    //read
    List<Patient> findAllPatients();

    Patient findPatientById(Long patientId);

    //update
    Patient updatePatient(Patient patient);

    //delete
    void deletePatientById(Long patientId);

    void deletePatient(Patient patient);


}
