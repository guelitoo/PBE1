package prjZoologico;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Instanciamento de classe
		ClasseAnimal elefante = new ClasseAnimal();
		
		//Inicialição de atributos
		elefante.atributoNome = "Dumbo";
		elefante.atributoRaca = "Africano";
		elefante.atributoSexo = "Macho";
		elefante.atributoPeso = 170;
		
		ClasseAnimal girafa = new ClasseAnimal("GitHub", "Australiana", "Femea", 50);
		
		SubClasseCarnivoros leao = new SubClasseCarnivoros();
		leao.atributoNome = "Fumasa";
		leao.atributoRaca = "Autraliano";
		leao.atributoSexo = "Macho";
		leao.atributoPeso = 200;
		
		leao.exibirInfo();
		leao.medotoCacar();
		
		elefante.exibirInfo();
		elefante.metodoComer();
		
		elefante.exibirInfo();
		
		girafa.exibirInfo();
		
	}

}
