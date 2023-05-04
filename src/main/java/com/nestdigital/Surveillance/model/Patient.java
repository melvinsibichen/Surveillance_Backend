package com.nestdigital.Surveillance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue()
    private int id;
    private  String name;
    private  String age;
    private  String gender;
    private  String mrn;
    private  int hr;
    private  int sbp;
    private  int tc;
    private  int los;
    private  int sb;
    private int unit_id_fk;

    public Patient() {
    }

    public Patient(int id, String name, String age, String gender, String mrn, int hr, int sbp, int tc, int los, int sb, int unit_id_fk) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mrn = mrn;
        this.hr = hr;
        this.sbp = sbp;
        this.tc = tc;
        this.los = los;
        this.sb = sb;
        this.unit_id_fk = unit_id_fk;
    }



    public int getUnit_id_fk() {
        return unit_id_fk;
    }

    public void setUnit_id_fk(int unit_id_fk) {
        this.unit_id_fk = unit_id_fk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMrn() {
        return mrn;
    }

    public void setMrn(String mrn) {
        this.mrn = mrn;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getSbp() {
        return sbp;
    }

    public void setSbp(int sbp) {
        this.sbp = sbp;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public int getLos() {
        return los;
    }

    public void setLos(int los) {
        this.los = los;
    }

    public int getSb() {
        return sb;
    }

    public void setSb(int sb) {
        this.sb = sb;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", mrn='" + mrn + '\'' +
                ", hr=" + hr +
                ", sbp=" + sbp +
                ", tc=" + tc +
                ", los=" + los +
                ", sb=" + sb +

                '}';
    }
}
