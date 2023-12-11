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

    public void iniciarAtendimento() {
        Scanner sc = new Scanner(System.in);

        Produto minoxidil = new Produto(28.0, desconto, "Minoxidil");

        Produto creme = new Produto(40.0, desconto, "Creme de cabelo");

        Servico servico = new Servico("Corte simples", 25.0);

        Cliente marcos = new Cliente("Marcos", "48", "12/12/12", "marcos@marcos.com", "123", "rua joaquim", 1, 3, 0.0);

        Cliente nikson = new Cliente("Nikson", "123", "2004", "barbera@barbera.com", "24", "rua nanami", 2, 9, 0.0);

        Funcionario joao = new Funcionario("João", "123", "24", "joao@joao.com", "123", "rua joaquim", 2, 150.0);

        Funcionario jorge = new Funcionario("Jorge", "123", "1/2/3", "numseiqla@.com", "123", "aaa", 1, 150.0);

        Funcionario paulo = new Funcionario("Paulo", "123", "1/2/3", "numseiqla@.com", "123", "aaa", 3, 150.0);

        Estoque estoqueMinoxidil = new Estoque(5, produto, 0);

        Estoque estoqueCreme = new Estoque(5, creme, 0);

        Double saldobarb1 = 0.0;
        int contCortes = cliente.getCont_cortes();
        Double custoProdutos = 0.0;
        Double contacorte = 0.0;
        Double saldobarb2 = 0.0;
        Double saldobarb3 = 0.0;
        Double saldoGeralBarb1 = 0.0;
        Double saldoGeralBarb2 = 0.0;
        Double saldoGeralBarb3 = 0.0;
        Double saldoGerente = 1000.0;
        Double valorbarbeiros = 0.0;
        Double conta = cliente.getConta();
        Double valorProdutoSeparado = 0.0;

        System.out.println(
                "\n\n\n\n\n\nbem vindo ao sistema da sua barbearia favorita\n\nVocê já possui cadastro em nosso sistema?\nCaso sim, digite seu codigo unico e instransferivel\nCaso não digite seu novo código.(lembre-se que este código será para sempre seu.)");
        cliente.setIdCliente(sc.nextInt());

        if (cliente.getIdCliente() == 1) {
            cliente.setNome(marcos.getNome());
            cliente.setCpf(marcos.getCpf());
            cliente.setEmail(marcos.getEmail());
            cliente.setEndereco(marcos.getEndereco());
            cliente.setTelefone(marcos.getTelefone());
            cliente.setDataNascimento(marcos.getDataNascimento());
        } else if (cliente.getIdCliente() == 2) {
            cliente.setNome(nikson.getNome());
            cliente.setCpf(nikson.getCpf());
            cliente.setEmail(nikson.getEmail());
            cliente.setEndereco(nikson.getEndereco());
            cliente.setTelefone(nikson.getTelefone());
            cliente.setDataNascimento(nikson.getDataNascimento());
        } else {
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

        System.out.println("\n\n\n\nbem vindo, " + cliente.getNome()
                + "! Escolha com qual barbeiro você deseja realizar seu servico\nJorge DIGITE-1\nJoão DIGITE-2\nPaulo DIGITE-3");
        int escolhabarb = sc.nextInt();
        if (escolhabarb == 1) {
            System.out.println("barbeiro Jorge escolhido");
        }
        if (escolhabarb == 2) {
            System.out.println("barbeiro João escolhido");
        }
        if (escolhabarb == 3) {
            System.out.println("barbeiro Paulo escolhido");
        }

        System.out.println(
                "\nqual servico você deseja realizar\ncorte simples: 25R$ DIGITE-1\ncorte + hidratação: 35R$ DIGITE-2\nbarba simples: 25R$ DIGITE-3\nbarba + hidratação: 35R$ DIGITE-4\ncabelo+barba= 45R$ DIGITE-5\ncabelo + barba + hidratacao: 60R$ DIGITE-6\nlimpeza de pele= 45R$ DIGITE-7\nservico completo: 100R$ DIGITE-8\nPara apenas comprar produtos digite qualquer outro valor");
        int escolhaservico = sc.nextInt();

        if (escolhaservico == 1) {
            conta += 25;
            System.out.println("bom serviço!");
            contCortes += 1;
            contacorte = 25.0;
        } else if (escolhaservico == 2) {
            conta += 35;
            System.out.println("bom serviço!");
            contCortes += 1;
            contacorte = 35.0;
        } else if (escolhaservico == 3) {
            conta += 25;
            System.out.println("bom serviço!");
            contCortes += 1;
            contacorte = 25.0;
        } else if (escolhaservico == 4) {
            conta += 35;
            System.out.println("bom serviço!");
            contCortes += 1;
            contacorte = 35.0;
        } else if (escolhaservico == 5) {
            conta += 45;
            System.out.println("bom serviço!");
            contCortes += 1;
            contacorte = 45.0;
        } else if (escolhaservico == 6) {
            conta += 60;
            System.out.println("bom serviço!");
            contCortes += 1;
            contacorte = 60.0;
        } else if (escolhaservico == 7) {
            conta += 45;
            System.out.println("bom serviço!");
            contCortes += 1;
            contacorte = 45.0;
        } else if (escolhaservico == 8) {
            conta += 100;
            System.out.println("bom serviço!");
            contCortes += 1;
            contacorte = 100.0;
        } else {
            conta = 0.0;
            cliente.getCont_cortes();
            System.out.println("vamos aos produtos");

        }
        System.out.println(
                "\n\n\n\n\n\n\n\n\n\nvocê deseja conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
        int conhecer_produtos = sc.nextInt();
        while (conhecer_produtos != 2) {
            System.out.println(
                    "digite o codigo de um de nossos produtos para adicionar ao carrrinho:\nMinoxidil:R$35 COD-12\nCreme de cabelo: R$50 COD-46");
            int cod_produto = sc.nextInt();
            if (cod_produto == 12) {
                conta = conta + 35;
                estoqueMinoxidil.setQuantidade(estoqueMinoxidil.getQuantidade() - 1);
                estoqueMinoxidil.setCount_Produto(estoqueMinoxidil.getCount_Produto() + 1);
                System.out.println(
                        "PEDIDO REALIZADO!!!\nVocê deseja continuar a conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
                conhecer_produtos = sc.nextInt();
            } else if (cod_produto == 46) {
                conta = conta + 50;
                estoqueCreme.setQuantidade(estoqueCreme.getQuantidade() - 1);
                estoqueCreme.setCount_Produto(estoqueCreme.getCount_Produto() + 1);
                System.out.println(
                        "PEDIDO REALIZADO!!!\n Você deseja continuar a conhecer e adquirir produtos em nossa loja?\n DIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
                conhecer_produtos = sc.nextInt();
            } else {
                System.out.println(
                        "CODIGO INVALIDO!!!\nVocê deseja continuar a conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
                conhecer_produtos = sc.nextInt();
            }
        }
        System.out.println(cliente.getCont_cortes());
        valorProdutoSeparado = conta - contacorte;
        System.out.println("\n\n\n\n\n\n\n\n\n\n");

            if (conta == 0) {
                System.out.println("seu atendimento foi encerrado sem compras, lhe aguardamos numa proxima visita, "
                        + cliente.getNome() + "!");
            } if (cliente.getCont_cortes() < 10) {
                
            
                System.out.println("Olá " + cliente.getNome()
                    + " espero que esteja satisfeito com nosso servico :)\nA conta pelo seu corte geral pelo seu serviço é de: "
                    + conta + "\n\n");
                if (escolhabarb == 1) {
                    saldobarb1 = contacorte - (contacorte / 2);
                    saldoGeralBarb1 = jorge.getRemuneracao() + saldobarb1;
                    saldoGeralBarb2 =joao.getRemuneracao();
                    saldoGeralBarb3 = paulo.getRemuneracao();
                    System.out.println(jorge.getNome() + " este corte lhe rendeu R$" + saldobarb1
                    + " e seu valor diário geral é de: R$" + saldoGeralBarb1 + "\n\n\n\n");
                    Double saldoSemDescontos = saldoGerente + valorProdutoSeparado + contacorte;
                    custoProdutos = custoProdutos + (minoxidil.getValorDeCusto() * estoqueMinoxidil.getCount_Produto())
                    + (creme.getValorDeCusto() * estoqueCreme.getCount_Produto());
                    valorbarbeiros = saldoGeralBarb1 + saldoGeralBarb2 + saldoGeralBarb3;
                    double descontos = valorbarbeiros + custoProdutos;
                    saldoGerente = saldoSemDescontos - descontos;

                    System.out.println("GERENTE:" +
                            "\nValor em caixa sem os descontos de custo: R$" + saldoSemDescontos +
                            "\na comissão dos barbeiros está nos valores de: Jorge: " + saldoGeralBarb1 + " João:"
                            + saldoGeralBarb2 + " Paulo:" + saldoGeralBarb3 +
                            "\nO valor de descontos de custo de produto+comissao de barbeiros é de R$ " + descontos +
                            "\nseu saldo geral após este corte é de: R$" + saldoGerente);
                }
                if (escolhabarb == 2) {
                    saldobarb2 = contacorte - (contacorte / 2);
                    saldoGeralBarb1 = jorge.getRemuneracao();
                    saldoGeralBarb2 =joao.getRemuneracao() + saldobarb2;
                    saldoGeralBarb3 = paulo.getRemuneracao();
                    System.out.println(joao.getNome() + " este corte lhe rendeu R$" + saldobarb2 + " e seu valor diário geral é de: R$" + saldoGeralBarb2 + "\n\n\n\n");
                    Double saldoSemDescontos = saldoGerente + valorProdutoSeparado + contacorte;
                    custoProdutos = custoProdutos + (minoxidil.getValorDeCusto() * estoqueMinoxidil.getCount_Produto())
                    + (creme.getValorDeCusto() * estoqueCreme.getCount_Produto());
                    valorbarbeiros = saldoGeralBarb1 + saldoGeralBarb2 + saldoGeralBarb3;
                    double descontos = valorbarbeiros + custoProdutos;
                    saldoGerente = saldoSemDescontos - descontos;

                    System.out.println("GERENTE:" +
                            "\nValor em caixa sem os descontos de custo: R$" + saldoSemDescontos +
                            "\na comissão dos barbeiros está nos valores de: Jorge: " + saldoGeralBarb1 + " João:"
                            + saldoGeralBarb2 + " Paulo:" + saldoGeralBarb3 +
                            "\nO valor de descontos de custo de produto+comissao de barbeiros é de R$ " + descontos +
                            "\nseu saldo geral após este corte é de: R$" + saldoGerente);
                }
                if (escolhabarb == 3) {
                    saldobarb3 = contacorte - (contacorte / 2);
                    saldoGeralBarb1 = jorge.getRemuneracao();
                    saldoGeralBarb2 =joao.getRemuneracao();
                    saldoGeralBarb3 = paulo.getRemuneracao() + saldobarb3;
                    System.out.println( paulo.getNome() + " este corte lhe rendeu R$" + saldobarb3
                            + " e seu valor diário geral é de: R$" + saldoGeralBarb3 + "\n\n\n\n");
                    Double saldoSemDescontos = saldoGerente + valorProdutoSeparado + contacorte;
                    custoProdutos = custoProdutos + (minoxidil.getValorDeCusto() * estoqueMinoxidil.getCount_Produto())
                            + (creme.getValorDeCusto() * estoqueCreme.getCount_Produto());
                    valorbarbeiros = saldoGeralBarb1 + saldoGeralBarb2 + saldoGeralBarb3;
                    double descontos = valorbarbeiros + custoProdutos;
                    saldoGerente = saldoSemDescontos - descontos;

                    System.out.println("GERENTE:" +
                            "\nValor em caixa sem os descontos de custo: R$" + saldoSemDescontos +
                            "\na comissão dos barbeiros está nos valores de: Jorge: " + saldoGeralBarb1 + " João:"
                            + saldoGeralBarb2 + " Paulo:" + saldoGeralBarb3 +
                            "\nO valor de descontos de custo de produto+comissao de barbeiros é de R$ " + descontos +
                            "\nseu saldo geral após este corte é de: R$" + saldoGerente);
                }

        }

        System.out.println("seu estoque de Minoxidil contem: " + estoqueMinoxidil.getQuantidade() + " unidades");
        System.out.println("seu estoque de Creme para cabelo contem: " + estoqueCreme.getQuantidade() + " unidades");

    }

}