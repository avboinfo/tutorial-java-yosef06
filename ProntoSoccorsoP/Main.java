package ProntoSoccorsoP;

public class Main {
    public static void main(String[] args) {
        ProntoSoccorso prontoSoccorso = new ProntoSoccorso();
    
        prontoSoccorso.aggiungiPaziente("Guido", "Lebonski", "Rosso");

        prontoSoccorso.aggiungiPaziente("Kurt", "Kobain", "Rosso");

        prontoSoccorso.aggiungiPaziente("salvo", "d'acquisto", "Bianco");

       

        
        System.out.println(prontoSoccorso);
        System.out.println( prontoSoccorso.contaPazienti("Rosso")); 

    }
}