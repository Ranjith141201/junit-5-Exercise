package io.javabrains;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {
@Test
public void PalindromeTestPositive() {
	assertEquals("palindrome",Palindrome.palindrome("noon"));
}
@Test
public void PalindromeTestNegative() {
	assertEquals("palindrome",Palindrome.palindrome("Java"));
}
}
