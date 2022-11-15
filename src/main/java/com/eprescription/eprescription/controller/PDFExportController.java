package com.eprescription.eprescription.controller;

import com.eprescription.eprescription.entity.Patient;
import com.eprescription.eprescription.service.PDFGeneratorService;
import com.eprescription.eprescription.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class PDFExportController {

    private final PDFGeneratorService pdfGeneratorService;
    private final PatientService patientService;

    public PDFExportController(@Autowired PDFGeneratorService pdfGeneratorService,
                               @Autowired PatientService patientService) {
        this.pdfGeneratorService = pdfGeneratorService;
        this.patientService = patientService;
    }

    @GetMapping("export/patient/{id}")
    public void GeneratePDF(HttpServletResponse response,
                            @PathVariable("id") String patientId) throws IOException {
        Long pId = Long.parseLong(patientId);
        Patient exportPatient = patientService.findPatientById(pId);

        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String currentDate = dateFormat.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=e-prescription_" + currentDate + ".pdf";
        response.setHeader(headerKey, headerValue);

        this.pdfGeneratorService.exportPDF(response, exportPatient);
    }
}
