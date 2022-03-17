package exemplo;

public class cachorro {
	//atributos
	public String nome;
	private String contato;
	//getters and setters
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	//metodo construtor
	public cachorro(String nome, String contato) {
		this.nome = nome;
		this.contato = contato;
	}
	//to string
	@Override
	public String toString() {
		return "cachorro [nome=" + nome + ", contato=" + contato + "]";
	}
	
	public void entrar_em_contato() {
		System.out.println("ligando");
	}
	
	public void entrar_em_contato(String nome) {
		System.out.println("ligado para:" + nome);
	}
	
	
}
