import java.util.Scanner;

public class Assignment3 {
	// assignments
	/**
	 * Write a method to find N numbers which are power of three. e.g. n=4,
	 * return {1,3,9,27}
	 */
	public int[] findPowerOfThree(int n) {
		if (n <= 0){
			return null;
		}
		int [] pot = new int[n];
		System.out.print("{");
		
         for ( int i = 0 ;i<n ; i++ ){
		    pot[i] = (int) Math.pow(3, i);	
			System.out.print(" " + pot[i] );
			}
		System.out.print("}");
		System.out.println();
         return pot;
		}
	
	

	/**
	 * Given a integer 'n', return n%count, count is the number of digits of n
	 * For example, n = 100, return 1
	 */
	public int countDigits(int n) {
		String length;
		int count;
		length = String.valueOf(n);
		count =length.length();
		System.out.println(n%count);
		 
		return 0;
	}

	/**
	 * Given a integer 'n', if n is odd, print n odd numbers, if n is even,
	 * print n even numbers. For example, n = 3, print 1 3 5 n = 4, print 0 2 4
	 * 6
	 */
	public void printNumbers(int n) {
          if (n%2 == 0){
        	  for (int i = 0; i < 2 * n; i = i + 2){
        		  System.out.print(" " + i);
        	  }
          }
        	  else;
              for (int i = 1; i < 2 * n; i = i + 2){
        	  System.out.print(" " + i);
        	  }   
	}

	/**
	 * Given numRows, generate the first numRows of Pascal's triangle. For
	 * example, given numRows = 5, return: [1] [1,1] [1,2,1] [1,3,3,1]
	 * [1,4,6,4,1]
	 */
	public int[][] generatePascalsTriangle(int n) {
		
			int[][] triangle = new int[n][n];
			
			for(int row = 0; row < n; row++){
				for(int column = 0; column <= row; column++){
					if(row == 0 || column == row)
						triangle[row][column] = 1;
					else
						triangle[row][column] = triangle[row - 1][column - 1] + triangle[row - 1][column];
				}
			}	
			return triangle;
}
		


	/**
	 * Write a function that takes a string as input and reverse only the vowels
	 * of a string. For example: Given s = "hello", return "holle".
	 */
	public String reverseVowels(String s) {
		char[] chars = s.toCharArray();
		String reverseVowels = new String(chars);
		
		int len = s.length();
		int leftFlag = 0;
		int rightFlag = len - 1;
		
		while (leftFlag < rightFlag){
			if(!isVowel(s.charAt(leftFlag))){
				leftFlag++;
				continue;
			}
			if(!isVowel(s.charAt(rightFlag))){
				rightFlag--;
				continue;
			}
			char temp = s.charAt(leftFlag);
			chars[leftFlag] = s.charAt(rightFlag);
			chars[rightFlag] = temp;
			leftFlag++;
			rightFlag--;
		}
		
		return reverseVowels;
	}
	public static boolean isVowel(char character){
		if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == "u"){
			return true;
		}else;
		return false;
	} 

	/**
	 * Given a string s consists of upper/lower-case alphabets and empty space
	 * characters ' ', return the length of last word in the string. If the last
	 * word does not exist, return 0. Note: A word is defined as a character
	 * sequence consists of non-space characters only.
	 */
	public int lengthOfLastWord(String str) {
		String[] words = str.split(" ");
		int size = words.length;
		if (words[words.length - 1] == null)
			return 0;
		    else
			return words[words.length - 1].length();
	}

	/**
	 * Reverse a string by words. Do not use 'split' function. e.g. "I like
	 * soccer" --> "soccer like I"
	 */
	public String reverseString2(String str) {
		StringBuffer reverse = new StringBuffer();
		int h = str.length();
		for (int i = str.length()-1; i >= 0; i--){
			if(str.charAt(i) == ' '){
				h = i;
			}else if(i == 0 || str.charAt(i-1) == ' '){
				if(reverse.length() !=0){
					reverse.append(' ');
				}
			}
		}
		reverse.append(str.substring(i, h));
	
		return reverse.toString();
	}

	// Bonus
	/**
	 * A robot from Mars send a long message to Earth which only contains many
	 * "SOS", like "SOSSOS", "SOSSOSSOSSOSSOS" But the radiation from universe
	 * changed some characters of the massage. Write a method to count how many
	 * characters were changed. For example, "SOSSOSSOS" might be changed to
	 * "SOSSUSSOP", then your method should return 2. The message was consisted
	 * by "SOS" so its length will be multiple of 3. You could assume the
	 * message only contains upper letter.
	 */
	public int checkMessage(String message) {
		int count = 0;
		
		for(int i = 0; i < message.length(); i++){
			if(i % 3 == 0 || i % 3 == 2){
				if(message.charAt(i) != 'S')
					count++;
			}
			else{
				if(i % 3 == 1){
				if(message.charAt(i) != 'O')
					count++;
			}
			}	
		}
		
		return count;
	}

		
		

	




public static void main(String[] args){
	Assignment3 assignment3 = new Assignment3();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter N >= 0");
	int a1 = scanner.nextInt();
	assignment3.findPowerOfThree (a1);
	
	
	System.out.println("Enter N >= 0");
	int a2 = scanner.nextInt();
	assignment3.countDigits (a2);
	
	
	System.out.println("Enter N >= 0");
	int a3 = scanner.nextInt();
	assignment3.printNumbers (a3);
	
	System.out.println("Enter a number (generatePascalsTriangle) :");
	int a4 = scanner.nextInt();
	assignment3.generatePascalsTriangle(a4);
	
	System.out.println("Enter a String (reverseVowels) :");
	int a5 = scanner.nextInt();
	assignment3.reverseVowels(a5);
	
	System.out.println("Enter a String (lengthOfLastWord) :");
	int a6 = scanner.nextInt();
	assignment3.lengthOfLastWord(a6);
	
	System.out.println("Enter a String (reverseString2) :");
	int a7 = scanner.nextInt();
	assignment3.reverseString2(a7);
	
	System.out.println("Enter a String (checkMessage) :");
	int a8 = scanner.nextInt();
	assignment3.checkMessage(a8);
}
}