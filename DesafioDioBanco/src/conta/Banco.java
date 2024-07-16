package conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private String endereco;
	private List<Conta> contas;
	
	
	
	public Banco(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void addContas(Conta conta) {
		this.contas.add(conta);
	}

	
	public void imprimirContas() {
		System.out.println("===Banco===");
		System.out.println(String.format("NomeBanco: %s", this.getNome()));
		System.out.println(String.format("Endereco: %s", this.getEndereco()));
		for(Conta c : this.contas) {
			c.imprimirExtrato();
		}
	}
	
	public void trocarBanco(Conta conta, Banco banco) {
		if(this.contas.contains(conta)) {
			this.contas.remove(conta);
			banco.addContas(conta);
		}
	}
	
	
	
	
	
	
	
	
}
