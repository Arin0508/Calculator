import java.beans.Transient;

import org.example.Main;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;


public class CalculatorTest {
	private Main calculator;
	public void setUp()
	{
		calculator = new Main();
	}
	@Test 
	public void test_add_positive()
	{
		int a = 1;
		int b = 2;
		int expectedResult = 3;
		Assert.assertEquals(expectedResult, calculator.add(a, 
		b));	
	}
	@Test
	public void test_add_negative()
	{
		int a = 1;
		int b = 2;
		int expectedResult = 0;
		Assert.assertNotEquals(expectedResult, calculator.add(a, 
		b));
	}
}
