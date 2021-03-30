public class Passenger {
	
	private String firstName;
	private String lastName;
	
	public Passenger(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/*
	 * Retrieves the first name of the passenger
	 * @return firstname
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/*
	 * Retrieves the last name of the passenger
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	
}
