package com.nestdigital.Surveillance.model;

import jakarta.persistence.*;

import java.lang.annotation.Target;
import java.util.List;

@Entity
@Table(name = "facilitydetails")
public class Facility {

    @Id
    @GeneratedValue()
    private int id;
    private String facility;

    @OneToMany(targetEntity = Unit.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "facility_fk",referencedColumnName = "id")
    private List<Unit> units;


    public Facility(int id, String facility, List<Unit> units) {
        this.id = id;
        this.facility = facility;
        this.units = units;
    }

    public Facility() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }
}
