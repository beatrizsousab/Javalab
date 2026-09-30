package basico;

import java.util.Scanner;

public class BuscaNome {
    public static void main(String[] args) {
        String[] nomes = {"Maria", "Joao", "Carlos", "Ana", "Beatriz"};
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um nome: ");
        String nomeBuscado = scanner.nextLine();
        
        boolean encontrado = false;
        
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBuscado)) {
                encontrado = true;
                break;
            }   
        }
        
    if (encontrado) {
         System.out.println(nomeBuscado + "esta no array."); 
    } else {
        System.out.println(nomeBuscado + "NAO esta no array.");
    }
    
    scanner.close();        
    }  
}
