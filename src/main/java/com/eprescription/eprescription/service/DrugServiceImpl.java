package com.eprescription.eprescription.service;

import com.eprescription.eprescription.entity.Drug;
import com.eprescription.eprescription.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DrugServiceImpl implements DrugService {

    private final DrugRepository drugRepo;

    public DrugServiceImpl(@Autowired DrugRepository drugRepo) {
        this.drugRepo = drugRepo;
    }

    @Override
    public List<Drug> findAllDrugs() {
        return drugRepo.findAll();
    }

    @Override
    public Drug findDrugById(Long id) {
        return drugRepo.getById(id);
    }

}
