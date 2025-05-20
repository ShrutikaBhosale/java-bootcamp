package math.shapes;

public class Rectangle implements ClosedShape {
    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    private boolean isValidDimensions() {
        return length > 0 && breadth > 0;
    }

    public int area() throws Exception {
        if (!isValidDimensions())
            throw new Exception("Invalid Dimensions");

        return length * breadth;
    }

    public int perimeter() {

        return 2 * (length + breadth);
    }
}
