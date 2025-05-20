package math.measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {

    @Test
    public  void gallonToLitre(){

        assertEquals(Volume.from(Unit.GALLON,1), Volume.from(Unit.LITRE,3.78));
    }

}