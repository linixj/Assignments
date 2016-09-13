Scenario : Order for delivery

Description : A consumer is going to order a delivery through phone calls.

Objects (with Behaviors and State): 
	Object : Consumer
		State : name, address, phone number
		Behavior : callStorePhoneNumber(), orderForDelivery(), acceptDeliveryFromStore(), payForDelivery()
	
	
	Object : Store
		State : phone number
		Behavior : takeOrdersFromTheConsumer(), shipPackageToTheAddress(), acceptMoneyFromConsumer()
	
	Object : Package 
		State : name, price
		Behavior : getPrice()
	
	Object: Money
	    State: amount

class Consumer{
	String name;
	String address;
	String phonenumber;
	void callStorePhoneNumber(){}
	void orderForDelivery(Consumer c , Package p){}
	Money payForDelivery (Store s){}
}

class Store{
	void takeOrdersFromTheConsumer(Consumer c, Package p){}
	void shipPackageToTheAddress(Consumer c, Book b){}
	void acceptMoneyFromConsumer(Consumer c, Money money){}
			
}

class Package{
	String name, price;
	Float price;
	Float getPrice(){}
	String getName(){}

}

class Money{
	float amount;
}

class ShoppingOnline{
	public static void main(String args[]){
		Store grubhub = new Store();

		Package thaifood = new Package();thaifood.name = "Thai Food";
		Package curryfood = new Package();curryfood.name = "Curry Food";
		Package[] Packages = {thaifood, curryfood};

		Consumer jojo = new Consumer();
		jojo.name = "Jojo";
		
		jojo.callStorePhoneNumber(grubhub);
		jojo.orderForDelivery(package, grubhub);
		grubhub.shipPackageToTheAddress(jojo);
		jojo.acceptDeliveryFromStore(grubhub);
		Money money = jojo.payForDelivery(grubhub);
		grubhub.acceptMoneyFromConsumer(jojo, money);
	}

}