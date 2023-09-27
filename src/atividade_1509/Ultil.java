package atividade_1509;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ultil {
	public static Paciente selecionaPaciente (ArrayList<Paciente> lista) {
		String menuAl = "";
		int cont = 1;
		for (Paciente a : lista) {
			menuAl += cont + " - " + a.getNome()+"\n";
			cont ++;
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuAl));
		return lista.get(escolha-1);
	}
	public static Medicamento selecionaMedicamento (ArrayList<Medicamento> lista) {
		String menuAl = "";
		int cont = 1;
		for (Medicamento d : lista) {
			menuAl += cont + " - " + d.getNome()+"\n";
			cont ++;
		}
		int es = Integer.parseInt(JOptionPane.showInputDialog(menuAl));
		return lista.get(es-1);
		
	}
		
}
