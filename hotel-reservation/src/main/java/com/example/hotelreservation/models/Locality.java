package com.example.hotelreservation.models;

import javax.persistence.*;

@Entity
public class Locality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private Integer zipCode;
    private boolean isActive;
    private String address;

    @Enumerated(EnumType.STRING)
    private Country country;

    public Locality(){}

    public Locality(String city, Integer zipCode, boolean isActive, String address, Country country) {
        this.city = city;
        this.zipCode = zipCode;
        this.isActive = isActive;
        this.address = address;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
