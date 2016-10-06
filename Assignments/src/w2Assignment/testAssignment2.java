package w2Assignment;

public class testAssignment2 {
	
	public int[] fibonacciNumber(int n) {
		   if (n <= 0){
			   System.out.println("There is no fibonacci numbers");
			   return null;
		   }
		   int[] fiboNum = new int[n];
		   fiboNum[0] = 1;
		   if (n == 1){
			   return fiboNum;
		   }else{
			   fiboNum[1] = 1;
			   for (int i = 2; i < n; i++){
				   fiboNum[i] = fiboNum[i - 1] + fiboNum[i - 2];
			   }
		   }
		   return fiboNum; 
		}

	public static void main(String[] args) {
		testAssignment2 ta = new testAssignment2();
		int[] res = ta.fibonacciNumber(3);
		for(int i = 0; i < res.length; i++)
			System.out.println(res[i]);

	}
public String reverseString1(String s) {
	return new StringBuilder(s).reverse().toString();
}

}


