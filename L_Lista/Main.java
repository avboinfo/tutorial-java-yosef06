package L_Lista;

public class Main {
    public static void main(String[] args) {
        Nodo n = new Nodo(3, null);
       System.out.println(n); 

       Lista l = new Lista();
       for(int i = 0; i<10; i++){
        l.add(new Nodo(i, null));
    }
        l.addFirst(new Nodo(3, null));
       System.out.println(l); 
       l.eliminaNodo(2);
       System.out.println("lista aggiornata: " + l);


       System.out.println(l.cercaNodo(5).getValore());
       

    }
    
}
