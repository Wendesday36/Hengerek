package faidom.main;

import faidom.modell.FaIdom;
import faidom.modell.Gomb;
import faidom.modell.Hasab;
import static java.lang.Double.min;
import static java.lang.Math.min;
import java.util.ArrayList;
import java.util.List;

public class FaIdomok {
//    private FaIdom[] idomok;

    private List<faidom.modell.FaIdom> idomok;

    public static void main(String[] args) {
        FaIdomok faidom = new FaIdomok();
        faidom.run();
    }

    public FaIdomok() {

    }

    public void run() {
        System.out.println("A programban levo hengerek:");
        List<FaIdom> idomLista = new ArrayList<FaIdom>();

        Gomb g1 = new Gomb(4);
        Hasab h1 = new Hasab(4, 5, 3);
        Gomb g2 = new Gomb(5);
        Hasab h2 = new Hasab(1, 1, 1);
        idomLista.add(h2);
        idomLista.add(g1);
        idomLista.add(h1);
        idomLista.add(g2);
        idomok = idomLista;

        for (FaIdom h : idomok) {
            System.out.println(h.terfogat());
        }
        double osszesSuly = osszSuly();
        double osszGombSuly = osszGombSuly();
        FaIdom maxV= maxV();
        System.out.printf("%17s %f\n", "Ossz suly: ", osszesSuly);
        System.out.printf("%17s %f\n", "Az osszes gomb súlya: ", osszGombSuly);
        System.out.println("max terfogat: "+maxV());
        System.out.println("min terfogat: "+minV());
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
        FaIdom minV = (FaIdom)idomok.get(0);
        double min = idomok.get(0).terfogat();
        for (int i = 0; i < idomok.size(); i++) {
            if (idomok.get(i).terfogat() < min) {
                min = idomok.indexOf(i);
            }
        }

        return minV;

    }

    public faidom.modell.FaIdom maxV() {
        FaIdom maxV = (FaIdom)idomok.get(0);
        double max = idomok.get(0).terfogat();
        for (int i = 0; i < idomok.size(); i++) {
            if (idomok.get(i).terfogat() > max) {
                max = idomok.indexOf(i);
            }
        }
       
        return maxV;

    }
}
