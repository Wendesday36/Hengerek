package faidom.modell;

public abstract class FaIdom {

    private double fajsuly = 0.8;

//    public double getTerfogat() {
//        return terfogat;
//    }

    public abstract double terfogat();

    public double suly() {

        return terfogat() * fajsuly;
    }

    @Override
    public String toString() {
        return "FaIdom{" + "fajsuly=" + fajsuly + '}';
    }

}
