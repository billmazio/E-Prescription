package com.eprescription.eprescription.repository;

import com.eprescription.eprescription.entity.PatientDrug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDrugRepository  extends JpaRepository<PatientDrug, Long> {
}
