package hengerek;

import java.util.List;

public class Henger_Program {

    private List hengerek;
    private Henger[] hengerek;   
   
    
    public static void main(String[] args) {
        new Henger_Program().run();
    }
    
    public   void run(){
        lista();
        int db = Henger.getHengerDarab();
        double atlagV = atlagTerfogat();
        
        
//        hengerek.add(h1);
    }
    
    private void lista(){
       hengerek = new Henger[4];
       hengerek[0]= new TomorHenger(4,8);
       hengerek[1] = new TomorHenger(2,8);
       hengerek[2] = new Cso(1,1,.5);
       hengerek[3] = new TomorHenger(5,9);
       
        for (Henger h : hengerek) {
            System.out.println(h);
        }
    }
    
    public double csovekSulya(){
        return 0;
    }
    
    public double atlagTerfogat(){
        return 0;
    }
    
}
