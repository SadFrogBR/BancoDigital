package conta;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.infosComuns();
		
	}
	

}
