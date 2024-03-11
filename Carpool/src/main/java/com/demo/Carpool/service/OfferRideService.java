package com.demo.Carpool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Carpool.entity.Offer_ride;
import com.demo.Carpool.repository.OfferRideRepositroy;

@Service
public class OfferRideService {

	private OfferRideRepositroy offerRideRepository;
	
	public OfferRideService(@Autowired OfferRideRepositroy offerRideRepository) {
		super();
		this.offerRideRepository = offerRideRepository;
	}

	public Offer_ride AddOfferRequest(Offer_ride offer_ride){

		return offerRideRepository.save(offer_ride);
	}

	public String DeleteOfferRequest(Offer_ride offer_ride) {

		if (offerRideRepository.existsById(offer_ride.getRide_id())) {
			offerRideRepository.delete(offer_ride);
			return "Deleted offer ride request";
		}

		return "Deletion failed";
	}
}
