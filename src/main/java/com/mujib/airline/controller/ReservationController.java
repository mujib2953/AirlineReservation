package com.mujib.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mujib.airline.dto.ReservationRequest;
import com.mujib.airline.entities.Flight;
import com.mujib.airline.entities.Reservation;
import com.mujib.airline.repos.FlightRepository;
import com.mujib.airline.services.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private ReservationService reservationService;

	@RequestMapping("/showCompleteReservation")
	public String doShowCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {

		Flight flight = flightRepo.findById(flightId).get();
		modelMap.addAttribute("airline", flight);
		return "completeReservation";
	}

	@RequestMapping(value = "/completeReservation", method = RequestMethod.POST)
	public String doCompleteReservation(ReservationRequest request, ModelMap modelMap) {
		
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation created successfully and Id is " + reservation.getId());
		return "reservationConfirmation";
	}

}
