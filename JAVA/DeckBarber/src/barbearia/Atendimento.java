package barbearia;

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
	
	
}
