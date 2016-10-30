package midterm;

import java.util.HashSet;

public class Midterm {
 
	/*
	 * 1. Say you have Given a string which consists of lowercase or uppercase letters, find the length of 
	 * the longest palindromes that can be built with those letters.
	 * This is case sensitive, for example "Aa" is not considered a palindrome here.
	 */
	 public int longestPalindrome(String s){
		   HashSet c = new HashSet();
		   
		   int count = 0;
		   for(int i = 0; i < s.length(); i++){
			   if(c.contains(s.charAt(i))){
				   c.remove(s.charAt(i));
				   count++;
				   continue;
			   }
			   c.add(s.charAt(i));
		   }
		   
		   int num = 1;
		   if(c.size() == 0){
			   num = 0;
		   }
		   return count*2+num;
	 }
	
	 /*
	  * 2. an array for which the ith element is the price of a given stock on day i. Design an algorithm to find 
	  * the maximum profit. You may complete as many transactions as you like(ie, buy one and sell one share of 
	  * the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, 
	  * you must sell the stock before you buy again).
	  */
	 public int maxProfit(int[] prices){
		if(prices.length < 2){
			return 0;
		}
		
		int maxProfit = 0;
		for(int i = 1; i< prices.length; i++){
			int diff = prices[i] - prices[i-1];
			if (diff > 0){
				maxProfit += diff;
			}
		}
		return maxProfit;
	 }
	 
	 /*
	  * 3. Given a column title as appear in an Excel sheet, return its corresponding column number.
	  * For example: A -> 1, B ->2, ...Z -> 26, AA ->27, AB ->28
	  */
	 public int titleToNumber(String title){
			if(title == null || title.length() == 0){
				return 0;
			}
		    int sum = 0;
			int s = 1;
			for(int i = title.length(); i >= 0; i--){	// i should be initialized as title.length() -1, or it will be out of bounds;
				sum += (title.charAt(i) - 'A' +1) * s;	// -2;
				s *= 26;
			}
			return sum;
		  }
	 
	 
	 /*
	  * BONUS
	  * Given an unsorted array of integers(no duplicates), count the pairs in which there are two numbers and
	  * they add up to a specific target number. The array is given as follows:
	  * For example:
	  * Input: nums={2, 7, 11, 15}, target=9, there is one pair {2,7} so return: 1
	  * Input: nums={2, 7, 11, 15}, target=10, there is no pair so return 0.
	  * Input: nums={1,5,2,4,3,6}, target=7, there is are three pairs{1,6}, {2,5}, {3,4} so return 3.
	  * Note: {1,2} and {2,1} are regarded as the same pair.
	  * More-Bonus: If you can do it in O(N) time, you will get extra 5 points.
	  */
	 public int twoSum(int[] nums, int target){
		 int counter = 0;
		 HashSet<Integer> s = new HashSet<Integer>();
		 for(int i = 0; i< nums.length; i++){
			 if(s.contains(target - nums[i])){	// your program will never go into the if{} block;
				 counter++;			// think about it; 
				 s.add(nums[i]);
			 }
		 }	
		 return counter;
	 }
}
