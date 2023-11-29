package henger;

import java.util.ArrayList;

public class Henger_Program {

    private Henger[] hengerek;
    //private  ArrayList<Henger> hengerek;// Így lesz a legjobb

    public Henger_Program() {
    }

    public static void main(String[] args) {
        Henger_Program hengerP = new Henger_Program();
        hengerP.run();
    }

    private void run() {
        System.out.println("A programben lévő Hengerek: ");
        lista();
        for (Henger h : hengerek) {
            System.out.println(h);
        }

        int db = Henger.getHengerDarab();
        double atlagV = atlagTerfogat();
        double csovekSulya = csovekSulya();
        System.out.printf("%17s %d db\n", "A hengerek száma: ", db);
        System.out.printf("%17s %f\n", "Átlag térfogatuk: ", atlagV);
        System.out.printf("%17s %f\n", "A csövek súlya: ", csovekSulya);
    }

    public double atlagTerfogat() {
        double osszT = 0;
        for (Henger h : hengerek) {
            osszT += h.terfogat();
        }
        return osszT / Henger.getHengerDarab();
    }

    public double csovekSulya() {
        double osszSuly = 0;
        for (Henger h : hengerek) {
            if (h instanceof Cso) {
                osszSuly += ((Cso) h).suly();
            }
        }
        return osszSuly;
    }

    private void lista() {
        hengerek = new Henger[4];
        hengerek[0] = new Henger(1, 1);
        hengerek[1] = new TomorHenger(1, 1);
        hengerek[2] = new Cso(1, 1, 5);
        hengerek[3] = new Cso(1, 1, 1);

    }
//pont erre hozták létre a collectionsba
}