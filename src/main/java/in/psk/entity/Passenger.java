package in.psk.entity;

public class Passenger {

	private String name;
	private String doOfBirth;
	private String dateOfJourney;
	private String gender;
	private String destination;
	private String source;
	private Integer trainNumber;
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
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", doOfBirth=" + doOfBirth + ", dateOfJourney=" + dateOfJourney + ", gender="
				+ gender + ", destination=" + destination + ", source=" + source + ", trainNumber=" + trainNumber + "]";
	}
	
	
}
