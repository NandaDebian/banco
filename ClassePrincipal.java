package SistemaBancario;

import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente();
		ContaPoupanca cp1 = new ContaPoupanca();

		Pessoa p1 = new Pessoa();
		cc1.setSaldoContaCorrente(600);
		cp1.setSaldoContaPoupanca(800);
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("**LOGIN DE ACESSO ***");
		System.out.println("---DIGITALBANK---");
		System.out.println("ACESSO CONTA CORRENTE");
		System.out.print("Digite seu nome: ");
		p1.setNome(sc.nextLine());
		System.out.print("Agencia: ");
		cc1.setAgencia(sc.nextInt());
		System.out.print("conta");
		cc1.setNumero(sc.nextInt());
		cc1.setContemPix(false);

		System.out.println("******************************");
		System.out.println("SEJA BEM VINDO AO DIGITAL BANK");
		System.out.println("******************************");

		System.out.println("Ola " + p1.getNome());
		System.out.println("Essas são opções que preparamos para você :) ");
		System.out.println();

		cc1.menu();
		int condicao = sc.nextInt();

		if (condicao == 1) {
			cc1.exibirSaldo();
			System.out.println("digite 0 para voltar ao menu principal:");
			condicao = sc.nextInt();

		} else if (condicao == 2) {
			System.out.println("Digite o valor para saque:");
			cc1.sacar(sc.nextDouble());
			System.out.println("digite 0 para voltar ao menu principal:");
			condicao = sc.nextInt();

		} else if (condicao == 3) {
			System.out.println("Favor informar o valor do boleto: ");
			cc1.pagarBoleto(sc.nextDouble());
			System.out.println("digite 0 para voltar ao menu principal:");
			condicao = sc.nextInt();

		} else if (condicao == 4) {
			System.out.println("Dados cadastrais");
			cc1.exibirDados();

		} else if (condicao == 5) {
			System.out.println("Favor informar o valor de deposito:");
			cc1.depositar(sc.nextDouble());

		} else if (condicao == 6) {
			System.out.println("Transferência entre contas");
			System.out.println("Insira o valor a ser transferido");
			cc1.transferir(cp1, sc.nextDouble());
			
		}else if(condicao==7) {
				System.out.println("Sessão encerrada");
				System.out.println("O Digital Bank agradece");
		}
		while (condicao == 0) {
			cc1.menu();
			condicao = sc.nextInt();

			if (condicao == 1) {
				cc1.exibirSaldo();
				System.out.println("digite 0 para voltar ao menu principal:");
				condicao = sc.nextInt();

			} else if (condicao == 2) {
				System.out.println("Digite o valor para saque:");
				cc1.sacar(sc.nextDouble());
				System.out.println("digite 0 para voltar ao menu principal:");
				condicao = sc.nextInt();

			} else if (condicao == 3) {
				System.out.println("Favor informar o valor do boleto: ");
				cc1.pagarBoleto(sc.nextDouble());
				System.out.println("digite 0 para voltar ao menu principal:");
				condicao = sc.nextInt();

			} else if (condicao == 4) {
				System.out.println("Dados cadastrais");
				cc1.exibirDados();
				System.out.println("digite 0 para voltar ao menu principal:");
				condicao = sc.nextInt();

			} else if (condicao == 5) {
				System.out.println("Favor informar o valor de deposito:");
				cc1.depositar(sc.nextDouble());
				System.out.println("digite 0 para voltar ao menu principal:");
				condicao = sc.nextInt();

			} else if (condicao == 6) {
				System.out.println("Transferência entre contas");
				System.out.println("Insira o valor a ser transferido");
				cc1.transferir(cp1, sc.nextDouble());
				System.out.println("digite 0 para voltar ao menu principal:");
				condicao = sc.nextInt();
				
						
			} else {
				System.err.println("OPÇÃO INVALIDA!");
				System.out.println("digite 0 para voltar ao menu principal e escolha entre as opções disponiveis:");
				condicao = sc.nextInt();
			}
			
		}
	}
}