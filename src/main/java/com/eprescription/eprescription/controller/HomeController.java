package com.eprescription.eprescription.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    public String showHomePage() {
        return "index";
    }


}
