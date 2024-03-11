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
public class Offer_ride {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ride_id;
	private String pikup_location;
	private String drop_location;
	private String ride_date;
	private String status;
	private Long user_id;
	public Long getRide_id() {
		return ride_id;
	}
	public String getPikup_location() {
		return pikup_location;
	}
	public String getDrop_location() {
		return drop_location;
	}
	public String getRide_date() {
		return ride_date;
	}
	public String getStatus() {
		return status;
	}
	public Long getUser_id() {
		return user_id;
	}
	
}
