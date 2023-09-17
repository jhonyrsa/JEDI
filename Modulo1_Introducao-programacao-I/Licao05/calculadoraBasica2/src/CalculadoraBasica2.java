
import javax.swing.*;
/**
 *
 * @author Jhony Almeida <jhonyrsa@gmail.com>
 */
public class CalculadoraBasica2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Calculadora de situação de Circuitos Elétricos I");
        String nota1 = JOptionPane.showInputDialog("Digite a nota da P1");
        String replaceAll = nota1.replaceAll(",", ".");
        double notaP1 = Double.parseDouble(replaceAll);
        String nota2 = JOptionPane.showInputDialog("Digite a nota da P2");
        replaceAll = nota2.replaceAll(",", ".");
        double notaP2 = Double.parseDouble(replaceAll);
        String nota3 = JOptionPane.showInputDialog("Digite a nota da P3");
        replaceAll = nota3.replaceAll(",", ".");
        double notaP3 = Double.parseDouble(replaceAll);
        String relatorios = JOptionPane.showInputDialog("Digite a nota dos Relatórios");
        replaceAll = relatorios.replaceAll(",", ".");
        double Relatorios = Double.parseDouble(replaceAll);
        String PP = JOptionPane.showInputDialog("Digite a nota da Prova Prática");
        replaceAll = PP.replaceAll(",", ".");
        double provaPratica = Double.parseDouble(replaceAll);
        double media = notaP1*0.25+notaP2*0.25+notaP3*0.25+Relatorios*0.125+provaPratica*0.125;
        String msg = "MA = "+media;
        JOptionPane.showMessageDialog(null, msg);
    } 
}
