package W4Assignment;
/**
 * 4. Design and implement a class called Car. You need to create necessary attributes for this class, and method if needed
Define the Car constructor to initialize these values (in that order). Include getter and setter methods for all instance data.
*/
public class Car {
     private String color;
     private String brand;
     private String type;
     private double price;
     
     //Constructors
     public Car(String color, String brand, String type, double price){
    	 this.color = color;
    	 this.brand = brand;
    	 this.type = type;
    	 this.price = price;
     }
     
     //Getter
     public String getColor(){
    	 return this.color;
     }
     public String getBrand(){
    	 return this.brand;
     }
     public String getType(){
    	 return this.type;
     }
     public double getPrice(){
    	 return this.price;
     }
     
     //Setter
     public void setColor(String color){
    	 this.color = color;
     }
     public void setBrand(String brand){
    	 this.brand = brand;
     }
     public void setType(String type){
    	 this.type = type;
     }
     public void setPrice(double price){
    	 this.price = price;
     }
}
