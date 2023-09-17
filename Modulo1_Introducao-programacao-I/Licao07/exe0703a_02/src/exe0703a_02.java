import java.util.Scanner;
public class exe0703a_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int ARRAY_SIZE = 10;
        int numero[] = new int[ARRAY_SIZE];
        for(int i=0;i<numero.length; i++){
            System.out.printf("Digite o %2d numero: ", i+1);
            numero[i] = sc.nextInt();
        }
        int maiorNumero=numero[0];
        for(int i=1;i<numero.length;i++){
            if(maiorNumero<numero[i]) maiorNumero=numero[1];
        }
        System.out.printf("Maior numero: %d\n", maiorNumero);
    }    
}
