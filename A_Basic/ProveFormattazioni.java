/*
 * Prova Formattazioni
 */

package provaformattazioni;

/**
 *
 * @author sandro.gallo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (float f=8; f<12; f+=0.5) {
            System.out.printf("%6.2f\n", f);
        }
        
    }
}