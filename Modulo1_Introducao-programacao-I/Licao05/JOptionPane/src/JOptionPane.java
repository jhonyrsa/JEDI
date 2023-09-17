
import javax.swing.JOptionPane;

public class JOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "";
        name = JOptionPane.showInputDialog("Digite seu nome");
        String msg = "Olá " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
