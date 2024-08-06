package prjCaneta;

public class Livro {
	
	String nomeL;
	String autor;
	boolean aluguel;
	
	public Livro (String nomeL, String autor) {
		this.nomeL = nomeL;
		this.autor = autor;
		this.aluguel = false;
	}
	
	void status() {
		System.out.println(this.nomeL + ": " + (this.aluguel ? "Alugado":"Disponivel"));
	}
	void alugar () {
		this.aluguel = true;
	}
	void devolver () {
		this.aluguel = false;
	}
	
}
