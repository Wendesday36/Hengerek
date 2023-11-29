package faidom.modell;

public abstract class FaIdom {

    private static final double FAJSULY = 0.8;

//    public double getTerfogat() {
//        return terfogat;
//    }

    public abstract double terfogat();

    public double suly() {

        return terfogat() * FAJSULY;
    }

    @Override
    public String toString() {
        return "FaIdom{" + "fajsuly=" + FAJSULY + '}';
    }

}
