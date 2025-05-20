package math.measurements;

import java.util.Objects;

public class Volume {

    private final double litre;

    private  Volume(double litre) {
        this.litre = litre;
    }

    public  static Volume from(Unit unit, double value){
        return new Volume(value * unit.getFactor());
    }

//    public static Volume add(Volume value1, Volume value2) {
//        double sum = (value1.litre + value2.litre);
//        System.out.println(sum);
//        return Volume.to(Unit.INCH, Length.from(Unit.CM,sum));
//
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(litre, volume.litre) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(litre);
    }
}
