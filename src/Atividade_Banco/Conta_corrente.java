package Atividade_Banco;

public class Conta_corrente extends Conta {

	public Conta_corrente(int numero, String agencia, String nome, double saldo) {
		super(numero, agencia, nome, saldo);

	}

	public boolean validasaque(double saque) {
		if(getSaldo()<saque) {
			return false;
		}return true;
	}
	public boolean validatrans(double tranferencia) {
		if (getSaldo() < tranferencia) {
			return false;
		}
		return true;
	}

}
