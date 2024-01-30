package com.boot.finddoctors.service;

import com.boot.finddoctors.dao.DoctorRepository;
import com.boot.finddoctors.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService{
    private DoctorRepository repository;

    public DoctorRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(DoctorRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Doctor doctor) {
        repository.save(doctor);
    }
}
