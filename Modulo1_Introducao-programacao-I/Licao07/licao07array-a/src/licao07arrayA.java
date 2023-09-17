import java.util.Scanner;
public class licao07arrayA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declarando e construindo o objeto array de 100 posições
        final int ARRAY_SIZE = 100;
        int ages[] = new int[ARRAY_SIZE];
        int i;
        for(i=0;i<ages.length;i++){
            ages[i] = sc.nextInt();
        }
        for(i=0;i<ages.length;i++){
            System.out.printf("Idade(%d) = %d\n", i, ages[i]);
        }
    }
    
}
