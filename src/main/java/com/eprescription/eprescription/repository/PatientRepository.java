package com.eprescription.eprescription.repository;

import com.eprescription.eprescription.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    public void deletePatientByAmka(Long amka);
}
