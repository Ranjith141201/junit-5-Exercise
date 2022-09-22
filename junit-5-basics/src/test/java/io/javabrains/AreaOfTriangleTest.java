package io.javabrains;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaOfTriangleTest {
	@Test
	public void AreaTestPositive() {
		assertEquals(25,AreaOfTriangle.area(10,5),0.0002);
	}
	@Test
	public void AreaTestNegative() {
		assertEquals(26,AreaOfTriangle.area(10,5),0.0002);
	}

}

