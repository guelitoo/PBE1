package programacao_backend;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int v1 = sc.nextInt();
		
		System.out.print("Digite outro valor: ");
		int v2 = sc.nextInt();
		
		System.out.println("O total da soma é: " + (v1 + v2));
		sc.close();
	}

}
