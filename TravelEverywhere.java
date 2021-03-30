import java.util.*;
public class TravelEverywhere {
	
	//Question 1
	public static FlightBooking bookFlight(List<Passenger> passenger, Flight flight) {
		if(passenger==null){
			System.out.println("No passengers specified, unable to create booking");
			return null;
		}
		for(Passenger a:passenger){
			if(a==null){
				System.out.println("No passengers specified, unable to create booking");
				return null;
			}
		}
		if(flight==null){
			System.out.println("No flight specified, unable to create booking");
			return null;
		}
		if(passenger.size()>flight.getAvailableSeats()){
			System.out.println("Cannot allocate passengers to flight, unable to create booking");
			return null;
		}
		FlightBooking booking=new FlightBooking(flight);
		for(int i=0;i<passenger.size();i++){
			booking.addPassenger(passenger.get(i));
		}
		return booking;
	}
	
	//Question 2
	public static boolean verifyItinerary(Itinerary itinerary) {
		if(itinerary==null){
			System.out.println("Itinerary not provided, unable to verify");
			return false;
		}else if(itinerary.getCustomer()==null){
			System.out.println("No customer attached, verification failed");
			return false;
		}else if(itinerary.getBookings().size<1){
			System.out.println("No FlightBooking exists,verification failed");
			return false;
		}
		return true;
	}
	
	
}
