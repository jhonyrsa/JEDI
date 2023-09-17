import java.util.Scanner;
/**
 *
 * @author Jhony Almeida <jhonyrsa@gmail.com>
 */
public class tresPalavrasb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine();
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine();
        System.out.print("Digite a terceira palavra: ");
        String palavra3 = sc.nextLine();
        
        System.out.print(palavra1 + " " +palavra2 +" "+palavra3);
    }
    
}
