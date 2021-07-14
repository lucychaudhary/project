package com.cg.flight.dao;

import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.flight.dto.Flight;


@Repository 
@Transactional 
public interface IFlightRepo extends JpaRepository<Flight,String>
{
	@Query("SELECT prod FROM Flight prod WHERE prod.flightNumber=:pi")
	public Flight getFlightDetails(@Param("pi") int i);
	
	@Query("SELECT list FROM Flight list")
	public ArrayList<Flight> getAllTicketDetails();
	
}

