package w5Assignment;

public class IceCream extends DessertItem {
    protected int cost;
	public IceCream(String name, int cost){
		this.name = name;
		this.cost = cost;
	}
     @Override
     public int getCost(){
    	 return cost;
     }
}
