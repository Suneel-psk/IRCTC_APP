package in.psk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.psk.entity.Passenger;
import in.psk.entity.Ticket;
import in.psk.repo.TicketRepository;

@Service
public class TicketServiceIml implements TicketService {
	@Autowired
	private TicketRepository ticketRepo;

	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		Ticket t=new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketStatus("Confirmed");
		Ticket savedTicket=ticketRepo.save(t);
		return savedTicket;
	}

	@Override
	public Ticket getTicketByUsingTicketId(Integer tId) {
		
		Optional<Ticket> byId = ticketRepo.findById(tId);
		if(byId.isPresent())
		{
			Ticket ticketDtls=byId.get();
			return ticketDtls;
		}else {
			return null;
		}
		
	}

	@Override
	public List<Ticket> getAllTickets() {
		
		return ticketRepo.findAll();
	}

}
