package com.boot.finddoctors.controller;

import com.boot.finddoctors.model.Doctor;
import com.boot.finddoctors.model.Patient;
import com.boot.finddoctors.model.User;
import com.boot.finddoctors.service.DoctorService;
import com.boot.finddoctors.service.PatientService;
import com.boot.finddoctors.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Controller
public class AuthController {
    private UserService userService;
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private PatientService patientService;

    public UserService getUserService() {
        return userService;
    }
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registerDoctor")
    public String registerDoctor(){
        return "registerDoctor";
    }
    @GetMapping("/registerPatient")
    public String registerPatient(){
        return "registerPatient";
    }

    @GetMapping("/registerUser")
    public String registerUser(){
        return "registerUser";
    }

    @PostMapping("/handleDoctorRegister")
    public String handleDoctorRegistration(@ModelAttribute Doctor doctor, Model model) {
        System.out.println(doctor);
        doctorService.save(doctor);
        return "doctor";
    }


    @PostMapping("/handlePatientRegister")
    public String handlePatientRegistration(@ModelAttribute Patient patient, Model model){
        System.out.println(patient);
        patientService.save(patient);
        return "patient";
    }

    @PostMapping("/handleUserRegister")
    public String handleUserRegistration(@ModelAttribute User user, Model model){
        List<User> users =  userService.findUserByEmail(user.getEmail());
        System.out.println(users);
        if(users.isEmpty()){
            return "redirect:/registerUser";
        }
        User res = userService.save(user);
        System.out.println(res);
        if(user.getRole() == 0){
            return "registerPatient";
        }else{
            return "registerDoctor";
        }
    }
}
