package io.javabrains;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordSearchTest {
	@Test
	public void WordSearchTestPositive() {
		assertEquals("present",WordSearch.Wordsearch("The train was late","train"));

	}
	@Test
	public void WordSearchTestNegative() {
		assertEquals("present",WordSearch.Wordsearch("The train was late","truck"));

}
}

