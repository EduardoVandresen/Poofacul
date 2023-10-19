package Atividade_Banco;

import javax.swing.JOptionPane;

public class Conta {
	private int numero;
	private String Agencia;
	private String nome;
	private double saldo;
	
	public Conta(int numero, String agencia, String nome, double saldo) {
		super();
		this.numero = numero;
		this.Agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	
	public void deposito(double numero) {
		 this.saldo += numero;
	}
	public void Saque(double numero) {
		this.saldo -= numero;
	}
	
	
	
	
	
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return Agencia;
	}
	public void setAgencia(String agencia) {
		Agencia = agencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
