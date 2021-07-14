package com.cg.flight.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Ticket")
public class Ticket 
{
	
	@Id
	@Column(name="flightNumber")
	private int flightNumber;

	@Column(name="userName")
	private String userName;

	@Column(name="seatNumber")
	private int seatNumber;
	
	public Ticket() {
		super();
	}

	public Ticket(int flightNumber, String userName) {
		super();
		this.flightNumber = flightNumber;
		this.userName = userName;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	@Override
	public String toString() {
		return "Ticket [flightNumber=" + flightNumber + ", userName=" + userName + "]";
	}

}
