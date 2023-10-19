package Atividade_condominio;

public class Apartamento {
	private int numero;
	private String bloco;
	private double tamanho;
	private String nome;
	
	
	public Apartamento(int numero, String bloco, double tamanho, String nome) {
		super();
		this.numero = numero;
		this.bloco = bloco;
		this.tamanho = tamanho;
		this.nome = nome;
	}

	
	
	
	
	

	@Override
	public String toString() {
		return "Apartamento [numero=" + numero + ", bloco=" + bloco + ", tamanho=" + tamanho + ", nome=" + nome + "]";
	}







	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getBloco() {
		return bloco;
	}


	public void setBloco(String bloco) {
		this.bloco = bloco;
	}


	public double getTamanho() {
		return tamanho;
	}


	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	} 
	
	
}
