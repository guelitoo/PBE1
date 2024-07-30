package programacao_backend;

import java.util.Scanner;

public class Ex3 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número do funcionário: ");
        int NFuncionario = sc.nextInt();

        System.out.print("Insira as horas trabalhadas: ");
        double HTrabalhadas = sc.nextDouble();

        System.out.print("Digite o salário por hora do funcionário: ");
        double SHora = sc.nextDouble();

        double salario = HTrabalhadas * SHora;

        System.out.printf("Número do funcionário: %d%n", NFuncionario);
        System.out.printf("Salario: %.2f%n", salario);
        
        sc.close();
    }
}