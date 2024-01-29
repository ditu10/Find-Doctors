package com.boot.finddoctors.controller;

import com.boot.finddoctors.model.Doctor;
import com.boot.finddoctors.model.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthController {
    @GetMapping("/registerDoctor")
    public String registerDoctor(){
        return "registerDoctor";
    }
    @GetMapping("/registerPatient")
    public String registerPatient(){
        return "registerPatient";
    }

    @PostMapping("/registerDoctor")
    @ResponseBody
    public String handleDoctorRegistration(@ModelAttribute Doctor doctor){
        System.out.println(doctor);
        return doctor.toString();
    }

    @PostMapping("/handlePatientRegister")
    @ResponseBody
    public String handlePatientRegistration(@ModelAttribute Patient patient){
        System.out.println(patient);
        return patient.toString();
    }
}
