package com.demo.Carpool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Carpool.entity.Offer_ride;

@Repository
public interface OfferRideRepositroy extends JpaRepository<Offer_ride, Long>{

}
