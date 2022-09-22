package io.javabrains;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {
@Test
public void ReverseStringTestPositive() {
	assertEquals("now",ReverseString.reverseString("won"));
}
@Test
public void ReverseStringTestNegative() {
	assertEquals("Java",ReverseString.reverseString("Java"));
}
}
