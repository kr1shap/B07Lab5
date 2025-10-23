package b07lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCircle {
	
	// testing getDiameter()
	
	@Test
	void testgetDiameter() {
		Circle circ = new Circle(new Point(3,4), 3.0);
		assertEquals(circ.getDiameter(), 6.0);
	}
	
	// testing getCircumference()
	
	@Test
	void testgetCircumference() {
		Circle circ = new Circle(new Point(5,7), 9.0);
		assertEquals(circ.getCircumference(), 18*Math.PI);
	}
	
	// testing getArea()
	
	@Test
	void testgetArea() {
		Circle circ = new Circle(new Point(0,0), 7.0);
		assertEquals(circ.getArea(), 49*Math.PI);
	}
	
	// testing getArcLength()
	
	@Test
	void testgetArcLength() {
		Circle circ = new Circle(new Point(5,5), 25.0);
		assertEquals(circ.getArcLength(Math.PI), 25.0*Math.PI);
	}
	
	// testing case when checkOverlap() is true
	
	@Test
	void testOverlapTrue() {
		Circle circ1 = new Circle(new Point(4,5), 3.0);
		Circle circ2 = new Circle(new Point(3,4), 2.0);
		
		assertTrue(circ1.checkOverlap(circ2));
	}
	
	// testing case when checkOverlap() is false
	
	@Test
	void testOverlapFalse() {
		Circle circ1 = new Circle(new Point(-2, 4), 2.0);
		Circle circ2 = new Circle(new Point(4,5), 3.0);
		
		assertFalse(circ1.checkOverlap(circ2));
	}
	
	// testing case when containsPoint() is true
	
	@Test
	void testContainsPointTrue() {
		Circle circ = new Circle(new Point(-2, 4), 3.0);
		assertTrue(circ.containsPoint(new Point(-1, 3)));
	}
	
	// testing case when containsPoint() is false
	
	@Test
	void testContainsPointFalse() {
		Circle circ = new Circle(new Point(4,5), 3.0);
		assertFalse(circ.containsPoint(new Point(0,0)));
	}

}
