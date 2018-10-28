package com.mujib.airline.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mujib.airline.entities.Passanger;

public interface PassangerRepository extends JpaRepository<Passanger, Long> {

}
