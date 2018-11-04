package com.mujib.airline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mujib.airline.dto.ReservationRequest;
import com.mujib.airline.entities.Flight;
import com.mujib.airline.entities.Passanger;
import com.mujib.airline.entities.Reservation;
import com.mujib.airline.repos.FlightRepository;
import com.mujib.airline.repos.PassangerRepository;
import com.mujib.airline.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private PassangerRepository passangerRepo;
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
		// --- here payment take place if payment is successful then only the reservation take place. 
		
		Long flightId = request.getFlightId();
		Flight flight = flightRepo.findById(flightId).get();
		
		Passanger passanger = new Passanger();
		
		passanger.setFirstName(request.getPassangerFirstName());
		passanger.setLastName(request.getPassangerLastName());
		passanger.setMiddleName(request.getPassangerMiddleName());
		
		passanger.setEmail(request.getPassangerEmail());
		passanger.setPhone(request.getPassangerPhone());
		
		Passanger savedPassanger = passangerRepo.save(passanger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassanger(savedPassanger);
		reservation.setCheckedIn(false);
		
		Reservation savedReservation = reservationRepo.save(reservation);
		return savedReservation;
	}

}
