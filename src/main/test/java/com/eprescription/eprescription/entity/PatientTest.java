package com.eprescription.eprescription.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

    Patient patient = new Patient();

    @Test
    void getId() {
        patient.setId(100L);
        assertEquals(100L, patient.getId());
    }

    @Test
    void setId() {
        patient.setId(100L);
        assertEquals(100L, patient.getId());
    }

    @Test
    void getFirstName() {
        patient.setFirstName("Test");
        assertEquals("Test", patient.getFirstName());
    }

    @Test
    void setFirstName() {
        patient.setFirstName("Test");
        assertEquals("Test", patient.getFirstName());
    }

    @Test
    void getLastName() {
        patient.setLastName("Test");
        assertEquals("Test", patient.getLastName());
    }

    @Test
    void setLastName() {
        patient.setLastName("Test");
        assertEquals("Test", patient.getLastName());
    }

    @Test
    void getDateOfBirth() {
        patient.setDateOfBirth("1/1/1");
        assertEquals("1/1/1", patient.getDateOfBirth());
    }

    @Test
    void setDateOfBirth() {
        patient.setDateOfBirth("1/1/1");
        assertEquals("1/1/1", patient.getDateOfBirth());
    }

    @Test
    void getPhone() {
        patient.setPhone("210210");
        assertEquals("210210", patient.getPhone());
    }

    @Test
    void setPhone() {
        patient.setPhone("210210");
        assertEquals("210210", patient.getPhone());
    }

    @Test
    void getEmail() {
        patient.setEmail("mail.com");
        assertEquals("mail.com", patient.getEmail());
    }

    @Test
    void setEmail() {
        patient.setEmail("mail.com");
        assertEquals("mail.com", patient.getEmail());
    }

    @Test
    void getFathersName() {
        patient.setFathersName("test");
        assertEquals("test", patient.getFathersName());
    }

    @Test
    void setFathersName() {
        patient.setFathersName("test");
        assertEquals("test", patient.getFathersName());
    }

    @Test
    void getMothersName() {
        patient.setMothersName("test");
        assertEquals("test", patient.getMothersName());
    }

    @Test
    void setMothersName() {patient.setMothersName("test");
        assertEquals("test", patient.getMothersName());
    }

    @Test
    void getAmka() {
        patient.setAmka("test");
        assertEquals("test", patient.getAmka());
    }

    @Test
    void setAmka() {
        patient.setAmka("test");
        assertEquals("test", patient.getAmka());
    }

    @Test
    void getIdCard() {
        patient.setId(100L);
        assertEquals(100L, patient.getId());
    }

    @Test
    void setIdCard() {
        patient.setId(100L);
        assertEquals(100L, patient.getId());
    }

    @Test
    void getCity() {
        patient.setCity("test");
        assertEquals("test", patient.getCity());
    }

    @Test
    void setCity() {
        patient.setCity("test");
        assertEquals("test", patient.getCity());
    }

    @Test
    void getPostalCode() {
        patient.setPostalCode("test");
        assertEquals("test", patient.getPostalCode());
    }

    @Test
    void setPostalCode() {
        patient.setPostalCode("test");
        assertEquals("test", patient.getPostalCode());
    }

    @Test
    void getSymptoms() {
        patient.setSymptoms("test");
        assertEquals("test", patient.getSymptoms());
    }

    @Test
    void setSymptoms() {
        patient.setSymptoms("test");
        assertEquals("test", patient.getSymptoms());
    }

    @Test
    void getPharmacy() {
        patient.setPharmacy("test");
        assertEquals("test", patient.getPharmacy());
    }

    @Test
    void setPharmacy() {
        patient.setPharmacy("test");
        assertEquals("test", patient.getPharmacy());
    }

    @Test
    void getDoctorsName() {
        patient.setDoctorsName("test");
        assertEquals("test", patient.getDoctorsName());
    }

    @Test
    void setDoctorsName() {
        patient.setDoctorsName("test");
        assertEquals("test", patient.getDoctorsName());
    }

    @Test
    void getMessage() {
        patient.setMessage("test");
        assertEquals("test", patient.getMessage());
    }

    @Test
    void setMessage() {
        patient.setMessage("test");
        assertEquals("test", patient.getMessage());
    }
}