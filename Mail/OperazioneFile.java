package Mail;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class OperazioneFile {
    String percorso;
    File f;
    boolean exists;

    public OperazioneFile(String percorso){
        this.percorso = percorso;
        f=new File(percorso);
    }

    public boolean fileExist(){
        exists = f.exists();
        return exists;
    }

    public ArrayList<String>  getFile() throws FileNotFoundException, IOException{
        if(exists){
            FileReader fr = new FileReader(f);
            // String s = fr.toString();
            Scanner sc = new Scanner(fr).useDelimiter("\n"); 
            
            ArrayList<String> al = new ArrayList<>();
            while(sc.hasNext()){
                al.add(sc.next());
            }
            fr.close();
            sc.close();
            return al;
            
        }else{
            System.out.println("file inesistente");
            return null;
        }
    }

    public void creaFile() throws IOException{
       if(exists){
        System.out.println("file esistente");
       }else{
        f.createNewFile();
       }
    }
    public void ScriviFile(String sf) throws IOException{
        FileWriter fw = new FileWriter(f);
        fw.write(sf);
        fw.flush();
        fw.close();
    }


    
}
