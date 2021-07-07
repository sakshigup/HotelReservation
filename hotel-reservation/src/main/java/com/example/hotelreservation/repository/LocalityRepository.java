package com.example.hotelreservation.repository;

import com.example.hotelreservation.models.Locality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalityRepository extends JpaRepository<Locality, Locality> {
}
