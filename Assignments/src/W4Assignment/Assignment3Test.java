package W4Assignment;
/**
 * 1. Write JUnitTest for all the problems in assignemnt3.
 */
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import org.junit.Assert;
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
		Assignment3 test = new Assignment3();
		Assert.assertTrue((test).countDigits(100) == 1);
		Assert.assertTrue(test.countDigits(1300) == 0);
	}

  }


public class printNumbersTest{
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	@Test
	public void test(){
		Assignment3 test = new Assignment3();
		
		int[] output = {1,3,5};
		Assert.assertArrayEquals(test.printNumbers(3), output);
		int[] output1 = {0,2,4,6};
		Assert.assertArrayEquals(test.printNumbers(4), output1);
	}
}

public class pascalsTriangleTest{
	@Test
	public void test(){
		Assignment3 test = new Assignment3();
		
		int[][] output = {{1},{1,1},{1,2,1}};
		assertArrayEquals(test.generate(3), output);
	}
}

public class reverseVowelsTest{
	@Test
	public void test(){
		Assignment3 test = new Assignment3();
		assertEquals(test.reverseVowels("hello"), "holle");
		assertEquals(test.reverseVowels("apple"), "eppla");
	}
}

public class lengthOfLastWordTest{
	@Test
	public void test(){
		Assignment3 test = new Assignment3();
		assertTrue(test.lengthOfLastWord("   apple") == 5);
		assertTrue(test.lengthOfLastWord("apple  Pass  ") == 0);
	}
}

public class reverseString2Test{
	@Test
	public void test(){
		Assignment3 test = new Assignment3();
		String output = test.reverseString2("I love cheese");
		assertEquals("cheese love I", output);
	}
}

public class checkMessage{
	@Test
	public void test(){
		Assignment3 test = new Assignment3();
		assertTrue(test.checkMessage("SOSSOSSOS") == 0);
		assertTrue(test.checkMessage("S0SSSSSOP") == 3);
		assertTrue(test.checkMessage("COASCESAS") == 5);
	}
}
}





	
