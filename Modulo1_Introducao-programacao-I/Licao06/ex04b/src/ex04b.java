import java.util.Scanner;
public class ex04b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = sc.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();
        long resultado=1;
        int i=0;
        do{
            resultado=resultado*base;
            i++;
        }while(i<expoente);
        System.out.printf("%d ^ %d = %d\n", base, expoente, resultado);
    }    
}
