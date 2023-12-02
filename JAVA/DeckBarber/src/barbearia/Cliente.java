package barbearia;

public class Cliente extends Pessoa {

	private int idCliente;
	private int cont_cortes;
	private double conta;

	public Cliente( String nome ,String cpf ,String dataNascimento ,String email ,String telefone ,String endereco,int idCliente,int cont_cortes, Double conta) {
		super(nome, cpf, dataNascimento, email, telefone, endereco);
		this.idCliente = idCliente;
		this.cont_cortes = cont_cortes;
		this.conta = conta;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getCont_cortes() {
		return cont_cortes;
	}

	public void setCont_cortes(int cont_cortes) {
		this.cont_cortes = cont_cortes;
	}

	public double getConta() {
		return conta;
	}

	public void setConta(double conta) {
		this.conta = conta;
	}

	
}	
