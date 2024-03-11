package com.demo.Carpool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Carpool.entity.Car_details;

@Repository
public interface CarRepository extends JpaRepository<Car_details, Long>{

}
