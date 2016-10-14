package w5Assignment;
import java.util.Vector;

public class Checkout {
	 private Vector<DessertItem> dessertItems;  
	 private final double taxRate;
	
      public Checkout(){
    	  Vector dessertItems = new Vector();
    	  taxRate = DessertShoppe.TAX_RATE;
      }
      public int numberOfItems(){
    	  return dessertItems.size();
      }
      public void enterItem(DessertItem item){
    	  dessertItems.addElement(item);
      }
      public void clear(){
    	  dessertItems.clear();
      }
      public int totalCost(){
    	  int totalCost = 0;
   
    	  for (DessertItem item: dessertItems){
    		  totalCost += item.getCost();
    	  }
    	  return totalCost;
      }
      public int totalTax(){
    	  return Math.round(totalCost() * DessertShoppe.TAX_RATE / 100);
      }
      
      @Override
      public String toString(){
    	  StringBuilder stringBuilder = new StringBuilder();
    	  stringBuilder.append(DessertShoppe.storeName + "\n");
    	  stringBuilder.append("-----------------------" + "\n");
    	  for (DessertItem item: dessertItems){
    		  if (item instanceof Candy){
    			  stringBuilder.append(((((Candy) item).getPound() + "lbs.@" + DessertShoppe.cents2dollarsAndCents(((Candy) item).getPricePerPound()) + "/lb." + "\n")));
    			  stringBuilder.append(item.getName() + "    " + DessertShoppe.cents2dollarsAndCents(item.getCost()) + "\n");
    		  }
    		  else if (item instanceof Cookie){
    			  stringBuilder.append(((Cookie) item).getDozenNumber() + "@" + DessertShoppe.cents2dollarsAndCents(((Cookie) item).getPricePerDozen()) + "/lb." + "\n");
    			  stringBuilder.append(item.getName() + "    " + DessertShoppe.cents2dollarsAndCents(item.getCost()) + "\n");
    		  }
    		  
    		  else if (item instanceof Sundae){
    			  stringBuilder.append(((Sundae) item).getToppingName() + "Sundae with" + "\n");
    			  stringBuilder.append(item.getName() + "     " + DessertShoppe.cents2dollarsAndCents(item.getCost()) + "\n");
    		  }
    		  else if (item instanceof IceCream){
    			  stringBuilder.append(item.getName() + "     " + DessertShoppe.cents2dollarsAndCents(item.getCost()) + "\n");
    		  }
    	  }
    	  stringBuilder.append("\n");
    	  stringBuilder.append("Tax    " + DessertShoppe.cents2dollarsAndCents(totalTax()) + "\n");
    	  stringBuilder.append("Total Cost     " + DessertShoppe.cents2dollarsAndCents(totalCost() + totalTax()) + "\n");
    	  return new String(stringBuilder);
    	  
      }

}
