package Lab5;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void perimeterTest(){
		Rectangle rect = new Rectangle(5.0, 3.0);
		double expected = 16.0;
		double actual = rect.perimeter();
		assertEquals(expected, actual, 0.001, "Perimeter calculation should be (2 * length) + (2 * width)");
		
		// test w/ a square
		Rectangle square = new Rectangle(4.0, 4.0);
		assertEquals(16.0, square.perimeter(), 0.001);
	}
	
	@Test
	void areaTest() {
		Rectangle rect = new Rectangle(5.0, 3.0);
		double expected = 15.0;
		double actual = rect.area();
		assertEquals(expected, actual, 0.001, "Area calculation should be (length * width)");
		
		// test w/ a square
		Rectangle square = new Rectangle(4.0, 4.0);
		assertEquals(16.0, square.area(), 0.001);
	}
	
	@Test
	void isSquareTrue() {
		Rectangle square = new Rectangle(5.0, 5.0);
		assertTrue(square.isSquare(), "Rectangle with equal length and width should be a square");
		
		// test w/ another square
		Rectangle anotherSquare = new Rectangle(10.0, 10.0);
		assertTrue(anotherSquare.isSquare());
	}

	@Test
	void isSquareFalse() {
		Rectangle rect = new Rectangle(5.0, 3.0);
		assertFalse(rect.isSquare(), "Rectangle with different length and width should not be a square");
		
		// test w/ another non-square rectangle
		Rectangle anotherRect = new Rectangle(7.0, 2.0);
		assertFalse(anotherRect.isSquare());
	}	
}
