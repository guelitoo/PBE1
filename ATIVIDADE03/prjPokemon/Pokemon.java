package prjPokemon;

public class Pokemon {
	
	//Atributos
	String nome;
	String tipo;
	int nivel;
	int hp;
	
	//Construtores
	Pokemon() {
	}
	
	public Pokemon(String nome, String tipo, int nivel, int hp) {
		this.nome = nome;
		this.tipo = tipo;
		this.nivel = nivel;
		this.hp = hp;
	}
	//Metodos
	void atacar() {
        System.out.println(nome + " usou um ataque!");
    }
    void evoluir() {
        System.out.println(nome + " está evoluindo!");
        System.out.println(nome + " evoluiu!");
    }
    void exibirinfo(){
        System.out.println();
	System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Nível: " + this.nivel);
        System.out.println("HP: " + this.hp);
    }
}
