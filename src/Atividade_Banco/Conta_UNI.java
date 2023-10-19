package Atividade_Banco;

public class Conta_UNI extends Conta_corrente {

	public Conta_UNI(int numero, String agencia, String nome, double saldo) {
		
		super(numero, agencia, nome, saldo);
		
	}	
	public boolean validaUNI(double saldo) {
		if ( saldo> 2000) {
			return false;
		}return true;
	}
}
