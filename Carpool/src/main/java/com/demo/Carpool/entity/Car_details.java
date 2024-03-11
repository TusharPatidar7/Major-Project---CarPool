package com.demo.Carpool.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Car_details {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long car_id;
	private String type;
	private String registration_no;
	private Long seats;
	private String features;
	private Long user_id;
	public Long getCar_id() {
		return car_id;
	}
	public String getType() {
		return type;
	}
	public String getRegistration_no() {
		return registration_no;
	}
	public Long getSeats() {
		return seats;
	}
	public String getFeatures() {
		return features;
	}
	public Long getUser_id() {
		return user_id;
	}
	
}
