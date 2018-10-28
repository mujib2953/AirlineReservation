package com.mujib.airline.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mujib.airline.entities.Reservation;

public interface reservationRepository extends JpaRepository<Reservation, Long> {

}
