
public class loops {
     
	public static void findMultiplesOfThree(int number){
		for(int index=1; index < number;index++){
			if (index%3==0){
				System.out.println(index);
				continue;
			}
			System.out.println(index + "is not mutiple of 3");
		}
	}
	public void findFizzBuzz(){
		for(int c=1; c < 25; c++){
			if (c%3==0){
				if (c%5==0)
				System.out.println("FizzBuzz");
				continue;
			}System.out.println("Fizz");
			
			if (c%5==0){
				System.out.println("Buzz");
			}
		}
	}
	
	public static void main(String args[]){
    	findMultiplesOfThree(13);
		for (int count = 0; count < 5; count = count + 1){
    		 System.out.println("Hello");
    	 }
    	 System.out.println("-----------------");
    	 
    	 int counter = 0;
    	 for(;;){
    		 if (counter >= 5){
    			 break;
    		 }
    		 System.out.println("Hello");
    		 counter = counter + 1;
    	 }
    	 
    	 int count = 0;
    	 while (count <= 5){
    		 System.out.println("Hello");
    		 count++;
    	 }	 
     }
}






    	 
         


