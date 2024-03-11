package com.demo.Carpool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Carpool.entity.Pool_ride;

@Repository
public interface PoolRideRepository extends JpaRepository<Pool_ride, Long>{

}
