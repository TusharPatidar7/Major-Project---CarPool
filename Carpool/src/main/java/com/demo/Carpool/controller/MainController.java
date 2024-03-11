package com.demo.Carpool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Carpool.entity.Car_details;
import com.demo.Carpool.entity.Offer_ride;
import com.demo.Carpool.entity.Pool_ride;
import com.demo.Carpool.entity.User;
import com.demo.Carpool.service.CarService;
import com.demo.Carpool.service.OfferRideService;
import com.demo.Carpool.service.PoolRideService;
import com.demo.Carpool.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class MainController {

	private UserService userService;
	private CarService carService;
	private PoolRideService poolRideService;
	private OfferRideService offerRideService;	
	
	public MainController(@Autowired UserService userService, @Autowired CarService carService,
			@Autowired PoolRideService poolRideService, @Autowired OfferRideService offerRideService) {
		super();
		this.userService = userService;
		this.carService = carService;
		this.poolRideService = poolRideService;
		this.offerRideService = offerRideService;
	}

//UserService Methods
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		return userService.registerUser(user);
	}
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) {
		return userService.loginUser(user);
	}
	
	@GetMapping("/get")
	public List<User> getAllUserDetails(){
		return userService.allUsers();
	}
	
//CarService Methods
	
	@PostMapping("add/car")
	public Car_details addCar(@RequestBody Car_details car_details) {
		return carService.AddCarDetails(car_details);
	}
	
	@PostMapping("delete/car")
	public String deleteCar(@RequestBody Car_details car_details){
		
		if(carService.DeleteCarDetails(car_details)) {
			return "Deleted";
		}
		return "Not Deleted";
	}
	
// OfferRideService Methods
	
	@PostMapping("offer/add")
	public Offer_ride addOffer(@RequestBody Offer_ride offer_ride) {
		
		return offerRideService.AddOfferRequest(offer_ride);
	}
	
	@PostMapping("offer/remove")
	public String removeOffer(@RequestBody Offer_ride offer_ride) {
		
		return offerRideService.DeleteOfferRequest(offer_ride);
	}

// PoolRideService Methods
	
	@PostMapping("pool/add")
	public Pool_ride addPool(@RequestBody Pool_ride pool_ride) {
		
		return poolRideService.AddPoolRequest(pool_ride);
	}
	
	@PostMapping("pool/remove")
	public String removePool(@RequestBody Pool_ride pool_ride) {
		
		return poolRideService.DeletePoolRequest(pool_ride);
	}
}
