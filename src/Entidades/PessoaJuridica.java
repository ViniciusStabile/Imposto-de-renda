package Entidades;

public class PessoaJuridica extends Pessoa {

	private Integer Funcionarios;

	public PessoaJuridica() {

	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer funcionarios) {
		super(nome, rendaAnual);
		Funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return Funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		Funcionarios = funcionarios;
	}

	

	@Override
	public double imposto() { //Calculando o imposto onde se tiver mais de 10 funcionarios o imposto diminuie
		
		if (getFuncionarios() <= 10) {
			return getRendaAnual() * 0.16  ;
		} else {
			return getRendaAnual() * 0.14  ;
		}
		
	}

}
