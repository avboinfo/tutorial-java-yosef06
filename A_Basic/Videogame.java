public class Videogame {
    String nome, marca;
    float prezzo;
    int anno;

    public void Videogame(string nome, string marca, float prezzo, int anno){
        this.nome= nome;
        this.marca=marca;
        this.prezzo=prezzo;
        this.anno=anno;
    }
    public string toString(){
        return "il nome del gioco è: " + nome + " fa parte della marca: " + marca + " costa: " + prezzo +" è del anno: " + anno;
    }    
}
