import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment3Test {

	@Test
	public void test() {
		Assignment3 test = new Assignment3();
		int[] output = {1,3,9,27};
		assertArrayEquals(test.findPowerOfThree(4), output);
		int[] output1 = null;
		assertArrayEquals(test.findPowerOfThree(-1), output1);
	}
	
public class countDigitsTest{
	@Test
	public void test(){
		countDigitsTest test = new countDigitsTest();
		Assert.assertTrue((test).countDigits(100) == 1);
		Assert.assertTrue(test.countDigits(1300) == 0);
	}

  }

}

public class printNumbersTest{
	@Test
	public void test(){
		int[] output = {1,3,5};
		assertArrayEquals(test.prinNumbers(3), output);
		int[] output1 = {0,2,4,6};
		assertArrayEquals(test.prinNumber(4), output1);
	}
}

public class pascalsTriangleTest{
	@Test
	public void test(){
		pascalTriangle test = new pascalTriangle();
		int[][] output = {{1},{1,1},{1,2,1}};
		assertArrayEquals(test.generate(3), output);
	}
}

public class reverseVowelsTest{
	@Test
	public void test(){
		reverseVowels test = new reverseVowels();
		assertEquals(test.reverseVowels("hello"), "holle");
		assertEquals(test.reverseVowels("apple"), "eppla");
	}
}

public class lengthOfLastWordTest{
	@Test
	public void test(){
		lengthOfLastWord test = new lengthOfLastWord();
		assertTrue(test.lengthOfLastWord("   apple") == 5);
		assertTrue(test.lengthOfLastWord("apple  Pass  ") == 0);
	}
}

public class reverseString2Test{
	@Test
	public void test(){
		reverseString2 test = new reverseString2();
		int output = test.reverseString2("I love cheese");
		assertEquals("cheese love I", output);
	}
}

public class checkMessage{
	@Test
	public void test(){
		checkMessage test = new checkMessage();
		assertTrue(test.checkMessage("SOSSOSSOS") == 0);
		assertTrue(test.checkMessage("S0SSSSSOP") == 3);
		assertTrue(test.checkMessage("COASCESAS") == 5);
	}
}





	
