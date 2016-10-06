package W4Assignment;

import java.util.ArrayList;

/**
 * Bonus: 
	Design a java class that encapsulate the data structure Stack (Last in First out). The class has 2 methods:
		(push): method for adding items to stack, the push operation adds items to the top of the list
		(pop): method for retrieving items from the stack. The pop operation removes an item from the top of the list, and returns its value to the caller.
		In the case of overflow the user should be informed with a message
		In the case of underflow, the user should be informed with a message & a value of zero is returned.

		Assumptions: The stack will hold up to 10 integer values.
*/
public class Stack {
    
	private ArrayList list;
    private static int list.MAX_LENGTH = 10;
    
    public Stack(){
    	ArrayList list = new ArrayList();
    } 
    
    public void push(int num){
    	if (getLength() >= MAX_LENGTH){
    		System.out.println("The Stack is full.");
    	}else
    		list.add(num);
    	    System.out.println("Push" + num +"."+"The length is" + getLength());
    	
    }
    public int pop(){
    	if(getLength <= 0){
    		System.out.println("The Stack is empty.");
    		return 0;
    	}else
    		list.remove(num);
    		System.out.println("Pop" + num + "."+"The length is" + getLength());
    	
    }
    public int getLength(){
    	return list.size();
    }
}
