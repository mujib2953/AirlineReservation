package com.mujib.airline.services;

import com.mujib.airline.dto.ReservationRequest;
import com.mujib.airline.entities.Reservation;


public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);

}
