package Entidades;

public class PessoaFisica extends Pessoa {

	private Double gastosSaude;

	public PessoaFisica() {

	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}


	@Override
	public double imposto() {     //Calculando o imposto e nesse imposto o gasto com saude é retirado na metade
		
		if (getRendaAnual() < 20000.00) {
			return getRendaAnual() * 0.15 - gastosSaude * 0.50;
		} else {
			return getRendaAnual() * 0.25 - gastosSaude * 0.50;
		}
		
	}

}
