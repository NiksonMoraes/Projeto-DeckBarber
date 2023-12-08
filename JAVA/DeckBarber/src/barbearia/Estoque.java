package barbearia;

public class Estoque {

	private int quantidade;
	private Produto produto;
	private int count_Produto;
	
	public Estoque(int quantidade, Produto produto,int count_Produto) {
		this.quantidade = quantidade;
		this.produto = produto;
		this.count_Produto = count_Produto;
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}	

	public int getCount_Produto() {
		return count_Produto;
	}
	public void setCount_Produto(int count_Produto) {
		this.count_Produto = count_Produto;
	}	
	
}
