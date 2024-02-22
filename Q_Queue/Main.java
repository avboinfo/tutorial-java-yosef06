package Q_Queue;

public class Main {

    public static void main(String[] arg){
    Queue<String> q = new Queue<>();
    q_insert("forza magica");
    q_insert("forza magica armata" );
    q_insert("forza magica roma");
    q_insert("forza magica alvaro soler");
    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q.remove());
    }
}