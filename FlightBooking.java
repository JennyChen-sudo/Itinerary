import java.util.List;
import java.util.ArrayList;

/*
 * Flight booking class
 */
public class FlightBooking {
	private Flight flight;
	private List<Passenger> passengers;
	
	/*
	 * The Flight Booking class
	 * @param Flight f, flight object
	 */
	public FlightBooking(Flight f) {
		flight = f;
		passengers = new ArrayList<Passenger>();
	}
	
	/*
	 * Returns the flight object associated with the booking
	 * @return flight object
	 */
	public Flight getFlight() {
		return flight;
	}
	
	/*
	 * Add a passenger to the flight booking
	 * @param Passenger p, passenger to be added
	 */
	public void addPassenger(Passenger p) {
		passengers.add(p);
	}
	
	/*
	 * Returns the passenger list
	 * @return list passenger. All entities must be not null
	 */
	public List<Passenger> getPassengers() {
		return passengers;
	}
	
}
