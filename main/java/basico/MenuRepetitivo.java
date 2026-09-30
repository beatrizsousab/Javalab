package basico;

import java.util.Scanner;

public class MenuRepetitivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {            
            System.out.println("\n1 - Dizer \"Ola\"");
            System.out.println("2 - Dizer \"Tchau\"");
            System.out.println("3 - Encerrar");
            System.out.println("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Ola!");
                    break;
                case 2:
                    System.out.println("Tchau!");
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }            
        } while (opcao != 3);
        
        scanner.close();  
    }
}   