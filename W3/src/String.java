
public class String {
   public int findCountIInString(String string){
	   char[] charactersInString = string.toCharArray();
	   int count = 0;
	   for( char ch : charactersInString){
		   if (ch == 'i'){
			   count++;
		   }
	   }
	   return count;
   }
   public static void main(String args[]){
	   System.out.println("");
   }
}

public String reverseString(String s){
	String reversed = "";
	for (int i = s.length() - 1; i>0; i--){
		reversed + = s.charAt(i);
	}
	return reversed;
}

public static void main1(String args[]){
	char[] charactersInString1 = string.toCharArray();
	
}


