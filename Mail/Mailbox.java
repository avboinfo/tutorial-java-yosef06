package Mail;
import java.util.ArrayList;

public class Mailbox {
    Lista<Mail> m;
    
    public Mailbox(){
        m = new Lista<>();
        //carica();
        caricaStato();
       System.out.println(m.toString());
       System.out.println(ricerca("saluti"));
     // salvaLista();
        
      
    }

    private void carica(){
        m.addHead(new Mail("carlo", "saluti", "25 ottobre", "saluti cordialissimi da parete mia"));
        m.addHead(new Mail("guido", "nuovo beat", "8 maggio", "gustati cracovia pt 5"));
        m.addHead(new Mail("francesca", "ordini", "4/4", "ciao come va"));
        m.addTail(new Mail("ciao", "calo","due", "salveeee"));
    }

    public String ricerca(String testo){
        String result="lista mail con il oggetto ricercato=" + testo + ":\n";
        Nodo<Mail> p = m.getRoot();
        while(p!=null){
            if(p.getValore().getOggetto().toLowerCase().contains(testo)){
                result += p.toString() + ":\n";
            }
            p = p.getSuccessivo();
        }
        return result;
    }

    public void salvaLista(){
        String result="";
        Nodo<Mail> p = m.getRoot();
        while(p!=null){
            result += p.getValore().getMittente()+"_" + p.getValore().getOggetto()+ "_" +p.getValore().getData()+"_"+p.getValore().getTesto() + "\n";
            
            p = p.getSuccessivo();
        }

        try{
            OperazioneFile of = new OperazioneFile("Mails");
            if(!of.fileExist()){
                of.creaFile();
            }
            of.ScriviFile(result);
                


        }catch(Exception e){}
    }

    public void caricaStato(){
    try{
        OperazioneFile of = new OperazioneFile("Mails");
        if (of.fileExist()){
            ArrayList<String>  ar = of.getFile();
            System.out.println(ar.size());
            //System.out.println("contenuto: "+s);

            for (int i = 0; i<ar.size(); i++){
                System.out.println(i);
                String oggetto;
                String mittente;
                String data;
                String testo;
                String mailss = ar.get(i);
                System.out.println(mailss);
                mittente = mailss.split("_")[0];
                oggetto = mailss.split("_")[1];
                data = mailss.split("_")[2];
                testo = mailss.split("_")[3];

                

               
                m.addTail(new Mail(mittente, oggetto, data, testo));
               
            }
        }else{
            System.out.println("ERRORE, FILE NON TROVATO");
        }
    }catch(Exception e){
        System.out.println(e);
    }
        
    }



    
}
