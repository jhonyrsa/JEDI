import java.util.Scanner;
public class Ex03a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String name = sc.nextLine();
        int i=0;
        while(i<100){
            System.out.println(name);
            i++;
        }
    }
}
