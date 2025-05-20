package math;

import math.shapes.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    public void areaTest() {
        Square square = new Square(2);
        assertEquals(4, square.area());

        square = new Square( 6);
        assertEquals(36, square.area());
    }

    @Test
    public  void perimeterTest() {
        Square square = new Square(2);
        assertEquals(8, square.perimeter());

        square = new Square(5);
        assertEquals(20,square.perimeter());
    }
}

