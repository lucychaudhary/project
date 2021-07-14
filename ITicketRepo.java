package com.cg.flight.dao;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.flight.dto.Ticket;

@Repository 
@Transactional 
public interface ITicketRepo extends JpaRepository<Ticket,String>
{
	
}

