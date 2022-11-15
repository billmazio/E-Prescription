package com.eprescription.eprescription.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "drugs")
public class Drug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "name")
    private String drugName;

    @Column (name = "description")
    private String description;

    @Column (name = "dosage")
    private String dosage;

    @Column (name = "side_effects")
    private String sideEffects;

    @OneToMany (mappedBy = "drugs")
    private Set<PatientDrug> drugPatientSet;

    public Drug() {
    }

    public Drug(Long id, String drugName, String description) {
        this.id = id;
        this.drugName = drugName;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public Set<PatientDrug> getDrugPatientSet() {
        return drugPatientSet;
    }

    public void setDrugPatientSet(Set<PatientDrug> patientDrugsSet) {
        this.drugPatientSet = patientDrugsSet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Drug{");
        sb.append("id=").append(id);
        sb.append(", drugName='").append(drugName).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
