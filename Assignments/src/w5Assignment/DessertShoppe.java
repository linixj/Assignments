package w5Assignment;

public class DessertShoppe {
       public static final float TAX_RATE = 6.5f;
	   public static final String storeName = "M & M Dessert Shoppe";
	   public static final int maxSizeOfItemName = 100;
	   public static final int widthOfDisplayCost = 10;
  
	   public static String cents2dollarsAndCents(int cents){
		   StringBuilder stringBuilder = new StringBuilder();
		   int numberBeforeDecimal = cents / 100;
		   int numberAfterDecimal = cents % 100;
		   stringBuilder.append(numberBeforeDecimal <= 0?"" :numberBeforeDecimal);
		   stringBuilder.append(".");
		   stringBuilder.append(numberAfterDecimal < 10? "0" + numberAfterDecimal: numberAfterDecimal);
		   return new String(stringBuilder);
	   }
}
