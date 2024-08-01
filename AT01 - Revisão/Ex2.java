package programacao_backend;

import java.util.Scanner;

public class Ex2 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio do círculo: ");
        double raio = sc.nextDouble();
        
        final double PI = 3.14159;
        
        double area = PI * raio * raio;
        
        System.out.printf("A área do círculo com raio %.4f é %.4f%n", raio, area);
        
        sc.close();
    }
}