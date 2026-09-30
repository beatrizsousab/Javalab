package basico;

import java.util.Scanner;

public class SubstituiLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma frase: ");
        String texto = scanner.nextLine();
        
        String resultado = texto.replace("e", "*");
        
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }    
}
