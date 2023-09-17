import java.util.Scanner;
public class ex02a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n\t Numeros por extenso\n\n");
        System.out.print("Digite o numero: ");
        int numero = sc.nextInt();
        switch (numero){
            case 1:
                System.out.println("Numero: um");
                break;
            case 2:
                System.out.println("Numero: dois");
                break;
            case 3:
                System.out.println("Numero: tres");
                break;
            case 4:
                System.out.println("Numero: quatro");
                break;
            case 5:
                System.out.println("Numero: cinco");
                break;
            case 6:
                System.out.println("Numero: seis");
                break;
            case 7:
                System.out.println("Numero: sete");
                break;
            case 8:
                System.out.println("Numero = oito");
                break;
            case 9:
                System.out.println("Numero = nove");
                break;
            case 10:
                System.out.println("Numero = dez");
                break;
            default:
                System.out.println("Numero invalido");
        }   
    }
}
