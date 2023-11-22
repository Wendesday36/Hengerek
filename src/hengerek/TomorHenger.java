package hengerek;

public class TomorHenger extends Henger {
    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag, 1);
    }

    public TomorHenger( double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }
    
    public double suly(){
        return 0;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    @Override
    public String toString() {
        return "TomorHenger{" + "fajsuly=" + fajsuly + '}';
    }
    
}
