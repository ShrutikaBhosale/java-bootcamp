package math.probability;

import java.util.Objects;

public class Probability {
    private static final double IMPOSSIBILITIES = 0.0;
    private static final double CERTAINTY = 1.0;
    private final double probability;


    private Probability(double value) {
        this.probability = value;
    }

    public static Probability create(double value) throws Exception {
        if (value < IMPOSSIBILITIES || value > CERTAINTY) throw new Exception("Invalid Probability");

        return new Probability(value);
    }

    public Probability not() {
        return new Probability(CERTAINTY - probability);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(probability, that.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }

    public Probability and(Probability chance) {
        return new Probability(probability * chance.probability);
    }


    public Probability or(Probability chance) {
        return new Probability(probability + chance.probability - (this.and(chance).probability));
    }
}

