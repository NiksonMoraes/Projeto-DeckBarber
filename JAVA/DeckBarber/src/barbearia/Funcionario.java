package barbearia;

public class Funcionario extends Pessoa{

	private String cargo;
	private Double remuneracao;
	

	public Funcionario(String nome, String cpf, String dataNascimento, String email, String telefone, String endereco) {
		super(nome, cpf, dataNascimento, email, telefone, endereco);
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public Double getRemuneracao() {
		return remuneracao;
	}


	public void setRemuneracao(Double remuneracao) {
		this.remuneracao = remuneracao;
	}
	
	
}
