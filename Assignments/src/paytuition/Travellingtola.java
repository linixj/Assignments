/*
Scenario : Travelling to LA

Description : A tourist is trying to find the cheapest flight to LA.

Objects (with Behaviors and State): 
	Object : tourist
		State : name, arrivallocation
		Behavior : visitSearchingWebsite(), typeDepartureLocationAndArrivalLocation(), findTheCheapestFlight(), placeOrderForFlight()
	
	
	Object : SearchingWebsite
		State : Collection of Flights
		Behavior : displayAvailableFlights(), directToAirlineWebsite()
		
	Object : Flight
		State : price, departureTime, departureLocation, arrivalTime, arrivalLocation
		Behavior : getPrice()

*/

class Tourist{
	String name;
	String departurelocation;
	String arrivallocation;
	void visitSearchingWebsite(SearchingWebsite sw){}
	Flight findTheCheapestFlight(Flight[] flights){}
	void placeOrderForFlight(Flight, Airlinewebsite){}
	}
	
}

class SearchingWebsite{
	Flight[] flights; 
	Flight[] displayAvailableFlights(){}
	void directToAirlineWebsite(Tourist t, Flight f){}			
}

class Flight{
	String flightstarting;
	String flightdestination;
	String departureTime;
	Float airline;
	Float getPrice(){}	
}



class TravelToLa{
	public static <flightstarting, flightdestination> void main(String args[]){
		SearchingWebsite google = new SearchingWebsite();
		
		Tourist jojo = new Tourist();
		jojo.name = "Jojo";
		
		jojo.visitSearchingWebsite(google);
		jojo.typeDepartureLocationAndArrivalLocation();
		String departureTime = "09/06/2016"
		String departureLocation = "seattle"
		String arrivalLocation = "los angles"
		Flight[] flights = google.displayAvailableFlights();
		Flight flight = jojo.findTheCheapestFlight(flights);
		jojo.placeOrderForFlight(flight, airlinewebsite);
		google.directToAirlineWebsite(jojo, airlinewebsite);
	}

}
