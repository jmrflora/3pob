package exemplo;

public class pessoa {
	public String nome;
	private int idade;
	
	public pessoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
