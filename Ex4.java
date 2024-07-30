package programacao_backend;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Leitura dos dados da peça 1
		        System.out.print("Digite o código da peça 1: ");
		        int peca1 = scanner.nextInt();
		        System.out.print("Digite o número de peças 1: ");
		        int numeroPecas1 = scanner.nextInt();
		        System.out.print("Digite o valor unitário da peça 1: ");
		        double valorUnitarioPeca1 = scanner.nextDouble();

		        // Leitura dos dados da peça 2
		        System.out.print("Digite o código da peça 2: ");
		        int peca2 = scanner.nextInt();
		        System.out.print("Digite o número de peças 2: ");
		        int numeroPecas2 = scanner.nextInt();
		        System.out.print("Digite o valor unitário da peça 2: ");
		        double valorUnitarioPeca2 = scanner.nextDouble();

		        // Cálculo do valor total a ser pago
		        double valorTotalPeca1 = numeroPecas1 * valorUnitarioPeca1;
		        double valorTotalPeca2 = numeroPecas2 * valorUnitarioPeca2;
		        double valorTotal = valorTotalPeca1 + valorTotalPeca2;

		        // Exibição do resultado
		        System.out.printf("O valor a ser pago é: R$ %.2f%n", valorTotal);

		        // Fechar o scanner
		        scanner.close();
		    }

		
	}
