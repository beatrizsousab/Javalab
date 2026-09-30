package basico;

import java.util.Scanner;

public class ContaPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine().trim();
        
        String[] palavras = frase.split("\\s+");
        
        System.out.println("Numero de palavras: " + palavras.length);
        
        scanner.close();
    }
}
