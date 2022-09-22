package io.javabrains;

import static org.junit.Assert.*;

import org.junit.Test;

public class AverageOfArrayTest {
@Test
public void AverageOfArrayTestPositive() {
	assertEquals(2,AverageOfArray.find_average(new int[]{1,2,3}));
}
@Test
public void AverageOfArrayTestNegative() {
	assertEquals(14,AverageOfArray.find_average(new int[]{1,2,3,4,5}));
}
}
