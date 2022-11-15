package com.eprescription.eprescription.controller;

import com.eprescription.eprescription.entity.Drug;
import com.eprescription.eprescription.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DrugController {

    private final DrugService drugService;

    public DrugController(@Autowired DrugService drugService) {
        this.drugService = drugService;
    }



}
