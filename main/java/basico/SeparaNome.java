package basico;

import java.util.Scanner;

public class SeparaNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine().trim();
        
        String[] partes = nomeCompleto.split("\\s");
        
        String primeiroNome = partes[0];
        String ultimoNome = partes[partes.length - 1];
        
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Ultimo nome: " + ultimoNome);
        
        scanner.close();
    }   
}
