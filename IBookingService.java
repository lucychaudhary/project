package com.cg.flight.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.cg.flight.dto.Flight;
import com.cg.flight.dto.Ticket;


@Service
public interface IBookingService {
	
	public Flight getFlightDetails(int i);
	public ArrayList<Flight> getAllTicketDetails();
	public Flight scheduleFlight(Flight flight);
	public Ticket bookTicket(Ticket ticket);
		
}


