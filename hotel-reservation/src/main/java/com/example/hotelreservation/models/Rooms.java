package com.example.hotelreservation.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Rooms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "HOTEL_ID", referencedColumnName = "ID")
    private Hotel hotel;
    private String displayName;
    private boolean isActive;
    private Integer quantity;
    private Integer price;

    @ManyToMany
    @JoinTable(name = "ROOMS_FACILITY",
    joinColumns = { @JoinColumn(name = "ROOM_ID")}, inverseJoinColumns = {@JoinColumn(name = "FACILITY_ID")})
    private List<Facilities> facilities = new ArrayList<Facilities>();
}
