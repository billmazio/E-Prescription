package com.eprescription.eprescription.controller;

import com.eprescription.eprescription.entity.Doctor;
import com.eprescription.eprescription.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Objects;

@Controller
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView("doctorLogin");
        mav.addObject("doctor", new Doctor());
        return mav;
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("doctor")Doctor doctor) {
        Doctor oauthDoctor = doctorService.login(doctor.getEmail(), doctor.getPassword());
        if (oauthDoctor != null) {
            return "redirect:/allPatients";
        }
        else {
            return "registration";
        }
    }

    @GetMapping("/register")
    public ModelAndView register() {
        ModelAndView mav = new ModelAndView("registration");
        mav.addObject("doctor", new Doctor());
        return mav;
    }

    @PostMapping("/sign-up")
    public String register(Doctor doctor){
        Doctor newDoctor = doctorService.save(doctor);
        return "redirect:/login";
    }


}
