import java.util.Scanner;
public class ex02b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n\tNumeros por extenso\n\n");
        System.out.print("Digite o numero: ");
        int numero = sc.nextInt();
        if(numero ==1) System.out.println("Numero: um");
        else if(numero==2)System.out.println("Numero: dois");
        else if(numero==3)System.out.println("Numero: tres");
        else if(numero==4)System.out.println("Numero: quatro");
        else if(numero==5)System.out.println("Numero: cinco");
        else if(numero==6)System.out.println("Numero: seis");
        else if(numero==7)System.out.println("Numero: sete");
        else if(numero==8)System.out.println("Numero: oito");
        else if(numero==9)System.out.println("Numero: nove");
        else if(numero==10)System.out.println("Numero = dez");
        else System.out.println("Numero invalido");
    }   
}
