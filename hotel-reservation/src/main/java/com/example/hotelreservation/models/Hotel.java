package com.example.hotelreservation.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private boolean isActive;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "LOCALITY_ID", referencedColumnName = "ID")
    private Locality locality;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "HOTEL_FACILITY",
    joinColumns = {@JoinColumn(name = "HOTEL_ID")},
    inverseJoinColumns = {@JoinColumn(name = "FACILITY_ID")})
    private Set<Facilities> facilities = new HashSet<>();

    public Hotel(){}
    public Hotel(String name, String description, boolean isActive, Locality locality, Set<Facilities> facilities) {
        this.name = name;
        this.description = description;
        this.isActive = isActive;
        this.locality = locality;
        this.facilities = facilities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Locality getLocality() {
        return locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }

    public Set<Facilities> getFacilities() {
        return facilities;
    }

    public void setFacilities(Set<Facilities> facilities) {
        this.facilities = facilities;
    }
}
