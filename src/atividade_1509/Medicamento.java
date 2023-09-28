package atividade_1509;

import javax.swing.JOptionPane;

public class Medicamento {
	private String nome;
	private char contraind;
	private char ind;
	private char adm;
	
	
	
	
	void cadastra() {
		nome = JOptionPane.showInputDialog("informe o nome");
		adm = JOptionPane.showInputDialog("informe a administração(injetável,tópico ou oral)").toUpperCase().charAt(0);
		ind = JOptionPane.showInputDialog("informe a indicação(gripe,febre ou nausea)").toUpperCase().charAt(0);
		contraind = JOptionPane.showInputDialog("Informe a contraindicação(gripe,febre ou nausea)").toUpperCase().charAt(0);
	}
	String exibirDadosMed() {

		return "(NÚMERO QUE VAI AUMENTANDO) - " + nome + " |indicado a:" + ind + " |Contraindicado a:" + contraind + "\n";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getContraind() {
		return contraind;
	}
	public void setContraind(char contraind) {
		this.contraind = contraind;
	}
	public char getInd() {
		return ind;
	}
	public void setInd(char ind) {
		this.ind = ind;
	}
	public char getAdm() {
		return adm;
	}
	public void setAdm(char adm) {
		this.adm = adm;
	}
		
}