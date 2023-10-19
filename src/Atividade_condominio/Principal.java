package Atividade_condominio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import desafio_times.Time;



public class Principal {

	public static void main(String[] args) {
		ArrayList<Apartamento> apartamento = new ArrayList<Apartamento>();
		ArrayList <Despesa> despesas = new ArrayList<Despesa>();
		
		String menu = "1 - Cadastrar Apartamento\n" + "2 - Cadastrar Despesa\n" + "3 - Listagem 1\n"
				+ "4 - Listagem 2\n" + "5 - Sair";

		public static int numeroAp() {
			int con = 0;
			for(Apartamento a: apartamento) {		
				con ++;
			}
			return con;
		}
		
		int op = 0;

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:

				int numero = Integer.parseInt(JOptionPane.showInputDialog("qual o numero do apartamento"));

				String bloco = JOptionPane.showInputDialog("qual o Bloco do apartamento");

				double tamanho = Double.parseDouble(JOptionPane.showInputDialog("qual p tamho do apartamento"));

				String nome = JOptionPane.showInputDialog("qual o nome do propietario");

				apartamento.add(new Apartamento(numero, bloco, tamanho, nome));
				break;
			case 2:	
				despesas.add(new Despesa());
					
			}
				
				
		} while (op != 5);
			

		
		}	

		
}
