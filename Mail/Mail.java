package Mail;

public class Mail {
    private String mittente;
    private String oggetto;
    private String data;
    private String testo;

    public Mail(String mittente, String oggetto, String data,String testo){
        this.mittente = mittente;
        this.oggetto = oggetto;
        this.data = data;
        this.testo = testo;
    }

    public void setMittente(String mittente){
        this.mittente = mittente;
    }

    public String getMittente(){
        return mittente;
    }

    public void setOggetto(String oggetto){
        this.oggetto = oggetto;
    }

    public String getOggetto(){
        return oggetto;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getData(){
        return data;
    }

    public void setTesto(String testo){
        this.testo = testo; 
    }

    public String getTesto(){
        return testo;
    }

    public String toString(){
        return "la mail è di: " + getMittente() + " ha come oggetto: " + getOggetto();
    }
}
