package barbearia;

import java.util.Scanner;

public class Atendimento {
	
	private Double desconto;
	private Double valorBruto;
	private Double valorTotal;
	private Cliente cliente;
	private Funcionario funcionario;
	private Produto produto;
	private Servico servico;
	
	
	public Atendimento(Double desconto, Double valorBruto, Double valorTotal, Cliente cliente, Funcionario funcionario,
			Produto produto, Servico servico) {
		this.desconto = desconto;
		this.valorBruto = valorBruto;
		this.valorTotal = valorTotal;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.produto = produto;
		this.servico = servico;
	}

	public Atendimento() {
	}



	public Double getDesconto() {
		return desconto;
	}


	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}


	public Double getValorBruto() {
		return valorBruto;
	}


	public void setValorBruto(Double valorBruto) {
		this.valorBruto = valorBruto;
	}


	public Double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public Servico getServico() {
		return servico;
	}


	public void setServico(Servico servico) {
		this.servico = servico;
	}
	
	public void iniciarAtendimento(){
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto(150., desconto, "Minoxidil");

		Servico servico = new Servico("Corte simples", 25.0);

		Cliente marcos = new Cliente("Marcos", "48", "12/12/12", "marcos@marcos.com", "123", "rua joaquim",1,3);

		Cliente nikson = new Cliente("Nikson", "123", "2004", "barbera@barbera.com", "24", "rua nanami",2,9);
		
		Funcionario joao = new Funcionario("João", "123", "24", "joao@joao.com", "123", "rua joaquim",2);

		Double resultado;

		System.out.println("\n\n\n\n\n\nbem vindo ao sistema da sua barbearia favorita\n\nVocê já possui cadastro em nosso sistema?\nCaso sim, digite seu codigo unico e instransferivel\nCaso não digite seu novo código.(lembre-se que este código será para sempre seu.)\n\n\nLEMBRANDO QUE O SEU 10 SERVICO É POR NOSSA CONTA");
		cliente.setIdCliente(sc.nextInt());
		
		if (cliente.getIdCliente() == 1) {
			cliente.setNome(marcos.getNome()); cliente.setCpf(marcos.getCpf()); cliente.setEmail(marcos.getEmail()); cliente.setEndereco(marcos.getEndereco()); cliente.setTelefone(marcos.getTelefone()); cliente.setDataNascimento(marcos.getDataNascimento()); 
		}else if (cliente.getIdCliente() == 2){
			cliente.setNome(nikson.getNome()); cliente.setCpf(nikson.getCpf()); cliente.setEmail(nikson.getEmail()); cliente.setEndereco(nikson.getEndereco()); cliente.setTelefone(nikson.getTelefone()); cliente.setDataNascimento(nikson.getDataNascimento());
		}else {
			sc.nextLine();
                System.out.println("bem vindo pela primeira vez ao nosso sitema, digite seu nome:");
                cliente.setNome(sc.nextLine());
                System.out.println("digite seu cpf");
                cliente.setCpf(sc.nextLine());
                System.out.println("digite seu email");
                cliente.setEmail(sc.nextLine());
                System.out.println("digite seu telefone");
                cliente.setTelefone(sc.nextLine());
                System.out.println("digite seu endereço");
                cliente.setEndereco(sc.nextLine());
                System.out.println("digite sua data de nascimento(com barras)");
                cliente.setDataNascimento(sc.nextLine());
		}

		System.out.println("\n\n\n\nbem vindo, "+cliente.getNome()+"! Escolha com qual barbeiro você deseja realizar seu servico\nJorge DIGITE-1\nJoão DIGITE-2\nPaulo DIGITE-3");
        int escolhabarb=sc.nextInt();
		if (escolhabarb == 1) {
			System.out.println("barbeiro Jorge escolhido");
		}if (escolhabarb == 2){
			System.out.println("barbeiro João escolhido");
		}if (escolhabarb == 3){
			System.out.println("barbeiro Paulo escolhido");
		}

		System.out.println("\nqual servico você deseja realizar\ncorte simples: 25R$ DIGITE-1\ncorte + hidratação: 35R$ DIGITE-2\nbarba simples: 25R$ DIGITE-3\nbarba + hidratação: 35R$ DIGITE-4\ncabelo+barba= 45R$ DIGITE-5\ncabelo + barba + hidratacao: 60R$ DIGITE-6\nlimpeza de pele= 45R$ DIGITE-7\nservico completo: 100R$ DIGITE-8\nPara apenas comprar produtos digite qualquer outro valor");
        int escolhaservico=sc.nextInt();

                if(escolhaservico==1){
                    resultado= servico.getValorDoServico() + produto.getValorDeVenda();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }
                else if(escolhaservico==2){
                    resultado= servico.getValorDoServico() + produto.getValorDeVenda();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }
                else if(escolhaservico==3){
                  resultado= servico.getValorDoServico() + produto.getValorDeVenda();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }
                else if(escolhaservico==4){
                   resultado= servico.getValorDoServico() + produto.getValorDeVenda();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }   
                else if(escolhaservico==5){
              		resultado= servico.getValorDoServico() + produto.getValorDeVenda();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }   
                else if(escolhaservico==6){
           			resultado= servico.getValorDoServico() + produto.getValorDeVenda();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }
                else if(escolhaservico==7){
					resultado= servico.getValorDoServico() + produto.getValorDeVenda();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }
                else if(escolhaservico==8){
              		resultado= servico.getValorDoServico() + produto.getValorDeVenda();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }
                else{
                    resultado=0.0;
					cliente.getCont_cortes();
                    System.out.println("vamos aos produtos");


                }
				

}
}