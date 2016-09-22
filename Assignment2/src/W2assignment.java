import java.util.Scanner;

class Person {
	int age;
	boolean gender;// false --> male, true --> female

	Person(int age, boolean gender) {
		this.age = age;
		this.gender = gender;
	}
	// Assignment
			/**
			 * Write a Computer program to find the type of a person and print the type.
			 * Infant : If the age is less than 1 year 
			 * Toddler : If the age is less than 3 and greater than 1 
			 * Pre Schooler : If the age is less than 5 and greater than 3
			 * KG Girl : If the age is greater than 5 and less than 6 and the gender is female 
			 * KG Boy : If the age is greater than 5 and less than 6 and the gender is male
			 */
	public void personType(Person person) {
		if (this.age < 1){
         System.out.println("Infant");
         }
         else;
         if (this.age < 3 && this.age >= 1){
         System.out.println("Toddler");
         }
         else;
         if (this.age < 5 && this.age >= 3){
        	 System.out.println("Pre Schooler");
         }
         else;
         if (this.age < 6 && this.age >= 5 && this.gender == true) {
        	 System.out.println("KG Girl");
         } 
         if (this.age < 6 && this.age >= 5 && this.gender == false) {   
         System.out.println("KG Boy");
         }      
	}

	/**
	 * Given an integer N as input, check the following: If N is odd, print
	 * "Weird". If N is even and, in between the range of 2 and 5(inclusive),
	 * print "Not Weird". If N is even and, in between the range of 6 and
	 * 20(inclusive), print "Weird". If N is even and N>20, print "Not Weird".
	 */
	public void weirdNumber(int n) {
		if (n % 2 == 1){
        	//n = odd;
			System.out.println("Weird");
		}else;
           if (n >= 2 && n <= 5 ){
        	   System.out.println("Not Weird");
           }
           if (n >=6 && n <= 20){
        	   System.out.println("Weird");
           }
           if (n > 20){
        	   System.out.println("Not Weird");
           }
	}

	/**
	 * Write a method to determine whether a number is prime
	 */
	public void isPrime(int n) {
		for (int i = 2; i < n; i++){
		if (n % i == 0){
		System.out.println("It is a prime");
		}
		else;
		System.out.println("It is not a prime");
		}
	}

	/**
	 * Find N fibonacci numbers Fibonacci Number: f(N) = f(N-1)+f(N-2).
	 * Typically, f(0)=f(1)=1.
	 */
	public int[] fibonacciNumber(int n) {
	   if (n < 0){
		   System.out.println("There is no fibonacci numbers");
		   return null;
	   }
	   if (n == 1){
		   System.out.println("fiboNum = 1");
	   }
	   else;
	   int[] fiboNum = new int[n] ;
	   for (int i = 2; i < n; i++){
		   fiboNum[i] = fiboNum[i - 1] + fiboNum[i - 2];
	   }
	   return fiboNum; 
	}
	   
	  

	/**
	 * Write a function that takes a string as input and returns the string
	 * reversed. Given s = "hello", return "olleh".
	 */
	public String reverseString(String s) {
		char[] in = s.toCharArray();
		int begin=0;
		int end=in.length-1;
		char temp;
		while(end>begin){
			temp = in[begin];
			in[begin]=in[end];
			in[end] = temp;
			end--;
			begin++;
		}
		return new String(in);
	}

	/**
	 * Given an array of nums, write a function to find the largest two integer.
	 */
	public int[] findTheLargestTwo(int[] nums) {
		int largestA = Integer.MIN_VALUE, largestB = Integer.MIN_VALUE;
		
		for(int num : nums){
			if(num > largestA){
				largestB = largestA;
				largestA = num;
			} else if (num > largestB){
				largestB = num;
			}
		}
		return new int[] {largestA, largestB};
	}

	/**
	 * Given an array nums, write a function to move all 0's to the end of it
	 * while maintaining the relative order of the non-zero elements. For
	 * example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
	 * should be [1, 3, 12, 0, 0].
	 */
	public void moveZeroes(int[] nums) {
          int m = -1;// index of first 0 in array
          for (int i = 0; i < nums.length; i++){
        	  if (num[i] == 0){
        		  if (m == -1){
        			  m = i;
        		  }
        	  }else {
        		  if (m != -1){
        			  //swap with first 0 in array
        			  num[m++] = nums[i];
        			  nums[i] = 0;
        		  }
        	  }
          }
	}

	// Bonus
	/**
	 * Given a non-negative integer n, repeatedly add all its digits until the
	 * result has only one digit. For example: Given n = 38, the process is
	 * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	 */
	public int addDigits(int n) {
		if(n < 0){
			System.out.println("It's a negative number");
			return -1;
		}
		
		int a=n/10;
		int b=n%10;
		if (a == 0){
			return n;
		}
		return addDigits(a+b);
		
	}

	/**
	 * Write a program to check whether a given number is an ugly number. Ugly
	 * numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * For example, 6, 8 are ugly, while 14 is not ugly since it includes
	 * another prime factor 7. Note that 1 is typically treated as an ugly
	 * number.
	 */
	public boolean isUgly(int n) {
		return false;
	}

}
