package paytuition;

Objects (with Behaviors and State): 
	Object : tourist
		State : airbnb username, airbnb password
		Behavior : logInAirbnb(), findHouses(), requestToBookHouse(), MakePaymentToHostOnAirbnb()
	
	
	Object : airbnb website
		State : Collection of houses
		Behavior : displayAvailableHouses(), submitRequestToHost(), confirmRequestToTourist(), acceptMoneyFromTourist()
	
	Object : house
		State : name, address, price, host
		Behavior : getPrice(), getAddress()
	
	Object : Money
		state : amount	

class Tourist{
	String airbnbusername;
	String airbnbpassword;
	public String name;
	void openAirbnbWebsite(AirbnbWebsite aw){}
	void loginInAirbnbWebsite(AirbnbWebsite aw){}
	House findTheHouseInterestedIn(){}
	void requestToBookHouse(House houses){}
	Money MakePaymentToHostOnAirbnb(AirbnbWebsite aw){}
	
}

class AirbnbWebsite{
	House[] houses; //Sorts of House
	House[] displayAvailableHouses(){}
	void submitRequestToHost(){}
	void confirmRequestToTourist(){}
	void acceptMoneyFromConsumer(){}
			
}

class House{
	String name, address, host;
	Float price;
	Float getPrice(){}
	String getAddress(){}

}

class Money{
	float amount;
}

class BookingAnAirbnb{
	public static void main(String args[]){
		Website airbnb = new Website();

		House theCairns = new House();theCairns.name = "The Cairns";
		House[] houses = {'The Cairns'};

		Tourist jojo = new Tourist();
		jojo.name = "Jojo";
		
		jojo.visitsWebsite(airbnb);
		jojo.loginInAirbnbAccount(AirbnbWebsite);
		House[] houses = airbnb.displayAvailableHouses();
		Book book = jojo.findTheHouseInterestedIn( houses , airbnb);
		jojo.requestToBookHouse(house, airbnb)
		airbnb.confirmRequestToTourist()
		Money money = jojo.payMoneyToHostOnAirbnb(airbnb);
		airbnb.acceptMoneyFromTourist(jojo, money);
	}

}

