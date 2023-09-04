/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03_maior.valor;

/**
 *
 * @author Jhony Almeida <jhonyrsa@gmail.com>
 */
public class Ex03_maiorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10, y =23, z =5;
        System.out.println("numero 1 com valor "+x);
        System.out.println("numero 2 com valor "+y);
        System.out.println("numero 3 com valor "+z);
        if(x>y && x>z){
            System.out.println("O maior numero eh "+x);
        }
        else if(y>x && y>z){
            System.out.println("O maior numero eh "+y);
        }
        else{
            System.out.println("O maior numero eh "+z);
        }
    }
    
}
