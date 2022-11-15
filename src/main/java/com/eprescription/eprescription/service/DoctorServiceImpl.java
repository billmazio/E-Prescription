package com.eprescription.eprescription.service;

import com.eprescription.eprescription.entity.Doctor;
import com.eprescription.eprescription.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    private DoctorRepository doctorRepo;

    //login
    @Override
    public Doctor login(String email, String password) {
        Doctor doctor = doctorRepo.findByEmailAndPassword(email, password);
        return doctor;
    }

    //register
    @Override
    public Doctor save(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

}
