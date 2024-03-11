package com.demo.Carpool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Carpool.entity.Pool_ride;
import com.demo.Carpool.repository.PoolRideRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor  //Generates a constructor with required arguments.Required arguments are final fields and fields with constraints such as @NonNull. 
public class PoolRideService {

	private PoolRideRepository poolRideRepository;
	
	public PoolRideService(@Autowired PoolRideRepository poolRideRepository) {
		super();
		this.poolRideRepository = poolRideRepository;
	}

	public Pool_ride AddPoolRequest(Pool_ride pool) {
		
		return poolRideRepository.save(pool);
	}

	public String DeletePoolRequest(Pool_ride pool) {
		
		if(poolRideRepository.existsById(pool.getPool_id())) {
			poolRideRepository.delete(pool);
		}
		else {
			return "Pool request doesn't exist!";
		}
		
		return "Deleted pool request";
	}
	
	
}
