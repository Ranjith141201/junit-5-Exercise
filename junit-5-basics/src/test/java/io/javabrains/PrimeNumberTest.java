package io.javabrains;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberTest {
@Test
public void PrimeNumberTestPositive() {
	assertEquals("true",PrimeNumber.isPrime(2));
}
@Test
public void PrimeNumberTestNegative() {
	assertEquals("true",PrimeNumber.isPrime(4));
}
}