package w5Assignment;

public class Sundae extends IceCream {
     protected String toppingName;
     protected int toppingCost;
     
     public Sundae(String iceCreamName, int iceCreamCost, String toppingName, int toppingCost){
    	 super(iceCreamName, iceCreamCost);
    	 this.toppingName = toppingName;
    	 this.toppingCost = toppingCost;
     }
     
     @Override
     public int getCost(){
    	 return super.getCost() + toppingCost;
     }
     public String getToppingName(){
    	 return toppingName;
     }
}
