
import javax.swing.*;
public class ex01b {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Calculadora de Média!");
        String nota1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        String replaceAll = nota1.replaceAll(",", ".");
        double n1 = Double.parseDouble(replaceAll);
        String nota2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
        replaceAll = nota2.replaceAll(",", ".");
        double n2 = Double.parseDouble(replaceAll);
        String nota3 = JOptionPane.showInputDialog("Digite a terceira nota: ");
        replaceAll = nota3.replaceAll(",", ".");
        double n3 = Double.parseDouble(replaceAll);
        double media = (n1+n2+n3)/3;
        String msg = "";
        if(media>=60.0) {
            msg = "MF = "+ media + " :-)"; 
            JOptionPane.showMessageDialog(null, msg);
        }else{
            msg = "MF = "+ media + " :-(";
            JOptionPane.showMessageDialog(null, msg);
        }        
    }
    
}
