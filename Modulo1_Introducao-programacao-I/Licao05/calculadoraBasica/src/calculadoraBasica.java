
import java.util.Scanner;
/**
 *
 * @author Jhony Almeida <jhonyrsa@gmail.com>
 */
public class calculadoraBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota da P1: ");
        double notaP1 = sc.nextDouble();
        System.out.print("Digite a nota da P2: ");
        double notaP2 = sc.nextDouble();
        System.out.print("Digite a nota da P3: ");
        double notaP3 = sc.nextDouble();
        System.out.print("Digite a nota dos Relatorios: ");
        double relatorios = sc.nextDouble();
        System.out.print("Digite a nota da Prova Pratica: ");
        double provaPratica=sc.nextDouble();
        double media = notaP1*0.25+notaP2*0.25+notaP3*0.25+relatorios*0.125+provaPratica*0.125;
        System.out.printf("MF = %.2f\n", media);
        if(media<4.0) System.out.println("Esta reprovado, precisa refazer a disciplina");
        else if(media>=4.0 && media<7.0){
            System.out.println("Esta de exame, precisa estudar!");
            double exame = 12 - media;
            System.out.printf("Exame minimo para passar: %.2f\n", exame);
        }else System.out.println("Aprovado!");
        
    }
    
}
