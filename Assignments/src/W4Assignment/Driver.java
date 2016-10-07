package W4Assignment;
/**
 * 5. Combine with problem 3 and 4, define a class named Driver that contains methods like drive and addGas so that the driver can drive the car.
*/
public class Driver {
   private String name;
   private double gadGasLevel;
   
   public Driver(String name){
	   this.name = name;
   }
   
   public void addGas(double amount){
	   GasTank tank = new GasTank();
	   tank.addGas(amount);
   }
   
   public void getGasLevel(){
	   GasTank tank = new GasTank();
	   tank.getGasLevel();
   }
   
   public void driveCar(){
	   System.out.println("Car is running");
   }
}
