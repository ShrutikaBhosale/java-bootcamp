package math;

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
        assertEquals(4, square.perimeter());

        square = new Square(5);
        assertEquals(10,square.perimeter());
    }
}

