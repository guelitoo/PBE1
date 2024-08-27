package prjPokemon;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Instanciamento de classe
		Pokemon pikachu = new Pokemon("Pikachu", "Elétrico", 1, 50);
		
		Pokemon charmander = new Pokemon("Charmander", "Fogo", 1, 50);
		
		Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass", 1, 50);
		
		Pokemon squirtle = new Pokemon("Squirtle", "Water", 1, 50);
		
		Pokemon rattata = new Pokemon("Rattata", "Comum", 1, 50);
		
		pikachu.evoluir();
		pikachu.atacar();
		pikachu.exibirinfo();
		
		charmander.evoluir();
		charmander.atacar();
		charmander.exibirinfo();
		
		bulbasaur.evoluir();
		bulbasaur.atacar();
		bulbasaur.exibirinfo();
		
		squirtle.evoluir();
		squirtle.atacar();
		squirtle.exibirinfo();
		
		rattata.evoluir();
		rattata.atacar();
		rattata.exibirinfo();
		
	}

}
