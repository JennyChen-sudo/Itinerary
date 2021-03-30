import java.util.List;
import java.util.ArrayList;

public class Itinerary {
	
	private Customer customer;
	private List<FlightBooking> bookings;
	/*
	 * Itinerary constructor, 
	 * Accepts a customer object
	 */
	public Itinerary(Customer c) {
		customer = c;
		bookings = new ArrayList<FlightBooking>();
	}
	
	
	/*
	 * Adds a flight booking to the internal flight booking
	 * list;
	 */
	public void appendFlightBooking(FlightBooking f) {
		bookings.add(f);
	}
	
	/*
	 * Returns the customer attached to the Itinerary object
	 */
	public Customer getCustomer() {
		return customer;
	}
	
	/*
	 * Returns a list of bookings
	 */
	public List<FlightBooking> getBookings() {
		return bookings;
	}
	
	
}
