package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    public  void areaWithValidValues() throws Exception {
        Rectangle rectangle = new Rectangle(2,2);
        assertEquals(4, rectangle.area());

        rectangle = new Rectangle(5, 6);
        assertEquals(30, rectangle.area());
    }
    @Test
    public  void areaWithInValidValues() throws Exception {
        Rectangle rectangle = new Rectangle(0,2);
        assertThrows(Exception.class, () -> {
            rectangle.area();
        });
    }

    @Test
    public  void perimeterTest() {
        Rectangle rectangle = new Rectangle(2,2);
        assertEquals(8, rectangle.perimeter());

        rectangle = new Rectangle(5, 6);
        assertEquals(22, rectangle.perimeter());
    }

}