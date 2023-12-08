package barbearia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Servico servico = new Servico("Corte simples", 25.0);

		Funcionario joao = new Funcionario("João", "123", "24", "joao@joao.com", "123", "rua joaquim",2,150.0);

		Produto minoxidil = new Produto(1.0, 2.0, "minoxidil");

		Estoque estoque = new Estoque(5, minoxidil,0);

		Cliente marcos = new Cliente("Marcos", "48", "12/12/12", "marcos@marcos.com", "123", "rua joaquim",1,3,0.0);

		Cliente nikson = new Cliente("Nikson", "123", "2004", "barbera@barbera.com", "24", "rua nanami",2,9,0.0);

		Atendimento atendimento = new Atendimento(15.0, 50.0, 150.0, nikson, joao, minoxidil, servico);

		atendimento.iniciarAtendimento();
		sc.close();
	}
	
}
