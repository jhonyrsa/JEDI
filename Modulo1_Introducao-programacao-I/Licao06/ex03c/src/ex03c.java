import java.util.Scanner;
public class ex03c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        int i=0;
        do{
            System.out.println(nome);
            i++;
        }while(i<100);
    }    
}
