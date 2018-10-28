package com.mujib.airline.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mujib.airline.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
