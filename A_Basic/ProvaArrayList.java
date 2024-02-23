import java.util.ArrayList;
import java.util.Collections;

public class ProvaArrayList {
    public static void main(String[] args) {
        System.out.println("ciao");
        ArrayList<String> a = new ArrayList<>();
        a.add("uno");
        a.add("Babina");
        a.add("due");
        a.add("tre");

        a.remove("Babina");
        a.add(1, "due");
       //prende il primo elemento di a e lo mette in s e cosi via per un ciclo
        for(String s : a){
            System.out.println(s);
        }
        //i due for svolgono la stessa funzione
        for(int i = 0; i<a.size(); i++ ){
            String s= a.get(i);
            System.out.println(s);
        }


        Collections.sort(a);

        System.out.println(a);

        System.out.println("juve".compareTo("milan")); //se il numero è negativo viene prima se è positivo la parola viene dopo in ordine alfabetico
    }
}