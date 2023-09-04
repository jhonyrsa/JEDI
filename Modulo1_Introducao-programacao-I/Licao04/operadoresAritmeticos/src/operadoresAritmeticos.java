/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Jhony Almeida <jhonyrsa@gmail.com>
 */
public class operadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 37;
        int j = 42;
        double x = 27.445;
        double y = 7.22;
        
        System.out.println("Valores das variaveis");
        System.out.println("   i = "+i);
        System.out.println("   j = "+j);
        System.out.println("   x = "+x);
        System.out.println("   y = "+y);
        //adição dos números
        System.out.println("Adicionando:");
        System.out.println("   i + j = "+(i+j));
        System.out.println("   x + y = "+(x+y));
        //subtração dos números
        System.out.println("Subtraindo:");
        System.out.println("   i - j = "+(i-j));
        System.out.println("   x - y = "+(x-y));
        //multiplicação dos números
        System.out.println("Multiplicando:");
        System.out.println("   i x j = "+(i*j));
        System.out.println("   x x y = "+(x*y));
        //divisão dos números
        System.out.println("Divisao:");
        System.out.println("   i / j = "+(i/j));
        System.out.println("   x / y = "+(x/y));
        //resto da divisão dos números
        System.out.println("Resto da divisao:");
        System.out.println("   i % j = "+(i%j));
        System.out.println("   x % y = "+(x%y));
        //misturando as operações
        System.out.println("Misturando as operacoes:");
        System.out.println("   j + y = "+(j+y));
        System.out.println("   i * x = "+(i*x));
    }
    
}
