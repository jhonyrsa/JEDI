import java.util.Scanner;

/**
 *
 * @author Jhony Almeida <jhonyrsa@gmail.com>
 */
public class Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome: ");
        String name = sc.next();
        System.out.println("Hello "+name+"!");
    }
    
}
