package math.measurements;

import java.util.Objects;

public class Measurement {
    private final double length;
    private final Unit unit;

    private Measurement(double length, Unit unit) {
        this.length = length;
        this.unit = unit;
    }

    public static Measurement from(Unit unit, double value) {
        return new Measurement(value * unit.getFactor(), unit);
    }

    public static Measurement to(Unit unit, Measurement length) {
        return new Measurement(length.length / unit.getFactor(), unit);
    }

    public static Measurement add(Measurement value1, Measurement value2) {
        double sum = (value1.length + value2.length);
        return new Measurement(sum, Unit.CM);
    }


    @Override
    public String toString() {
        return "Length{" +
                "centimeter=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Measurement length = (Measurement) o;
        return Double.compare(this.length, length.length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(length);
    }
}
