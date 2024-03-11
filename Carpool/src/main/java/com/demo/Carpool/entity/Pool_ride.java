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
public class Pool_ride {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pool_id;
	private String pikup_location;
	private String drop_location;
	private String ride_date;
	private String status;
	private Long seats;
	private Long user_id;
	public Long getPool_id() {
		return pool_id;
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
	public Long getSeats() {
		return seats;
	}
	public Long getUser_id() {
		return user_id;
	}
}
