import java.util.Scanner;
public class ex04c {
    public static void main(String[] args) {
        System.out.print("Calculadora de exponenciacao com laco for\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a base: ");
        int base = sc.nextInt();
        System.out.print("Informe o expoente: ");
        int expoente = sc.nextInt();
        long resultado=1;
        int i=0;
        for(;i<expoente;i++) resultado = resultado*base;
        System.out.printf("%d ^ %d = %d\n", base, expoente, resultado);
    }
    
}
