package w5Assignment;

public class Cookie extends DessertItem {
       protected int dozenNumber;
       protected int pricePerDozen;
       
       public Cookie (String name, int dozenNumber, int pricePerDozen){
    	   super(name);
    	   this.dozenNumber = dozenNumber;
    	   this.pricePerDozen = pricePerDozen;
       }
       
       @Override
       public int getCost(){
    	   int cost = dozenNumber * pricePerDozen / 12;
    	   return (int) Math.round(cost);
       }
       public int getDozenNumber(){
    	   return dozenNumber;
       }
       public int getPricePerDozen(){
    	   return pricePerDozen;
       }
	

}
