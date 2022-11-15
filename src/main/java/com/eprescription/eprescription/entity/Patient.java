package com.eprescription.eprescription.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "dob")
    private String dateOfBirth;

    @NotEmpty(message = "Phone number may not be empty")
    @Size(min = 10, max = 10)
    @Column(name = "phone")
    private String phone;

    @NotEmpty(message = "Email may not be empty")
    @Size(min = 7, max = 50)
    @Column(name = "email")
    private String email;

    @Column(name = "fathers_name")
    private String fathersName;

    @Column(name = "mothers_name")
    private String mothersName;

    @Column(name = "amka")
    @Size(min = 11, max = 11)
    @Pattern(regexp = "^[0-9]+$", message = "AMKA must contain only numbers")
    private String amka;

    @Column(name = "id_card")
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "ID must contain only letters and numbers")
    private String idCard;

    @Column(name = "city")
    private String city;

    @Column(name = "postal_code")
    @Size(min = 5, max = 5)
    @Pattern(regexp = "^[0-9]+$", message = "PC must contain only numbers")
    private String postalCode;

    @Column(name = "symptoms")
    private String symptoms;

    @Column(name = "pharmacy")
    private String pharmacy;

    @Column(name = "doctor_name")
    private String doctorsName;

    @Column(name = "message")
    private String message;

    @OneToMany(mappedBy = "patients")
    private Set<PatientDrug> patientDrugSet;

    public Patient() {
    }

    public Patient(Long id, String firstName, String lastName, String dateOfBirth, String phone, String email,
                   String fathersName, String mothersName, String amka, String idCard, String city,
                   String postalCode, String symptoms, String pharmacy, String doctorsName, String message) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.amka = amka;
        this.idCard = idCard;
        this.city = city;
        this.postalCode = postalCode;
        this.symptoms = symptoms;
        this.pharmacy = pharmacy;
        this.doctorsName = doctorsName;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getAmka() {
        return amka;
    }

    public void setAmka(String amka) {
        this.amka = amka;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }

    public String getDoctorsName() {
        return doctorsName;
    }

    public void setDoctorsName(String doctorsName) {
        this.doctorsName = doctorsName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Set<PatientDrug> getPatientDrugSet() {
        return patientDrugSet;
    }

    public void setPatientDrugSet(Set<PatientDrug> patientDrugSet) {
        this.patientDrugSet = patientDrugSet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Patient{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append(", phone=").append(phone);
        sb.append(", email='").append(email).append('\'');
        sb.append(", fathersName='").append(fathersName).append('\'');
        sb.append(", mothersName='").append(mothersName).append('\'');
        sb.append(", amka=").append(amka);
        sb.append(", idCard='").append(idCard).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", postalCode=").append(postalCode);
        sb.append('}');
        return sb.toString();
    }

}
