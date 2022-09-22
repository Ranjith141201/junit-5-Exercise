package io.javabrains;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringLengthTest {
	@Test
	public void TestStringLength() {
	assertEquals(4,StringLength.length("Java"));
		}
	@Test
	public void TestStringLengthNeg() {
		assertEquals(10,StringLength.length("Javapoint"));
	}
	}
