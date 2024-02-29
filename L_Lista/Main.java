package L_Lista;

public class Main {
    public static void main(String[] args) {
        Nodo n = new Nodo(3, null);
       System.out.println(n); 

       Lista l = new Lista();
       for(int i = 0; i<10; i++){
        l.add(new Nodo(i, null));
    }
       System.out.println(l); 

    }
    
}
