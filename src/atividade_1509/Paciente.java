package atividade_1509;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Paciente {
	public static int num = 0;
	private String nome;
	String sintoma;
	char sin;
	private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
	
	public void cadastra() {
		nome = JOptionPane.showInputDialog("infome o nome do paciente:");
		sintoma = JOptionPane.showInputDialog("informe o sintoma(gripe,febre ou nausea)");
		sin = sintoma.toUpperCase().charAt(0);
	
	}
	String exibirDadosPac(){
		return "Paciente - " + nome + " está com " + sintoma + "\n" + medicamentos + "\n";
	}
	public void adicionaMed(Medicamento m) {
		medicamentos.add(m);
	}
	public static int getNum() {
		return num;
	}
	public static void setNum(int num) {
		Paciente.num = num;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	public char getSin() {
		return sin;
	}
	public void setSin(char sin) {
		this.sin = sin;
	}
	public ArrayList<Medicamento> getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
}
