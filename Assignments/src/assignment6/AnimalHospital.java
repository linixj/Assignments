package assignment6;

import java.util.ArrayList;

public class AnimalHospital {
     ArrayList<Pet> pet = new ArrayList<Pet>();
     
     
     public void printPetInfoByName(String name){
    	 for(Pet p:pet){
    		 if(p.getPetName() == name){
    			 System.out.println(p.toString());
    		 }
    	 }
     }
     
     public void printPetInfoByOwner(String name){
    	 for(Pet p:pet){
    		 if(p.getOwnerName() == name){
    			 System.out.println(p.toString());
    		 }
    	 }
     }
     public void printPetsBoarding(int month, int day,int year){
    	 for(Pet p:pet){
    		 Boardable boardable = (Boardable)p;
    		 if(boardable.boarding(month, day, year))
    			 System.out.println(p.toString());
    	 }
     }
     public static void main(String[] args){
    	 AnimalHospital ah = new AnimalHospital();
    	 Cat cat = new Cat("cat", "jojo", "black", "short");
    	 cat.setSex(2);
    	 cat.setBoardStart(10, 20, 2016);
    	 cat.setBoardEnd(11, 1, 2016);
    	 ah.pet.add(cat);
    	 ah.printPetsBoarding(6, 5, 2017);
     }
}
