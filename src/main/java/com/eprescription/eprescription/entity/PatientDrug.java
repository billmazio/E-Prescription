package com.eprescription.eprescription.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PatientDrug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patients")
    private Patient patients;

    @ManyToOne
    @JoinColumn(name = "drugs")
    private Drug drugs;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    public PatientDrug() {
    }

    public PatientDrug(Patient patient, Drug drug, Date createdAt) {
        this.patients = patient;
        this.drugs = drug;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatients() {
        return patients;
    }

    public void setPatients(Patient patient) {
        this.patients = patient;
    }

    public Drug getDrug() {
        return drugs;
    }

    public void setDrug(Drug drug) {
        this.drugs = drug;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
