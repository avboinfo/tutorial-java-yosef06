package Q_Queue;

public class Main {

    public static void main(String[] arg){
    Queue<String> q = new Queue<>();
    q.insert("forza magica");
    q.insert("forza magica armata" );
    q.insert("forza magica roma");
    q.insert("forza magica alvaro soler");
    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q.remove());
    }
}