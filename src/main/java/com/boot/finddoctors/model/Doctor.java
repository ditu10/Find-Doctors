package com.boot.finddoctors.model;

import jakarta.persistence.*;

import java.util.Arrays;

@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    private int id;
    private String name;
    private String email;
    private String designation;
    private String specialization;
    private String phone;
    @Column(length = 2000)
    private String description;
    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] photo;



    public Doctor() {
    }

    public Doctor(String name, String designation, String specialization) {
        this.name = name;
        this.designation = designation;
        this.specialization = specialization;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", designation='" + designation + '\'' +
                ", specialization='" + specialization + '\'' +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                ", photo=" + Arrays.toString(photo) +
                '}';
    }
}
