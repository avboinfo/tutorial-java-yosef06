package L_Lista;

import java.io.*;

public class Nodo {
    private int valore;
    private  Nodo succesivo;

    public Nodo(int valore, Nodo succesivo){
        this.valore = valore;
        this.succesivo = succesivo;

    }
    public void setSuccesivo(Nodo nuovoSuccesivo){
        succesivo = nuovoSuccesivo;
    }

    public void setValore(int nuovoValore){
        valore = nuovoValore;
    }

    public int getValore(){
        return valore;
    }

    public Nodo getSuccessivo(){
        return succesivo;
    }

    public String toString(){
        return "[" + getValore() + "]" ;
    }
}
