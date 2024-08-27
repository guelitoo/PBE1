package prjZoologico;

public class ClasseAnimal {
	
	//Atributos
	String atributoNome;
	String atributoRaca;
	String atributoSexo;
	int atributoPeso;
	
	//Construtores
	ClasseAnimal(){
		
	}
	public ClasseAnimal(String parametroNome, String parametroRaca, String parametroSexo, int parametroPeso) {
		this.atributoNome = parametroNome;
		this.atributoRaca = parametroRaca;
		this.atributoSexo = parametroSexo;
		this.atributoPeso = parametroPeso;
	}
	
	//Metodos
	public void metodoComer() {
		if (this.atributoPeso >= 170) {
			System.out.println(this.atributoNome + " está obeso, vamos execitar");
		}
		else {
			this.atributoPeso += 10;
		}
	}
	public void metodoExercitar() {
		if (this.atributoPeso <= 50) {
			System.out.println(this.atributoNome + "está magro demais, que tal comer um pouquinho");
		}
		else {
			this.atributoPeso -= 10;
		}
	}
	public void exibirInfo() {
		System.out.println("Nome: " + this.atributoNome);
		System.out.println("Peso: " + this.atributoPeso);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
