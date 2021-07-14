package com.cg.flight.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flight")
public class Flight 
{
	
	@Id
	@Column(name="flightNumber")
	private int flightNumber;

	@Column(name="noOfSeats")
	private int noOfSeats;

	public Flight() {
		super();
		
	}

	public Flight(int flightNumber, int noOfSeats) {
		super();
		this.flightNumber = flightNumber;
		this.noOfSeats = noOfSeats;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", noOfSeats=" + noOfSeats + "]";
	}

}

