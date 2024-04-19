package in.psk.service;

import java.util.List;

import in.psk.entity.Passenger;
import in.psk.entity.Ticket;

public interface TicketService {

	//BookTicket
	public Ticket bookTicket(Passenger passenger);
	//GetTicketByTicketId
	public Ticket getTicketByUsingTicketId(Integer tId);
	//GetAllTickets
	public List<Ticket> getAllTickets();
}
