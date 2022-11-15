package com.eprescription.eprescription.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    Doctor doctor = new Doctor();

    @Test
    public void getId() {
        doctor.setId(100L);
        assertEquals(100L, doctor.getId());
    }

    @Test
    public void setId() {
        doctor.setId(100L);
        assertEquals(100L, doctor.getId());
    }

    @Test
    public void getEmail() {
        doctor.setEmail("d@mail.com");
        assertEquals("d@mail.com", doctor.getEmail());
    }

    @Test
    public void setEmail() {
        doctor.setEmail("d@mail.com");
        assertEquals("d@mail.com", doctor.getEmail());
    }

    @Test
    public void getPassword() {
        doctor.setPassword("test");
        assertEquals("test", doctor.getPassword());
    }

    @Test
    public void setPassword() {
        doctor.setPassword("test");
        assertEquals("test", doctor.getPassword());
    }

    @Test
    public void getPhone() {
        doctor.setPhone("210210");
        assertEquals("210210", doctor.getPhone());
    }

    @Test
    public void setPhone() {
        doctor.setPhone("210210");
        assertEquals("210210", doctor.getPhone());
    }
}