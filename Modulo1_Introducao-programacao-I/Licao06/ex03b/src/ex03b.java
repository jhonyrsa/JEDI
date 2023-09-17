import java.util.Scanner;
public class ex03b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        int i;
        for(i=0; i<100; i++){
            System.out.println(nome);
        }
    }
}
