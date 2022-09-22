package io.javabrains;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinearSearchTest {
	@Test
	public void LinearSearchTestPositve() {
		assertEquals(1,LinearSearch.linearSearch(new int[]{1,2,3,4,5}, 2));
	}
	@Test
	public void LinearSearchTestNegative() {
		assertEquals(3,LinearSearch.linearSearch(new int[]{1,2,3,4,5}, 3));
	}
}
