package barbearia;

public class Produto {
	
	private Double valorDeCusto;	
	private Double valorDeVenda;
	private String nomeDoProduto;
	
	
	public Produto(Double valorDeCusto, Double valorDeVenda, String nomeDoProduto) {
		super();
		this.valorDeCusto = valorDeCusto;
		this.valorDeVenda = valorDeVenda;
		this.nomeDoProduto = nomeDoProduto;
	}


	public Double getValorDeCusto() {
		return valorDeCusto;
	}


	public void setValorDeCusto(Double valorDeCusto) {
		this.valorDeCusto = valorDeCusto;
	}


	public Double getValorDeVenda() {
		return valorDeVenda;
	}


	public void setValorDeVenda(Double valorDeVenda) {
		this.valorDeVenda = valorDeVenda;
	}


	public String getNomeDoProduto() {
		return nomeDoProduto;
	}


	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

		
}
