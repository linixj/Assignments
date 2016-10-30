package assignment6;

public class Cat extends Pet implements Boardable {
       private String hairLength;
       private int startMonth;
       private int startDay;
       private int startYear;
       private int endMonth;
       private int endDay;
       private int endYear;
       
       public Cat(String name, String ownerName, String color, String hairLength){
    	   super(name, ownerName, color);
    	   this.hairLength = hairLength;
       }
       
       public String getHairLength(){
    	   return hairLength;
       }
       @Override
       public String toString(){
    	   StringBuffer sb = new StringBuffer();
   		   sb.append("CAT:\n");
   		   sb.append(getPetName() + " owned by " + getOwnerName() + "\n");
   		   sb.append("Color: " + getColor() + "\n");
   		   sb.append("Sex: " + getSex() + "\n");
   		   sb.append("Hair: " + hairLength + "\n");
           return sb.toString();
       }
       
       @Override
       public void setBoardStart(int month, int day, int year){
    	   this.startMonth = month;
    	   this.startDay = day;
    	   this.startYear = year;
       }
      
      @Override 
      public void setBoardEnd(int month, int day, int year){
    	  this.endMonth = month;
    	  this.endDay = day;
    	  this.endYear = year;
      }
    
      @Override 
      public boolean boarding(int month, int day, int year){
    	  if (month < 1 || month > 12 || day < 1 || day > 31 || year > 9999) {
              System.out.println("Error entering");
            }else if(year > endYear || year < startYear) {
            	return false;
            }else if(year == startYear){
            	if(month < startMonth){
            		return false;
            	}else if (month == startMonth){
            		if(day < startDay){
            			return false;
            		}
            	}else if (year == endYear){
            		if(month > endMonth){
            			return false;
            		}else if(month == endMonth){
            			if(day > endDay){
            				return false;
            			}
            		}
            	}
            }
    	    
            return true;
       }
      public static void main(String[] args){
    	  Cat Tom = new Cat("Tom", "Bob","black", "short");
    	  Tom.setSex(3);
      }
      
}
