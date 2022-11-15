package com.eprescription.eprescription.controller;

import com.eprescription.eprescription.entity.Drug;
import com.eprescription.eprescription.entity.Patient;
import com.eprescription.eprescription.entity.PatientDrug;
import com.eprescription.eprescription.service.DrugService;
import com.eprescription.eprescription.service.PatientDrugService;
import com.eprescription.eprescription.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class PatientController {

    private final PatientService patientService;
    private final DrugService drugService;
    private final PatientDrugService pDrugService;

    public PatientController(@Autowired PatientService patientService,
                             @Autowired DrugService drugService,
                             @Autowired PatientDrugService pDrugService) {
        this.patientService = patientService;
        this.drugService = drugService;
        this.pDrugService = pDrugService;

    }

    @GetMapping("/newPatient")
    public ModelAndView register() {
        ModelAndView mav = new ModelAndView("patientForm");
        mav.addObject("patient", new Patient());
        mav.addObject("drugs", drugService.findAllDrugs());
        return mav;
    }

    @PostMapping("/patient/save")
    public String createPatient(Patient patient) {
        patientService.savePatient(patient);
        return "redirect:/allPatients";
    }

    @GetMapping("/allPatients")
    public String getAllPatients(Model model) {
        List<Patient> patientList = patientService.findAllPatients();
        model.addAttribute("patientList", patientList);
        return "patients";
    }

    @GetMapping("/prescribeDrugs/{id}")
    public ModelAndView prescribeDrugs(@PathVariable("id") String patientId) {
        ModelAndView mav = new ModelAndView("patientformEdit");
        Long pId = Long.parseLong(patientId);
        Patient formPatient = patientService.findPatientById(pId);
        mav.addObject("patient", formPatient);
        mav.addObject("drugs", drugService.findAllDrugs());
        return mav;
    }

    @PostMapping("/prescribeDrugs/patient/{id}")
    public String prescribePatientDrugs(Patient patient, @PathVariable("id") String id,
                                @ModelAttribute(value = "drugs") Long drugId) {
        Long pId = Long.parseLong(id);
        Patient updatedPatient = patientService.findPatientById(pId);
        Drug drug = drugService.findDrugById(drugId);
        updatedPatient.setEmail(patient.getEmail());
        updatedPatient.setPhone(patient.getPhone());
        updatedPatient.setCity(patient.getCity());
        updatedPatient.setSymptoms(patient.getSymptoms());
        updatedPatient.setPharmacy(patient.getPharmacy());
        updatedPatient.setDoctorsName(patient.getDoctorsName());
        updatedPatient.setMessage(patient.getMessage());

        PatientDrug patientDrug = new PatientDrug(patient, drug, new Date());
        pDrugService.savePatientDrug(patientDrug);

        updatedPatient.getPatientDrugSet().add(patientDrug);
        patientService.updatePatient(updatedPatient);
        return "redirect:/allPatients";
    }

    @GetMapping("/editPatient/{id}")
    public ModelAndView editPatient(@PathVariable("id") String patientId) {
        ModelAndView mav = new ModelAndView("patientFormEdit2Update");
        Long pId = Long.parseLong(patientId);
        Patient formPatient = patientService.findPatientById(pId);
        mav.addObject("patient", formPatient);
        return mav;
    }

    @PostMapping("/updatePatient/patient/{id}")
    public String updatePatient(Patient patient, @PathVariable("id") String id) {
        Long pId = Long.parseLong(id);
        Patient updatedPatient = patientService.findPatientById(pId);
        updatedPatient = patient;
        updatedPatient.setMessage(patient.getMessage());

        patientService.updatePatient(updatedPatient);
        return "redirect:/allPatients";
    }


    @GetMapping("delete/{id}")
    public String deletePatientById(@PathVariable("id") String patientId) {
        Long pId = Long.parseLong(patientId);
        Patient deletedPatient = patientService.findPatientById(pId);
        patientService.deletePatient(deletedPatient);
        return "redirect:/allPatients";
    }

}
