package math.measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    @Test
    public void feetToInch() {
        assertEquals(Measurement.from(Unit.INCH, 12), Measurement.from(Unit.FEET,1));
    }

    @Test
    public void inchToCm() {
        assertEquals(Measurement.from(Unit.INCH,2), Measurement.from(Unit.CM,5.08));
    }

    @Test
    public void mmToCm() {
        assertEquals(Measurement.from(Unit.MM,10), Measurement.from(Unit.CM,1));
    }

    @Test

    public void addInches() {
        Measurement sum = Measurement.to(Unit.INCH, Measurement.add(Measurement.from(Unit.INCH, 2), Measurement.from(Unit.INCH, 2)));
        assertEquals(Measurement.to(Unit.INCH, Measurement.from(Unit.INCH,4)), sum);
    }

    @Test
    public void addCMToInches() {
        Measurement sum = Measurement.to(Unit.INCH, Measurement.add(Measurement.from(Unit.INCH, 2), Measurement.from(Unit.CM, 2.54)));
        assertEquals(Measurement.to(Unit.INCH, Measurement.from(Unit.INCH,3)), sum);
    }


    @Test
public  void  addGallonToLitre(){
        Measurement sum = Measurement.to(Unit.LITRE, Measurement.add(Measurement.from(Unit.GALLON, 1), Measurement.from(Unit.LITRE, 1)));
        assertEquals(Measurement.to(Unit.LITRE, Measurement.from(Unit.LITRE,4.78)), sum);
    }
}