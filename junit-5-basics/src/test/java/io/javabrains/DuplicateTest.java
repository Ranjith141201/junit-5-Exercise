package io.javabrains;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DuplicateTest {
@Test
public void DuplicateTestPositve() {
	assertEquals("duplicate",Duplicate.find_duplicate(new int[]{1,2,3,4,2}));
}
@Test
public void DuplicateTestNegative() {
	assertEquals(5,Duplicate.find_duplicate(new int[]{1,2,3,4,5}));
}
}
