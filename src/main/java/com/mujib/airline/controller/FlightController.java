package com.mujib.airline.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mujib.airline.entities.Flight;
import com.mujib.airline.repos.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	private FlightRepository flightRepos;
	
	@RequestMapping(value="searchFlight", method=RequestMethod.POST)
	public String doSearchFlight(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("departureDate") @DateTimeFormat(pattern="MM-dd-yyyy") Date departureDate, ModelMap modelMap) {
		
		List<Flight> flights = flightRepos.findFlight(from, to, departureDate);
		modelMap.addAttribute("flights", flights);
		return "displayFlights";
	}
	
}
