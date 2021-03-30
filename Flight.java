
/*
 * Flight class,
 * Represents an instance of a flight
 */
public class Flight {
	
	private String flightCode;
	private int numberOfSeats;
	private int bookedSeats;
	
	/*
	 * Flight constructor, returns a flight object
	 * @param String code, flight code
	 * @param int numberOfSeats, number of seats on the flight
	 */
	public Flight(String code, int numberOfSeats) {
		flightCode = code;
		this.numberOfSeats = numberOfSeats;
	}
	
	/* 
	 * Make a booking
	 * @return seat number on the flight
	 */
	public int makeBooking() {
		return bookedSeats++;
	}
	
	
	/*
	 * Gets the number of available seats
	 * @return gets the number of available seats
	 */
	public int getAvailableSeats() {
		return numberOfSeats - (bookedSeats+1);
	}
	
	/*
	 * the number of seats, available on the flight
	 * @return numberOfSeats, number of seats
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
}
