package io.javabrains;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class QuadrantTest {
	@Test
	public void TestQuadrant() {
	assertEquals(1,Quadrant.quadrant(1,1));
}
		@Test
		public void TestQuadrantNegative() {
		assertEquals(1,Quadrant.quadrant(1,-1));
	}


}

