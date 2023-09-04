/**
 *
 * @author Jhony Almeida <jhonyrsa@gmail.com>
 */
public class operadoresLogicosXOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean val1 = true;
        boolean val2 = true;
        //Operador lógico XOR só avalia verdadadeiro
        //apenas se uma das expressões for verdadeira
        System.out.println(val1^val2);
        
        val1 = false;
        val2 = true;
        System.out.println(val1^val2);
        
        val1 = false;
        val2 = false;
        System.out.println(val1^val2);
        
        val1 = true;
        val2 = false;
        System.out.println(val1^val2);
    }
    
}
