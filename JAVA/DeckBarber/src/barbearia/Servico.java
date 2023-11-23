package barbearia;

public class Servico {
	
	private String nomeDoServico;
	private Double valorDoServico;
	
	
	public Servico(String nomeDoServico, Double valorDoServico) {
		this.nomeDoServico = nomeDoServico;
		this.valorDoServico = valorDoServico;
	}
	
	
	public String getNomeDoServico() {
		return nomeDoServico;
	}
	public void setNomeDoServico(String nomeDoServico) {
		this.nomeDoServico = nomeDoServico;
	}
	public Double getValorDoServico() {
		return valorDoServico;
	}
	public void setValorDoServico(Double valorDoServico) {
		this.valorDoServico = valorDoServico;
	}
	

}
