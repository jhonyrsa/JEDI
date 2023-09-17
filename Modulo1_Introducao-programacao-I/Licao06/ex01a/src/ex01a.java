
import java.util.Scanner;
public class ex01a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a N1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a N2: ");
        double nota2= sc.nextDouble();
        System.out.print("Digite a N3: ");
        double nota3 = sc.nextDouble();
        double media = (nota1+nota2+nota3)/3;
        if(media>=60.0) System.out.printf("Media = %.2f :-)\n", media);
        else System.out.printf("Media = %.2f :-(\n", media);        
    }
    
}
