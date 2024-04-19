package in.psk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.psk.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Integer>{

}
