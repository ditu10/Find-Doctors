package com.boot.finddoctors.service;

import com.boot.finddoctors.dao.PatientRepository;
import com.boot.finddoctors.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService{
    private PatientRepository repository;

    public PatientRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(PatientRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Patient patient) {
        repository.save(patient);
    }
}
