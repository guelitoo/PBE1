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
		
		pikachu.exibirinfo();
		pikachu.evoluir();
		pikachu.atacar();

		charmander.exibirinfo();
		charmander.evoluir();
		charmander.atacar();
		
		bulbasaur.exibirinfo();
		bulbasaur.evoluir();
		bulbasaur.atacar();
		
		squirtle.exibirinfo();
		squirtle.evoluir();
		squirtle.atacar();

		rattata.exibirinfo();
		rattata.evoluir();
		rattata.atacar();
		
	}

}
