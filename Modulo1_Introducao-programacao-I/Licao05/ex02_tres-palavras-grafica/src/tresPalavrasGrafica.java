
import javax.swing.*;

/**
 *
 * @author Jhony Almeida <jhonyrsa@gmail.com>
 */
public class tresPalavrasGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra");
       String palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra");
       String palavra3 = JOptionPane.showInputDialog("Digite a terceira palavra");
       
       String msg = palavra1+ " " + palavra2 + " "+palavra3+".";
       JOptionPane.showMessageDialog(null, msg);
    }
    
}
