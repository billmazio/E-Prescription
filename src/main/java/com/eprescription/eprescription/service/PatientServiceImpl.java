package com.eprescription.eprescription.service;

import com.eprescription.eprescription.entity.Patient;
import com.eprescription.eprescription.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepo;

    public PatientServiceImpl(@Autowired PatientRepository patientRepo) {
        this.patientRepo = patientRepo;
    }

    //create
    @Override
    public Patient savePatient(Patient patient) {
        return patientRepo.save(patient);
    }

    //read
    @Override
    public List<Patient> findAllPatients() {
        return patientRepo.findAll();
    }

    @Override
    public Patient findPatientById(Long patientId) {
        return patientRepo.getById(patientId);
    }

    //update
    @Override
    public Patient updatePatient(Patient patient) {
        return patientRepo.save(patient);
    }

    //delete
    @Override
    public void deletePatientById(Long patientId) {
        patientRepo.deleteById(patientId);
    }

    @Override
    public void deletePatient(Patient patient) {
        patientRepo.delete(patient);
    }


}
