package com.eprescription.eprescription.service;

import com.eprescription.eprescription.entity.Patient;
import com.eprescription.eprescription.entity.PatientDrug;
import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

@Service
public class PDFGeneratorServiceImpl implements PDFGeneratorService {

    @Override
    public void exportPDF(HttpServletResponse response, Patient patient) throws IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        //create a new document and set the font-family, font-size
        document.open();
        Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA, Font.UNDERLINE);
        fontTitle.setSize(18);
        Font underlined = FontFactory.getFont(FontFactory.HELVETICA, Font.UNDERLINE);
        Font fontParagraph = FontFactory.getFont(FontFactory.HELVETICA, "UTF-8");
        fontParagraph.setSize(12);

        //document title
        Paragraph title = new Paragraph("Electronic Prescription", fontTitle);
        title.setAlignment(Paragraph.ALIGN_CENTER);
        title.setSpacingAfter(20);

        //photograph
        String url = "https://images.fineartamerica.com/images-medium-large-5/pharmacy-the-chemist-shop-mike-savad.jpg";
        Image image = Image.getInstance(url);
        image.scaleToFit(526, 500);
        document.add(image);

        //main text
        Paragraph empty = new Paragraph(" ");
        Paragraph fName = new Paragraph("First Name:    " + patient.getFirstName(), fontParagraph);
        fName.setAlignment(Element.ALIGN_LEFT);
        fName.setSpacingAfter(10);

        Paragraph lName = new Paragraph("Last Name:     " + patient.getLastName(), fontParagraph);
        lName.setAlignment(Element.ALIGN_LEFT);
        lName.setSpacingAfter(10);

        Paragraph amka = new Paragraph("Amka:       " + patient.getAmka(), fontParagraph);
        amka.setAlignment(Element.ALIGN_LEFT);
        amka.setSpacingAfter(10);

        Paragraph symptoms = new Paragraph("Symptoms:       " + patient.getSymptoms(), fontParagraph);
        symptoms.setAlignment(Element.ALIGN_LEFT);
        symptoms.setSpacingAfter(10);


        PatientDrug patientRecentDrug = patient.getPatientDrugSet().stream()
                .max(Comparator.comparing(PatientDrug::getCreatedAt)).stream().findFirst().orElse(null);

        String mostRecentDrug = "No recent Drugs";
        if (patientRecentDrug != null) {
            mostRecentDrug = patientRecentDrug.getDrug().getDrugName();
        }

        Paragraph drugs = new Paragraph("Patient's Drugs:       " + mostRecentDrug, fontParagraph);
        drugs.setAlignment(Element.ALIGN_LEFT);
        drugs.setSpacingAfter(8);
        List list = new List(true, 10);


        Paragraph pharmacy = new Paragraph("Pharmacy:       " + patient.getPharmacy(), fontParagraph);
        pharmacy.setAlignment(Element.ALIGN_LEFT);
        pharmacy.setSpacingAfter(10);

        Paragraph message = new Paragraph("Message:         " + patient.getMessage(), fontParagraph);
        message.setAlignment(Element.ALIGN_LEFT);
        message.setSpacingAfter(20);

        Paragraph doctorName = new Paragraph("Doctor:       " + patient.getDoctorsName(), fontParagraph);
        doctorName.setAlignment(Element.ALIGN_LEFT);

        document.add(title);
        document.add(fName);
        document.add(lName);
        document.add(amka);
        document.add(symptoms);
        document.add(drugs);
        document.add(pharmacy);
        document.add(message);
        document.add(doctorName);

        document.close();

    }
}