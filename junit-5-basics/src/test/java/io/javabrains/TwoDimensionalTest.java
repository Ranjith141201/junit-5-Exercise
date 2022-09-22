package io.javabrains;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoDimensionalTest {
	@Test
	public void TwoDimensionalTestPositve() {
		
		assertEquals("same",TwoDimensional.TwoDimCompare(new int[]{1,2,3,4,5},new int[]{1,2,3,4,5}));
	}
	@Test
	public void TwoDimensionalTestNegative() {
		assertEquals("same",TwoDimensional.TwoDimCompare(new int[]{1,2,3,4,5},new int[]{1,2,3,4,6}));
	}
}

