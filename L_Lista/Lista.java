package L_Lista;

public class Lista {
    Nodo radice;

    public Lista(){
        radice = null;
    }
    
    public boolean isEmpty(){
        return radice==null;
    }

    public void add(Nodo n){
        if(isEmpty()){
            radice = n;
        }else{
            Nodo p = radice;
            while(p.getSuccesivo()!=null){
                p=p.getSuccesivo();
            }
            p.setSuccesivo( n );
        }

    }
    public String toString(){
        String s = "elementi della lista: ";
        Nodo p = radice;
        while(p!=null){
            s += p + "\t";
            p = p.getSuccesivo();
        }
        s+="\n" + "End! " + "\n";
        return s;
    }
}
