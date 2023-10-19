package Atividade_Banco;

public class Conta_Especial extends Conta_corrente {

	private double limite;

	public Conta_Especial(int numero, String agencia, String nome, double saldo, double limite) {
		super(numero, agencia, nome, saldo);
		this.limite = limite;
	}

	@Override
	public boolean validasaque(double saque) {
		if(saque<=limite) {
		return super.validasaque(saque);
	}return false;
	}
	
	@Override
	public boolean validatrans(double tranferencia) {
		if(tranferencia<=limite) {
		return super.validatrans(tranferencia);
	}return false;
	}
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
