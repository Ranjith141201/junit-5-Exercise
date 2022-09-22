package io.javabrains;
import static org.junit.Assert.*;


import org.junit.Test;

public class PerimeterOfCircleTest {
	@Test
	public void PerimeterTestPositive() {
		assertEquals(62.8,PerimeterOfCircle.find_Perimeter(10),0.0002);/// third argument is a delta,elta is the maximum difference (delta) between expected and actual for which both numbers are still considered equal.
	}
	@Test
	public void PerimeterTestNegative() {
		assertEquals(61.6,PerimeterOfCircle.find_Perimeter(10),0.0002);
	}

}
