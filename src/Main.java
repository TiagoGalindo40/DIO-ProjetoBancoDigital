
public class Main {

	public static void main(String[] args) {
		
		Cliente Tiago = new Cliente();
		Tiago.setNome("Tiago");
		
		Conta cc = new ContaCorrente(Tiago);
		Conta poupanca = new ContaPoupanca(Tiago);
		
		cc.imprimirExtrato();
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		poupanca.imprimirExtrato();
		
		
		
		
		
		

	}

}
