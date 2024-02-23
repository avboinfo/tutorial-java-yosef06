package P_Pila;
import java.util.Scanner;
import java.io.File;


public class Main {
    public static void main(String[] args){
        File f = new File("datiIn.txt");
        try{
            Scanner scanner = new Scanner(f);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
               // p.push(line);
            }
            scanner.close();
        }catch(Exception e ){
            System.out.println("Error: "+ e.toString());
        }
    }
}
