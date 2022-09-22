package io.javabrains;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {
@Test
public void SumTestPositive() {
	assertEquals(15,SumOfarray.sum(new int[]{1,2,3,4,5}));
}
@Test
public void SumTestNegative() {
	assertEquals(14,SumOfarray.sum(new int[]{1,2,3,4,5}));
}
}
