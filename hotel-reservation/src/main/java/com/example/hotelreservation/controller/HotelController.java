package com.example.hotelreservation.controller;

import com.example.hotelreservation.models.Hotel;
import com.example.hotelreservation.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/hotels")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @PostMapping("/addHotel")
    public ResponseEntity<Long> addHotel(@RequestBody Hotel hotel){
        return hotelService.addHotel(hotel);
    }

    @GetMapping("/getHotels")
    public ResponseEntity<List<Hotel>> getHotels(){return hotelService.getHotels();}
}
