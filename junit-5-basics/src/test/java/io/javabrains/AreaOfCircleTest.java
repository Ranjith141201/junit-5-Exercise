package io.javabrains;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaOfCircleTest {
	@Test
	public void AreaTestPositive() {
		assertEquals(314,AreaOfCircle.find_Area(10),0.0002);
	}
	@Test
	public void AreaTestNegative() {
		assertEquals(315,AreaOfCircle.find_Area(10),0.0002);
	}

}


