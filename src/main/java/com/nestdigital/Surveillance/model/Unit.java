package com.nestdigital.Surveillance.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Units")

public class Unit {

    @Id
    @GeneratedValue
    private int id;
    private String unit;
    private int bed;

    @OneToMany(targetEntity = Patient.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "unit_fk",referencedColumnName = "id")
    private List<Patient> patients;


    public Unit() {
    }

    public Unit(int id, String unit, int bed, List<Patient> patients) {
        this.id = id;
        this.unit = unit;
        this.bed = bed;
        this.patients = patients;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getId() {
        return id;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


}
