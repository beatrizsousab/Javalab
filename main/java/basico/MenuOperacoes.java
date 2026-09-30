package basico;

import java.util.Scanner;

public class MenuOperacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Somar dois numeros");
        System.out.println("2 - Subtrair dois numeros");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o primeiro numero: ");
                double a1 = scanner.nextDouble();
                System.out.print("Digite o segundo numero: ");
                double b1 = scanner.nextDouble();
                System.out.println("Resultado: " + (a1 + b1));
                break;
            case 2:
                System.out.print("Digite o primeiro numero: ");
                double a2 = scanner.nextDouble();
                System.out.print("Digite o segundo numero: ");
                double b2 = scanner.nextDouble();
                System.out.println("Resultado: " + (a2 - b2));
                break;
            case 3:
                System.out.println("Encerrando o programa...");
                break;
            default:
                System.out.println("Opcao invalida!");
        }

        scanner.close();
    }
}