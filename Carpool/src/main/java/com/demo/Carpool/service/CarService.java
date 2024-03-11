package com.demo.Carpool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Carpool.entity.Car_details;
import com.demo.Carpool.repository.CarRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CarService {

	private CarRepository carRepository;
	
	
	public CarService(@Autowired CarRepository carRepository) {
		super();
		this.carRepository = carRepository;
	}

	public Car_details AddCarDetails(Car_details details) {
		
		return carRepository.save(details);
	}
	
	public boolean DeleteCarDetails(Car_details details) {
		
		if(carRepository.existsById(details.getCar_id())) {
			carRepository.delete(details);
			return true;
		}
		return false;
	}
	
}
