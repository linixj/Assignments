/*
 Scenario : Order for delivery
 

Description : A consumer is going to order a delivery through phone calls.

Objects (with Behaviors and State): 
	Object : Consumer
		State : name, address, phone number
		Behavior : callStorePhoneNumber(), orderForDelivery(), acceptDeliveryFromStore(), payForDelivery()
	
	
	Object : Store
		State : phone number
		Behavior : takeOrdersFromTheConsumer(), deliverGoodsToTheAddress(), acceptMoneyFromConsumer()
	
	Object : Goods 
		State : name, price
		Behavior : getPrice()
	
	Object: Money
	    State: amount
*/

class Consumer{
	String name;
	String address;
	String phonenumber;
	void callStorePhoneNumber(Store store){}
	void orderForDelivery(Consumer c , Goods g){}
	Money payForDelivery (Store s){}
}

class Store{
	Goods[] goods;
	void takeOrdersFromTheConsumer(Consumer c, Goods g){}
	void deliverGoodsToTheAddress(String address){}
	void acceptMoneyFromConsumer(Consumer c, Money money){}
			
}

class Goods{
	String name;
	Float price;
	Float getPrice(){}
	String getName(){}

}

class Money{
	float amount;
}

class OrderForDelivery{
	public static void main(String args[]){
		Store grubhub = new Store();

		Goods thaifood = new Goods();
		thaifood.name = "Thai Food";
		Goods curryfood = new Goods();
		curryfood.name = "Curry Food";
		Goods[] Packages = {thaifood, curryfood};

		Consumer jojo = new Consumer();
		jojo.name = "Jojo";
		
		jojo.callStorePhoneNumber(grubhub);
		jojo.orderForDelivery(goods);
		grubhub.deliverGoodsToTheAddress(jojo);
		jojo.acceptDeliveryFromStore(grubhub);
		Money money = jojo.payForDelivery(grubhub);
		grubhub.acceptMoneyFromConsumer(jojo, money);
	}

}