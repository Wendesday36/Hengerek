package faidom.main;

import faidom.modell.FaIdom;
import faidom.modell.Gomb;
import faidom.modell.Hasab;
import java.util.List;

public class FaIdomok {
    private FaIdom[] idomok;
//    private List<faidom.modell.FaIdom> idomok;

    public static void main(String[] args) {
        FaIdomok faidom = new FaIdomok();
        faidom.run();
    }

    public FaIdomok() {

    }

    public void run() {
        System.out.println("A programban levo hengerek:");
        idomok = new FaIdom[4];
        idomok[0] = new Gomb(4);
        idomok[1] = new Hasab(4, 5,3);
        idomok[2] = new Gomb( 5);
        idomok[3] = new Hasab(1, 1, 1);
                
        for (FaIdom h : idomok) {
            System.out.println(h);
        }        
    }

    public double osszSuly() {
        double osszSuly = 0;
        for (FaIdom h : idomok) {
            osszSuly += h.suly();
        }
        return osszSuly;

    }

    public double osszGombSuly() {
        double osszGombSuly = 0;
        for (FaIdom h : idomok) {
            if (h instanceof Gomb) {
                osszGombSuly += ((Gomb) h).suly();
            }
        }
        return osszGombSuly;

    }

    public faidom.modell.FaIdom minV() {

        return null;

    }

    public faidom.modell.FaIdom maxV() {

        return null;

    }
}
