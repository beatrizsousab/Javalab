package basico;

public class VerificaNumero {
    public static void main(String[] args) {
        int numero = 15;
        
        if (numero >= 10 && numero <= 20) {
            System.out.println(numero + " esta entre 10 e 20 (inclusive).");
        } else { 
            System.out.println(numero + " NAO esta entre 10 e 20.");
        }      
    }
}
