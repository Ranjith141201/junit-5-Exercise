package io.javabrains;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordCountTest {
	@Test
	public void WordCountTestPositive() {
		assertEquals(4,WordCount.wordcount("The train was late"));

	}
	@Test
	public void WordCountTestNegative() {
		assertEquals(5,WordCount.wordcount("The train was late"));

}
}
