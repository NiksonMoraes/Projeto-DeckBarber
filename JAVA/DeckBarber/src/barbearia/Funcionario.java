package barbearia;

public class Funcionario extends Pessoa{

	private String cargo;
	private Double remuneracao;
	private int idFuncionario;

	public Funcionario(String nome, String cpf, String dataNascimento, String email, String telefone, String endereco,int idFuncionario, Double remuneracao) {
		super(nome, cpf, dataNascimento, email, telefone, endereco);
		this.idFuncionario = idFuncionario;
		this.remuneracao = remuneracao;
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
	
	public void atenderCliente(){
		System.out.println("Atendendo Cliente");
	}


	public int getIdFuncionario() {
		return idFuncionario;
	}


	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	
}
