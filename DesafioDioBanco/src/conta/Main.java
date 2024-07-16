package conta;

public class Main {

	public static void main(String[] args) {
		Cliente client1 = new Cliente("Samuel", "67999", "011111");
		Cliente client2 = new Cliente("jose", "9999", "22222");
		Conta cc = new ContaCorrente(client1);
		Conta cp = new ContaPoupanca(client2);
		Banco b = new Banco("bradesco", "avenida da 13");
		Banco b2 = new Banco("jojo", "avenida da 14");
		b.addContas(cc);
		b.addContas(cp);
		b.trocarBanco(cp, b2);
		cc.depositar(400);
		cc.transferir(100, cp);
//		cc.sacar(400);
//		cc.imprimirExtrato();
//		cp.imprimirExtrato();
		b.imprimirContas();
		b2.imprimirContas();
		
	}

}
