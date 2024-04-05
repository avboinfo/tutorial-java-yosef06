package Ospedale;

public  class Paziente extends Urgenza implements Comparable<Paziente> {
   private String nome;
   private String gravita;
   public Paziente(String nome, String g){
    setNome(nome);
    setGravita(g);
   }

   public void setNome(String nome){
    this.nome = nome;
   }
   public String getNome(){
    return this.nome;
   }
   public void setGravita(String g){
    this.gravita = g;
   }

   public String getGravita(){
    return this.gravita;
   }

   public int compareTo(Paziente pazz){
    if(getGravita()=="bianco"){
        if(pazz.getGravita()=="bianco"){
            return 0;
        }
        return -1;
    }
    if (getGravita()=="giallo"){
        if(pazz.getGravita()=="bianco"){
            return 1;
        }else if(pazz.getGravita()=="rosso"){
            return -1;
        }else{
            return 0;
        }
    }
    if(pazz.getGravita()=="rosso"){
        return 0;
    }
    return 1;
   }
   public String toString(){
    return "il paziente si chiama: " + getNome() + " ed ha il colore di gravita: " + getGravita() + "\n";
   }
    
}
