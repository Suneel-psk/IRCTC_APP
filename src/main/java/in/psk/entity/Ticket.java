package in.psk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {
	@Id
	@GeneratedValue
	private Integer tId;
	private Integer trainNumber;
	private String ticketStatus;
	private String name;
	private String doOfBirth;
	private String dateOfJourney;
	private String gender;
	private String destination;
	private String source;
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDoOfBirth() {
		return doOfBirth;
	}
	public void setDoOfBirth(String doOfBirth) {
		this.doOfBirth = doOfBirth;
	}
	public String getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Integer getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(Integer trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	@Override
	public String toString() {
		return "PassengerDtls [tId=" + tId + ", name=" + name + ", doOfBirth=" + doOfBirth + ", dateOfJourney="
				+ dateOfJourney + ", gender=" + gender + ", destination=" + destination + ", source=" + source
				+ ", trainNumber=" + trainNumber + ", ticketStatus=" + ticketStatus + "]";
	}
	


}
