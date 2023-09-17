/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Jhony Almeida <jhonyrsa@gmail.com>
 */
public class exe0702a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entry[][]={{"Florence", "735-1234","Manila"},{"Joyce","983-3333","Quezon City"},{"Becca", "456-3322", "Manila"}};
        int i, j;
        for(i=0;i<entry.length;i++){
            for(j=0;j<entry[i].length;j++){
                if(j==0) System.out.println("Nome  : "+entry[i][j]);
                else if(j==1) System.out.println("Tel.# : "+entry[i][j]);
                else System.out.println("Adress: "+entry[i][j]);
            }
            System.out.printf("\n");
        }
    }
    
}
