package com.cg.flight.controller;

import java.util.ArrayList;
import java.util.Iterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flight.dto.Flight;
import com.cg.flight.dto.Ticket;
import com.cg.flight.response.Result;
import com.cg.flight.service.IBookingService;


@RestController 
public class FlightController {

	@Autowired
	IBookingService bookingService;
	
	int i=1;
	
	@RequestMapping(value="/scheduleFlight",consumes=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json",produces=MediaType.APPLICATION_JSON_VALUE)
	public Result scheduleFlight(@RequestBody Flight flight)
	{
		ArrayList<Flight> list = bookingService.getAllTicketDetails();
		Result rs = new Result();
	    if(!(list.isEmpty()))
	    {
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Flight f = (Flight) it.next();
			if(f.getFlightNumber()==flight.getFlightNumber())
			{
				rs = new Result("Failure","Flight already exists",null,null);
					}
			else
			{
				rs = new Result("Success",null,null,null);
			}
		}
	    }
	    else
	    rs = new Result("Success",null,null,null);
	    bookingService.scheduleFlight(flight);
		return rs;

	}

	
	@RequestMapping(value="/bookSeat",consumes=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json",produces=MediaType.APPLICATION_JSON_VALUE)
	public Result addFlightDetail(@RequestBody Ticket ticket)
	{
		String c="";
		int no=0;
		ArrayList<Flight> list = bookingService.getAllTicketDetails();	
		Result rn = new Result();
		Ticket t = new Ticket();
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Flight f = (Flight) it.next();
			
				no = f.getNoOfSeats();
				if(i<=no)
				{
					rn = new Result("Success",null,c+i,null);	
					i++;
					
				}
				else
				{
					rn = new Result("Failure","Tickets full",null,null);
					
				}
			}
			
		bookingService.bookTicket(ticket);
		return rn;

	}
	
	
	@RequestMapping(value="/getAvailableSeats/flightNumber={pid}",produces=MediaType.APPLICATION_JSON_VALUE) 
	public Result getProduct(@PathVariable("pid") int i)
	{
		String c="";
		Result rn = new Result();
		Flight p=bookingService.getFlightDetails(i);
		
		if(p==null)
		{
			rn = new Result("Failure",null,null,null);
		
		}
		else
			
			{
			rn = new Result("Success",null,null,c+p.getNoOfSeats());
			
			}
		
		return rn;

	}
	
}

