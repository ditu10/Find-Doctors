package com.boot.finddoctors.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Arrays;

@Table(name = "patients")
@Entity
public class Patient {
    @Id
    private int id;
    private String email;
    private String name;
    private LocalDate dob;
    private String phone;
    private String gender;
    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] photo;

    public Patient() {
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", photo=" + Arrays.toString(photo) +
                '}';
    }
}
