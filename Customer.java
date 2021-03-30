import java.util.List;
import java.util.ArrayList;

public class Customer {
	private String firstName;
	private String lastName;
	private List<Itinerary> itineraryHistory;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		itineraryHistory = new ArrayList<Itinerary>();
	}
	
	/*
	 * Retrieves the first name of the customer
	 * @return firstname
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/*
	 * Retrieves the last name of the customer
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/*
	 * Retrieves itinerary history
	 * @return itineraryHistory
	 */
	public List<Itinerary> history() {
		return itineraryHistory;
	}
	
}
