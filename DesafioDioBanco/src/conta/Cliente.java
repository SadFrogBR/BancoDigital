package conta;

public class Cliente {
	private String nome;
	private String numeroTelefone;
	private String cpf;
	
	public Cliente(String nome, String numeroTelefone, String cpf) {
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public String getNumeroTelefone() {
		return numeroTelefone;
	}


	public String getCpf() {
		return cpf;
	}
	
	
	
	
}
