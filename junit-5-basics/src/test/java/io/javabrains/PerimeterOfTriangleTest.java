package io.javabrains;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerimeterOfTriangleTest {
@Test
public void PerimeterOfTriangleTestPositive() {
	assertEquals(36,PerimeterOfTriangle.findPerimeter(10,12,14),0.0002);
}
@Test
public void PerimeterOfTriangleTestNegative() {
	assertEquals(38,PerimeterOfTriangle.findPerimeter(10,12,15),0.0002);
}
}
