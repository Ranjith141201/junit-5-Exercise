package io.javabrains;
//wrong answer

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseArrayTest {
@Test
public void ReverseArrayPositive() {
	assertEquals(5,ReverseArray.reverse(new int[]{1,2,3,4,5}));
}
}