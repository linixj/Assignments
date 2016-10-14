package w5Assignment;

public class Candy extends DessertItem {
     protected double pound;
     protected int pricePerPound;
	
     public Candy(String name, double pound, int pricePerPound){
    	 super(name);
    	 this.pound = pound;
    	 this.pricePerPound = pricePerPound;
     }
     
     @Override
     public int getCost(){
    	 return (int) Math.round(pound * pricePerPound);
     }
     public int getPricePerPound(){
    	 return pricePerPound;
     }
     public double getPound(){
    	 return pound;
     }

}
