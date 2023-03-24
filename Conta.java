package SistemaBancario;

public abstract class Conta extends Pessoa {

	private Pessoa pessoa;
	private int numero;
	private int agencia;
		

	private boolean contemPix = false;

	public abstract void sacar(double valor);

	public abstract void exibirSaldo();

	public void depositar(double valor) {
	}

	public abstract void pagarBoleto(double valor);// metodo acrescentado

	public abstract void exibirDados();// metodo acrescentado

	public abstract void menu();

	public void ativarPix() {
		if (contemPix == false) {
			this.contemPix = true;
			System.out.println("Pix ativado com sucesso");
		} else {
			System.err.println("pix ja está ativo");

		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public boolean isContemPix() {
		return contemPix;
	}

	public void setContemPix(boolean contemPix) {
		this.contemPix = contemPix;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Conta [pessoa=" + pessoa + ", numero=" + numero + ", agencia=" + agencia + ", contemPix=" + contemPix
				+ "]";

	}

}
