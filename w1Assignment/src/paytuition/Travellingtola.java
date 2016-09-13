Scenario : Travelling to LA

Description : A tourist is trying to find the cheapest flight to LA.

Objects (with Behaviors and State): 
	Object : tourist
		State : name, Starting
		Behavior : visitSearchingWebsite(), typeStartingAndDestination(), findTheCheapestFlight(), placeOrderForFlight()
	
	
	Object : SearchingWebsite
		State : Collection of Flights
		Behavior : displayAvailableFlights(), directToAirlineWebsite()
		
	Object : Flight
		State : starting, destination, price, airline
		Behavior : getPrice()

		
class Tourist{
	String name;
	String Starting;
	void visitSearchingWebsite(SearchingWebsite sw){}
	void typeStartingAndDestination(){}
	Flight findTheCheapestFlight(Flight[] flights){}
	void placeOrderForFlight(Flight, Airlinewebsite){}
	}
	
}

class SearchingWebsite{
	Flight[] flights; //Array of flights
	Flight[] displayAvailableFlights(){}
	void directToAirlineWebsite(Tourist t, Flight f){}			
}

class Flight{
	String flightstarting;
	String flightdestination;
	Float airline;
	Float getPrice(){}	
}



class TravelToLa{
	public static <flightstarting, flightdestination> void main(String args[]){
		SearchingWebsite google = new SearchingWebsite();


	    Flight starting seattle = new flightstarting;seattle name = "Seattle"
	    Flight destination la = new flightdestination;la name = "Los Angeles"
	    Flight[] flights = {seattle, la};
		
		Tourist jojo = new Tourist();
		jojo.name = "Jojo";
		
		jojo.visitSearchingWebsite(google);
		jojo.typeStartingAndDestination();
		Flight[] flights = google.displayAvailableFlights();
		Flight flight = jojo.findTheCheapestFlight(flights);
		jojo.placeOrderForFlight(flight, airlinewebsite);
		google.directToAirlineWebsite(jojo, airlinewebsite);
	}

}
