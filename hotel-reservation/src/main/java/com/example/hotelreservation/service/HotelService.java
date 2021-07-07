package com.example.hotelreservation.service;

import com.example.hotelreservation.models.Hotel;
import com.example.hotelreservation.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    
    @Autowired
    HotelRepository hotelRepositry;


    public ResponseEntity<Long> addHotel(Hotel hotel) {
        Hotel savedHotel = hotelRepositry.save(hotel);
        return new ResponseEntity<>(savedHotel.getLocality().getId(), HttpStatus.CREATED);
    }

    public ResponseEntity<List<Hotel>> getHotels() {
        return new ResponseEntity<>(hotelRepositry.findAll(), HttpStatus.OK);
    }
}
