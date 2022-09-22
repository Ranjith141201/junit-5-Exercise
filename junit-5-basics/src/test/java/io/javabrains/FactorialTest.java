package io.javabrains;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorialTest {
	@Test
	public void testfactorial() {
		assertEquals(6,Factorial.factorial(3));
		
	}
	@Test
	public void testingfactorial() {	
	assertEquals(6,Factorial.factorial(4));
}
}