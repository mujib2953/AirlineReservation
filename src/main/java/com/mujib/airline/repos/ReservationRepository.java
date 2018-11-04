package com.mujib.airline.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mujib.airline.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
