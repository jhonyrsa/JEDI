import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tresPalavras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String palavra1="";
        String palavra2="";
        String palavra3="";
        System.out.print("Digite a primeira palavra: ");
        try{
            palavra1 = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Erro ao entrar com a primeira palavra");
        }
        System.out.print("Digite a segunda palavra: ");
        try{
            palavra2 = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Erro ao entrar com a segunda palavra");
        }
        System.out.print("Digite a terceira palavra: ");
        try{
            palavra3 = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Erro ao entrar com a terceira palavra");
        }
        System.out.println(palavra1+" "+palavra2+" "+palavra3+".");
    }
    
}
