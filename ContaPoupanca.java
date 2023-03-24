package SistemaBancario;

public class ContaPoupanca extends Conta {

	private double saldoContaPoupanca;

	public void transferir(Conta outra, double valor) {
		this.sacar(valor);
		outra.depositar(valor);
	}

	@Override
	public void exibirSaldo() {
		System.out.println("Seu saldo da conta poupança é : " + saldoContaPoupanca);
	}

	@Override
	public void sacar(double valor) {
		if ((saldoContaPoupanca - valor) >= 0) {
			System.out.println("Saque conta poupança realizado com sucesso novo saldo = " + getSaldoContaPoupanca());

		} else {
			System.err.println("Saque não efetuado saldo insuficiente!");
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldoContaPoupanca += valor;
		System.out.println("Deposito em conta poupança realizado com sucesso!");
		System.out.println("Novo saldo é :" + getSaldoContaPoupanca());
	}

	public double getSaldoContaPoupanca() {
		return saldoContaPoupanca;
	}

	public void setSaldoContaPoupanca(double saldoContaPoupanca) {
		this.saldoContaPoupanca = saldoContaPoupanca;
	}

	@Override
	public void pagarBoleto(double valor) {
		this.saldoContaPoupanca -= valor;
		System.out.println("Pagamento realizado!, Seu novo saldo em conta poupança é: " + getSaldoContaPoupanca());
	}

	@Override
	public void exibirDados() {
		System.out.println("*** DADOS DA CONTA POUPANÇA***");
		System.out.println("Nome:" + this.getPessoa().getNome());
		System.out.println("CPF:" + this.getPessoa().getCPF());
		System.out.println("D.Nasc: " + this.getPessoa().getDataDeNascimento());
		System.out.println("Endereço: " + this.getPessoa().getEndereço());

	}

	@Override
	public void menu() {
		System.out.println("--- MENU ---");

		System.out.println("DIGITE 1 SALDO");
		System.out.println("DIGITE 2 SAQUE");
		System.out.println("DIGITE 3 PAGAR BOLETO");
		System.out.println("DIGITE 4 EXIBIR DADOS");
		System.out.println("DIGITE 5 DEPOSITO");
		System.out.println("DIGITE 6 TRANSFERÊNCIA");

		System.out.println("************************");

		// TODO Auto-generated method stub

	}
}