package L_Lista;

public class Lista {
    Nodo radice;

    public Lista(){
        radice = null;
    }
    class iteratore(){
        private Nodo nodo;
        this.nodo = nodo;

    private iteratore(Nodo nodo){
        this.nodo = nodo;
    }

    public hasNext(){
        return nodo!=null;
    }

    public iteratore getIterator(){
        iteratore i = new iteratore(nodo);
    }
}
    
    public boolean isEmpty(){
        return radice==null;
    }

    public void add(Nodo n){
        if(isEmpty()){
            radice = n;
        }else{
            Nodo p = radice;
            while(p.getSuccessivo()!=null){
                p=p.getSuccessivo();
            }
            p.setSuccesivo( n ); 
        }

    }
    public void addSorted(Nodo n){
        if (isEmpty()) {
            radice = n;
            return;
        } 

        Nodo p1 = radice;
        Nodo p2 = radice.getSuccessivo();
        int vN = n.getValore();

        if (p1.getValore()>vN) {
            n.setSuccessivo(radice);
            radice = n;
            return;
        }
        
        while (vN>p1.getValore() && p2!=null && vN>p2.getValore()) {
            p1=p2;
            p2=p1.getSuccessivo();
        }
        n.setSuccessivo(p2);
        p1.setSuccessivo(n);
    }
    public void addFirst(Nodo n){
        if(isEmpty()){
            radice = n;
        }else{
            n.setSuccesivo(radice);
            radice = n;
        }

    }
    public Nodo cercaNodo(int valore){
        Nodo tmp = radice;
         while(tmp.getValore() != valore){
            tmp = tmp.getSuccessivo();
            if(tmp==null){
                System.out.println("valore non trovato");
                return null;
            }
         } 
         System.out.println("valore trovato è: " + tmp.getValore());
         return tmp;

    }

    public void eliminaNodo(int valore){
        
        Nodo tmp = radice;
        while(true){
           if(tmp.getSuccessivo().getValore()==valore){
            tmp.setSuccesivo(tmp.getSuccessivo().getSuccessivo());
               System.out.println("valore da eliminare trovato");
               break;
           }
           if (tmp.getSuccessivo()==null) break;
           tmp=tmp.getSuccessivo();
        } 
      
       

   }

        
    
    public String toString(){ //add tail aggiungere add head
        
        String s = "elementi della lista: ";
        Nodo p = radice;
        while(p!=null){
            s += p + "\t";
            p = p.getSuccessivo();
        }
        s+="\n" + "End! " + "\n";
        return s;
    }
}
