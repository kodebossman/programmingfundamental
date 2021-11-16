package com.company.kuda.farmer;

import java.time.LocalDate;
import java.util.Objects;

public class Farmer {

    private String idNumber;
    private String name;
    private String surname;
    private String location;
    private LocalDate dateOfBirth;
    private String village;
    private int ward;

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getVillage() {
        return village;
    }

    public int getWard() {
        return ward;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public void setWard(int ward) {
        this.ward = ward;
    }
}
