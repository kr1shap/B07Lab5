import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TrapezoidTests {

    @Test 
    void invalidTrapeZoid() { 
        //Create a trapezoid with invalid points
        Point A = new Point(-0.5, 1);
        Point B = new Point(0.5, 1);
        Point C = new Point(0, 0);
        Point D = new Point(5, 5);
        Point zero = new Point(0, 0);
        Trapezoid t = new Trapezoid(A, B, C, D);
        assertTrue(t.A.equals(zero) && t.B.equals(zero) && t.C.equals(zero) && t.D.equals(zero));
    } 

    @Test
    void perimeterValidTrapezoid() { 
        //Create a trapezoid with valid points
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(3, 2);
        Point D = new Point(1, 2);
        Trapezoid t = new Trapezoid(A, B, C, D);
        assertEquals(t.perimeter(), 6 + 2*Math.sqrt(5));
    }

    @Test
    void perimeterInValidTrapezoid() { 
        //Create a trapezoid with valid points
        Point A = new Point(0, 0);
        Trapezoid t = new Trapezoid(A, A, A, A);
        assertEquals(t.perimeter(), 0);
    }

    @Test
    void isRightTrapezoidTrueABC() { 
        //Test whether trapezoid is right angled (true for isRightAngle(A, B, C))
        Point A = new Point(0, 0);
        Point B = new Point(0, 4);
        Point C = new Point(3, 4);
        Point D = new Point(4, 0);
        Trapezoid t = new Trapezoid(A, B, C, D);
        assertTrue(t.isRightTrapezoid());
    }

    @Test
    void isRightTrapezoidTrueBCD() { 
        //Test whether trapezoid is right angled (true for isRightAngle(B, C, D))
        Point A = new Point(0, 0);
        Point B = new Point(3, 0);
        Point C = new Point(3, 4);
        Point D = new Point(0, 3);
        Trapezoid t = new Trapezoid(A, B, C, D);
        assertTrue(t.isRightTrapezoid());
    }

    @Test
    void isRightTrapezoidTrueCDA() { 
        //Test whether trapezoid is right angled (true for isRightAngle(C, D, A))
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(3, 3);
        Point D = new Point(0, 3);
        Trapezoid t = new Trapezoid(A, B, C, D);
        assertTrue(t.isRightTrapezoid());
    }

    @Test
    void isRightTrapezoidTrueDAB() { 
        //Test whether trapezoid is right angled (true for isRightAngle(D, A, B))
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(5, 3);
        Point D = new Point(0, 3);
        Trapezoid t = new Trapezoid(A, B, C, D);
        assertTrue(t.isRightTrapezoid());
    }

    @Test
    void isRightTrapezoidFalse() { 
        //Test whether trapezoid is right angled (false)
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(3, 2);
        Point D = new Point(1, 2);
        Trapezoid t = new Trapezoid(A, B, C, D);
        assertFalse(t.isRightTrapezoid());
    }
    
}
