package com.eprescription.eprescription.service;

import com.eprescription.eprescription.entity.PatientDrug;
import com.eprescription.eprescription.repository.PatientDrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PatientDrugServiceImpl implements PatientDrugService{

    private final PatientDrugRepository pDrugRepo;

    public PatientDrugServiceImpl(@Autowired PatientDrugRepository pDrugRepo) {
        this.pDrugRepo = pDrugRepo;
    }

    @Override
    public PatientDrug savePatientDrug(PatientDrug pDrug) {
        return pDrugRepo.save(pDrug);
    }
}
