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

		Produto minoxidil = new Produto(150., desconto, "Minoxidil");

		Servico servico = new Servico("Corte simples", 25.0);

		Cliente marcos = new Cliente("Marcos", "48", "12/12/12", "marcos@marcos.com", "123", "rua joaquim",1,3,0.0);

		Cliente nikson = new Cliente("Nikson", "123", "2004", "barbera@barbera.com", "24", "rua nanami",2,9,0.0);
		
		Funcionario joao = new Funcionario("João", "123", "24", "joao@joao.com", "123", "rua joaquim",2,135.0);
		
		Estoque estoqueMinoxidil = new Estoque(5, produto);
		Double saldobarb1 = 0.0;
		Double saldobarb2 = 0.0;
		Double saldobarb3 = 0.0;
		double saldoGerente = 0.0;
		Double conta = cliente.getConta();
		Double valorProdutoSeparado = 0.0;

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
                    conta= cliente.getConta() + servico.getValorDoServico();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }
                else if(escolhaservico==2){
                    conta= 35 + produto.getValorDeVenda();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }
                else if(escolhaservico==3){
                  conta= 25 + produto.getValorDeVenda();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }
                else if(escolhaservico==4){
                   conta= 35 + produto.getValorDeVenda();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }   
                else if(escolhaservico==5){
              		conta= servico.getValorDoServico() + produto.getValorDeVenda();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }   
                else if(escolhaservico==6){
           			conta= servico.getValorDoServico() + produto.getValorDeVenda();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }
                else if(escolhaservico==7){
					conta= servico.getValorDoServico() + produto.getValorDeVenda();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }
                else if(escolhaservico==8){
              		conta= servico.getValorDoServico() + produto.getValorDeVenda();
                    System.out.println("bom serviço!");
                    cliente.setCont_cortes(cliente.getCont_cortes()+1);
                    funcionario.setRemuneracao(servico.getValorDoServico());
                }
                else{
                    conta=0.0;
					cliente.getCont_cortes();
                    System.out.println("vamos aos produtos");


                }
				
				System.out.println("\n\n\n\n\n\n\n\n\n\nvocê deseja conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
            int conhecer_produtos=sc.nextInt();
            while (conhecer_produtos!=2) {
                System.out.println("digite o codigo de um de nossos produtos para adicionar ao carrrinho:\nMinoxidil:R$35 COD-12\nCreme de cabelo: R$50 COD-46");
                int cod_produto=sc.nextInt();
                if(cod_produto==12){
                    conta=conta+35;
                    estoqueMinoxidil.setQuantidade(estoqueMinoxidil.getQuantidade());
					estoqueMinoxidil.setQuantidade(estoqueMinoxidil.getQuantidade()-1);
					System.out.println("PEDIDO REALIZADO!!!\nVocê deseja continuar a conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
                    conhecer_produtos=sc.nextInt();
            }
                else if(cod_produto==46){
                    // conta=conta+50;
                    // count_prod2++;
                    // quantidade_produto2=quantidade_produto2-1;
                    // System.out.println("PEDIDO REALIZADO!!!\nVocê deseja continuar a conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
                    // conhecer_produtos=sc.nextInt();
					System.out.println("Item 46");
            }
                else{
                    System.out.println("CODIGO INVALIDO!!!\nVocê deseja continuar a conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
                    conhecer_produtos=sc.nextInt();
            }}
			valorProdutoSeparado= funcionario.getRemuneracao() - cliente.getCont_cortes();

            // int estoqueCreme=quantidade_produto2-count_prod2;
            System.out.println("\n\n\n\n\n\n\n\n\n\n");

            if(conta==0){
                System.out.println("seu atendimento foi encerrado sem compras, lhe aguardamos numa proxima visita, "+cliente.getNome()+"!");
            }
            else{
				if(conta<10){
                System.out.println("Olá "+" espero que esteja satisfeito com nosso servico :)\nA conta pelo seu corte geral pelo seu serviço é de: "+conta+"\n\n");
                    if(escolhabarb==1){
                       saldobarb1= saldobarb1+(cliente.getCont_cortes()/2)+(valorProdutoSeparado*5/100);
                        System.out.println(joao.getNome()+" este corte lhe rendeu R$"+cliente.getCont_cortes()/2+" e seu valor diário geral é de: R$"+saldobarb1+"\n\n\n\n");

            double valorbarbeiros=saldobarb1+saldobarb2+saldobarb3;
            double saldoSemDescontos=saldoGerente+cliente.getCont_cortes()+valorProdutoSeparado+saldobarb1+saldobarb2+saldobarb3;
            Double custoProdutos=valorProdutoSeparado-(estoqueMinoxidil.getQuantidade()*produto.getValorDeCusto())- (estoqueMinoxidil.getQuantidade()*50)-(valorProdutoSeparado*5/100);
            double descontos=valorbarbeiros+custoProdutos;

            saldoGerente=saldoSemDescontos-descontos;

            System.out.println("GERENTE:"+
            "\nValor em caixa sem os descontos de custo: R$"+saldoSemDescontos+
            "\na comissão dos barbeiros está nos valores de: Jorge-"+saldobarb1+" João-"+saldobarb2+" Paulo-"+saldobarb3+
            "\nO valor de descontos de custo de produto+comissao de barbeiros é de R$"+descontos+
            "\nseu saldo geral após este corte é de: R$"+saldoGerente);
            
                    }
            //         else if(escolhabarb==2){
            //             saldobarb2=saldobarb2+(contacorte/2)+(valorProdutoSeparado*5/100);
            //             System.out.println(barbeiro2+" este corte lhe rendeu R$"+contacorte/2+" e seu valor diário geral é de: R$"+saldobarb2+"\n\n\n\n");

            // double valorbarbeiros=saldobarb1+saldobarb2+saldobarb3;
            // double saldoSemDescontos=saldoGerente+contacorte+valorProdutoSeparado+saldobarb1+saldobarb2+saldobarb3;
            // Double custoProdutos=valorProdutoSeparado-(count_prod1*valorCustoProd1)-(count_prod2*valorCustoProd2)-(valorProdutoSeparado*5/100);
            // double descontos=valorbarbeiros+custoProdutos;

            // saldoGerente=saldoSemDescontos-descontos;

            // System.out.println("GERENTE:"+
            // "\nValor em caixa sem os descontos de custo: R$"+saldoSemDescontos+
            // "\na comissão dos barbeiros está nos valores de: Jorge-"+saldobarb1+" João-"+saldobarb2+" Paulo-"+saldobarb3+
            // "\nO valor de descontos de custo de produto+comissao de barbeiros é de R$"+descontos+
            // "\nseu saldo geral após este corte é de: R$"+saldoGerente);
            
                        
            //         }
            //         else if(escolhabarb==3){
            //             saldobarb3=saldobarb3+(contacorte/2)+(valorProdutoSeparado*5/100);
            //             System.out.println(barbeiro3+" este corte lhe rendeu R$"+contacorte/2+" e seu valor diário geral é de: R$"+saldobarb3+"\n\n\n\n");

            // double valorbarbeiros=saldobarb1+saldobarb2+saldobarb3;
            // double saldoSemDescontos=saldoGerente+contacorte+valorProdutoSeparado+saldobarb1+saldobarb2+saldobarb3;
            // Double custoProdutos=valorProdutoSeparado-(count_prod1*valorCustoProd1)-(count_prod2*valorCustoProd2)-(valorProdutoSeparado*5/100);
            // double descontos=valorbarbeiros+custoProdutos;

            // saldoGerente=saldoSemDescontos-descontos;

            // System.out.println("GERENTE:"+
            // "\nValor em caixa sem os descontos de custo: R$"+saldoSemDescontos+
            // "\na comissão dos barbeiros está nos valores de: Jorge-"+saldobarb1+" João-"+saldobarb2+" Paulo-"+saldobarb3+
            // "\nO valor de descontos de custo de produto+comissao de barbeiros é de R$"+descontos+
            // "\nseu saldo geral após este corte é de: R$"+saldoGerente);
            
                        
            //         }

            // }
            else{
                       

            System.out.println("seu estoque de Minoxidil contem: "+estoqueMinoxidil.getQuantidade()+" unidades");
            // System.out.println("seu estoque de Creme contem: "+estoqueCreme+" unidades");
            }

			
}
	}
	}
}