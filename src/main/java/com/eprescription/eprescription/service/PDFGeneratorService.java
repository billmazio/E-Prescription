package com.eprescription.eprescription.service;

import com.eprescription.eprescription.entity.Patient;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface PDFGeneratorService {

    public void exportPDF(HttpServletResponse response, Patient patient) throws IOException;

}
