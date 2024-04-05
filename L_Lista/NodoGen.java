package L_Lista;
public class NodoGen<T>{
    private T valore;
    private NodoGen<T> succesivo;

    public NodoGen(T valore){
        this.valore=valore;
        succesivo=null;
    }

    public void setValore(T valore){
        this.valore = valore;
    }
    public NodoGen<T> getSuccesivo(){
        return succesivo;
    }

    public void setSuccesivo(NodoGen<T> succesivo){
        this.succesivo = succesivo;
    }
    public T getValore(){
        return valore;
    }

    public String toString(){
        return "il mio valore è: " + getValore();
        String s = "\nLIST BEGIN*********\n;
        NodoGen<T> tmp = root;
        while(tmp)
    }
}