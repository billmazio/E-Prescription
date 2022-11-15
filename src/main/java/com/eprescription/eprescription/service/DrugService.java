package com.eprescription.eprescription.service;

import com.eprescription.eprescription.entity.Drug;

import java.util.List;

public interface DrugService {

    //read
    List<Drug> findAllDrugs();

    Drug findDrugById(Long id);

}
