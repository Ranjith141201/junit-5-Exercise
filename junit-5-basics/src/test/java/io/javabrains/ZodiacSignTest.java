package io.javabrains;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZodiacSignTest {
@Test
public void ZodiacSignTestPositive() {
	assertEquals("Sagittarius",ZodiacSign.zodiac_sign(22,"december"));
}
}
