package com.sudhakar.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudhakar.springcloud.model.Flight;

public interface FlightRepo extends JpaRepository<Flight, Long>{

}
