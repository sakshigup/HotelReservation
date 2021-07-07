package com.example.hotelreservation.repository;

import com.example.hotelreservation.models.Facilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilitiesRepository extends JpaRepository<Facilities, Long> {
}
