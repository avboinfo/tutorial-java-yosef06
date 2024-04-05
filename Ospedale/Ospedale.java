package Ospedale;
import java.util.ArrayList;
import java.util.Collections;
public class Ospedale {
    public static void main(String[] args) {
        ArrayList<Paziente> coda = new ArrayList<Paziente>();
        coda.add(new Paziente ("carlo", "rosso"));
        coda.add(new Paziente ("mazza", "giallo"));
        coda.add(new Paziente ("andrea", "bianco"));
        coda.add(new Paziente ("alessio", "bianco"));
        coda.add(new Paziente ("martina", "rosso"));
        coda.add(new Paziente ("michela", "giallo"));
        coda.add(new Paziente ("carlotta", "giallo"));

        System.out.println(coda);
        Collections.sort(coda);
        System.out.println(coda);

        
    }
    
}
