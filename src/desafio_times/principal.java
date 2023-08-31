package desafio_times;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
	ArrayList<Time> lista = new ArrayList<Time>();
		
		String menu = "1 - Cadastrar\n"
				+ "2 - Listar todos jogadores de um time\n"
				+ "3 - Verificar artilheiro do campeonato\n"
				+ "4 - Verificar qual time fez mais gols no campeonato\n\n"
				+ "5 - Sair";	
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op==1) {
				Time t = new Time();
				t.cadastra();
				lista.add(t);
			}if(op==2) {
				String todos = "";
				for(Time t:lista) {
					todos += t.exibir();			
				}
				JOptionPane.showInternalMessageDialog(null, todos);
			}if(op==3) {
				String Artilheiro = "";
				for(Time t:lista) {
					Artilheiro += t.artil();
				}
				JOptionPane.showInternalMessageDialog(null, Artilheiro);
			}
				
	
		}while(op!=5);

	}

}
