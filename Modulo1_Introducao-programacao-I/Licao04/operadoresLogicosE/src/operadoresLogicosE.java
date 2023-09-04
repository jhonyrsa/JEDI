/**
 *
 * @author Jhony Almeida <jhonyrsa@gmail.com>
 */
public class operadoresLogicosE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        int j = 10;
        boolean test = false;
        
        //Demonstração do operador &&
        test = (i>10) && (j++>9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        //Demonstração do operador &
        test = (i>10) & (j++>9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
    
}
