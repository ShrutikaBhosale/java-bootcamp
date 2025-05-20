package math.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    public void chanceOfNotGettingTailsTest() throws Exception {
        Probability probabilityOfGettingTails = Probability.create(0.5);
        assertEquals(probabilityOfGettingTails, probabilityOfGettingTails.not());
    }

    @Test
    public void InvalidProbabilityTest() throws Exception {
        assertThrows(Exception.class, ()-> Probability.create(-0.1));
        assertThrows(Exception.class, ()-> Probability.create(1.1));
    }

    @Test
    public void AndTest() throws Exception {
        Probability p1 = Probability.create(0.5);
        Probability p2 = Probability.create(0.5);
        Probability expected = Probability.create(0.25);

        assertEquals(expected, p1.and(p2));
    }

    @Test
    public void OrTest() throws Exception {
        Probability p1 = Probability.create(0.5);
        Probability p2 = Probability.create(0.5);
        Probability chancesOfGettingAtLeast1Tails = Probability.create(0.75);

        assertEquals(chancesOfGettingAtLeast1Tails, p1.or(p2));
    }
}
