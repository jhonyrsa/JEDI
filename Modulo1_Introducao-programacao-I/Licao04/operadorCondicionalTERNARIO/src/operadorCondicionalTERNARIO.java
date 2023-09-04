/**
 *
 * @author Jhony Almeida <jhonyrsa@gmail.com>
 */
public class operadorCondicionalTERNARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**expressao1 ? expressao2 : expressao3
         * expresao1 retorna verdadeiro ou falso
         * verdadeiro, resultado sera expressao2
         * falso, resultado sera expressao3
         */
        String status = "";
        int grade = 80;
        //Status do aluno;
        status = (grade>=60)?"Passed":"Fail";
        //Print status
        System.out.println(status);
    }
    
}
