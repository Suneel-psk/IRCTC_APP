package in.psk.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.psk.entity.Passenger;
import in.psk.entity.Ticket;
import in.psk.service.TicketService;

@RestController
public class PassengersRestController {
	@Autowired
	private TicketService ticketServ;

	@PostMapping(value="/ticket",consumes="application/json",produces="text/plain")
	public ResponseEntity<String> ticketBooking(@RequestBody Passenger passenger) {
		ticketServ.bookTicket(passenger);
		return new ResponseEntity<>("Ticket Booked", HttpStatus.CREATED);
	}
	@GetMapping(value="/ticket/{tId}",produces="application/json")
	public ResponseEntity<Ticket> getTicketByTicketId(@PathVariable("tId")Integer tId)
	{
		Ticket ticketDtls=ticketServ.getTicketByUsingTicketId(tId);
		return new ResponseEntity<>(ticketDtls,HttpStatus.OK);
		
	}
	@GetMapping(value="/ticket",produces="application/json")
	public ResponseEntity<List<Ticket>> getAllTickets()
	{
		List<Ticket> allTickets=ticketServ.getAllTickets();
	return new ResponseEntity<>(allTickets,HttpStatus.OK);
	}

}
