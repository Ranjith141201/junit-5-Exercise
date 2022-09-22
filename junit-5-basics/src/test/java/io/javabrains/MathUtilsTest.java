package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	@BeforeEach
	void initEach() {
		MathUtils mathUtils = new MathUtils();
	}
	@Test
	void test() {
		MathUtils mathUtils = new MathUtils();
		int expected= 2;
		int actual = mathUtils.add(1,1);
		assertEquals(expected,actual,"the add method should add two numbers:");
	}
	@Test
	void testDivide() {
		MathUtils mathUtils = new MathUtils();
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide should throw ArithmeticException when denominator is zero");
	} 
	
	@Test
	void testComputeCircleRadius() {
	MathUtils mathUtils = new MathUtils();
	assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"should return right circle Area");

}
	

}
