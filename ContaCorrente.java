package SistemaBancario;

public class ContaCorrente extends Conta 

{

	private double saldoContaCorrente;

	public void transferir(Conta outra, double valor) {
		this.sacar(valor);
		outra.depositar(valor);
	}

	@Override
	public void exibirSaldo() {
		System.out.println("Seu saldo da conta corrente é : " + saldoContaCorrente);
	}

	@Override
	public void sacar(double valor) {
		this.saldoContaCorrente -= valor;
		System.out.println("Saque conta Corrente realizado com sucesso novo saldo = " + getSaldoContaCorrente());
	}

	@Override
	public void depositar(double valor) {
		this.saldoContaCorrente += valor;
		System.out.println(
				"deposito na conta corrente realizado com sucesso seu nova saldo é :" + getSaldoContaCorrente());
	}

	public double getSaldoContaCorrente() {
		return saldoContaCorrente;
	}

	public void setSaldoContaCorrente(double saldoContaCorrente) {
		this.saldoContaCorrente = saldoContaCorrente;
	}

	@Override
	public void pagarBoleto(double valor) {
		this.saldoContaCorrente -= valor;
		System.out.println("pagamento realizado!, Seu novo saldo em conta corrente é: " + getSaldoContaCorrente());
	}

	@Override
	public void exibirDados() {
		System.out.println("*** DADOS DA CONTA CORRENTE***");
		System.out.println("Agencia: " + this.getAgencia());
		System.out.println("Conta: " + this.getNumero());

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

	}
}