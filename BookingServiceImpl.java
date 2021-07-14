package com.cg.flight.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flight.dao.IFlightRepo;
import com.cg.flight.dao.ITicketRepo;
import com.cg.flight.dto.Flight;
import com.cg.flight.dto.Ticket;


@Service
@Transactional
public class BookingServiceImpl implements IBookingService{

	@Autowired
	IFlightRepo flightDao;
	
	@Autowired
	ITicketRepo ticketDao;
	
	@Override
	public Flight getFlightDetails(int i) {

		return flightDao.getFlightDetails(i);
	}
	@Override
	public ArrayList<Flight> getAllTicketDetails() {

		return flightDao.getAllTicketDetails();
	}
	
	@Override
	public Flight scheduleFlight(Flight flight) {
		
		return flightDao.save(flight);
	}
	
	@Override
	public Ticket bookTicket(Ticket ticket) {
		
		return ticketDao.save(ticket);
	}
	
}

