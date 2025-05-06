package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         Calculadora calc = new Calculadora();

        System.out.println("Escolha uma operação:");
        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - MULTIPLICAÇÃO");
        System.out.println("4 - DIVISÃO");

        int operacao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        float numero1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        float numero2 = scanner.nextFloat();

        // Lógica para escolher a operação
        switch (operacao) {
            case 1:
                System.out.println("Resultado: " + calc.somar(numero1, numero2));
                break;
            case 2:
                System.out.println("Resultado: " + calc.subtrair(numero1, numero2));
                break;
            case 3:
                System.out.println("Resultado: " + calc.multiplicar(numero1, numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Resultado: " + calc.dividir(numero1, numero2));
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        scanner.close();
    }
}
