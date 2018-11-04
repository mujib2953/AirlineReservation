package com.mujib.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mujib.airline.entities.Flight;
import com.mujib.airline.repos.FlightRepository;

@Controller
public class ReservationController {

	@Autowired
	private FlightRepository flightRepo;
	
	@RequestMapping("/showCompleteReservation")
	public String doShowCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		
		Flight flight = flightRepo.findById(flightId).get();
		modelMap.addAttribute("airline", flight);
		return "completeReservation";
	}

}
