package Entidades;

public abstract class Pessoa {  //classe abstrata para servir de modelo para as outras duas
	
	private String nome;
	private Double rendaAnual;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double imposto(); // função abstrata para servir de modelo tambêm
	

}
