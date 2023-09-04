/**
 *
 * @author Jhony Almeida <jhonyrsa@gmail.com>
 */
public class operadoresRelacionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 37;
        int j = 42;
        int k = 42;
        System.out.println("Valores das variaveis:");
        System.out.println("   i = "+i);
        System.out.println("   j = "+j);
        System.out.println("   k = "+k);
        //maior que
        System.out.println("Maior que...");
        System.out.println("   i > j = "+(i>j));
        System.out.println("   j > i = "+(j>i));
        System.out.println("   k > j = "+(k>j));
        //maior ou igual a
        System.out.println("Maior ou igual a...");
        System.out.println("   i >= j = "+(i>=j));
        System.out.println("   j >= i = "+(j>=i));
        System.out.println("   k >= j = "+(k>=j));
        //menor que
        System.out.println("Menor que...");
        System.out.println("   i < j = "+(i<j));
        System.out.println("   j < i = "+(j<i));
        System.out.println("   k < j = "+(k<j));
        //menor ou igual a
        System.out.println("Menor ou igual a...");
        System.out.println("   i <= j = "+(i<=j));
        System.out.println("   j <= i = "+(j<=i));
        System.out.println("   k <= j = "+(k<=j));
        //igual a
        System.out.println("Igual a...");
        System.out.println("   i == j = "+(i==j));
        System.out.println("   j == i = "+(j==k));
        //diferente
        System.out.println("Igual a...");
        System.out.println("   i != j = "+(i!=j));
        System.out.println("   j != i = "+(j!=k));
    }
    
}
