package math;

public class Square implements ClosedShape {

    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 2 * side;
    }
}
