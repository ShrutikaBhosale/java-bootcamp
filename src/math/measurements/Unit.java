package math.measurements;

public enum Unit {
    CM(1),
    FEET(30.48),
    INCH(2.54),
    MM(0.1),
    GALLON(3.78),
    LITRE(1);

    private final double factor;

    Unit(double factor) {
        this.factor = factor;
    }

    public double getFactor() {
        return this.factor;
    }
}
