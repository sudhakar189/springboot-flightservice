package com.sudhakar.springcloud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudhakar.springcloud.model.Flight;
import com.sudhakar.springcloud.repos.FlightRepo;

@RestController
@RequestMapping("/flightsapi")
public class FlightRestController {
	
	@Autowired
	FlightRepo repo;
	
	@GetMapping("/flights")
	public List<Flight> getAllFLights(){
		return repo.findAll();
	}

}
