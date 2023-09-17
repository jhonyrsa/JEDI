import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Jhony Almeida <jhonyrsa@gmail.com>
 */
public class bufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        System.out.print("Please Enter Your Name:");
        try {
            name = dataIn.readLine();
        } catch (IOException e) {
        System.out.println("Error!");
        }
        System.out.println("Hello " + name +"!");
    }
    
}
