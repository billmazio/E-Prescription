package com.eprescription.eprescription.entity;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class DrugTest {

    Drug drug = new Drug();

    @Test
    void getId() {
        drug.setId(100L);
        assertEquals(100L, drug.getId());
    }

    @Test
    void setId() {
        drug.setId(100L);
        assertEquals(100L, drug.getId());
    }

    @Test
    void getDrugName() {
        drug.setDrugName("test");
        assertEquals("test", drug.getDrugName());
    }

    @Test
    void setDrugName() {
        drug.setDrugName("test");
        assertEquals("test", drug.getDrugName());
    }

    @Test
    void getDescription() {
        drug.setDescription("test");
        assertEquals("test", drug.getDescription());

    }

    @Test
    void setDescription() {
        drug.setDescription("test");
        assertEquals("test", drug.getDescription());
    }

    @Test
    void getDosage() {
        drug.setDosage("test days");
        assertEquals("test days", drug.getDosage());
    }

    @Test
    void setDosage() {
        drug.setDosage("test days");
        assertEquals("test days", drug.getDosage());
    }

}