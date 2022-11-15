package com.eprescription.eprescription.service;

import com.eprescription.eprescription.entity.Doctor;
import com.eprescription.eprescription.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface DoctorService {

    //login
    public Doctor login(String email, String password);

    //register
    public Doctor save(Doctor doctor);
}
