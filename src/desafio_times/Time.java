package desafio_times;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Time {
	
	private String nome;
	 ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome time"));
		String continua = "";
		do {
			Jogador j = new Jogador();
			j.cadastrar();
			jogadores.add(j);
			continua = JOptionPane.showInputDialog("Mais jogadores? S/N");
		}while(continua.equalsIgnoreCase("S"));

	}
	
	public String exibir() {
		String dados = "*** " + getNome() + "***\n";
		for(Jogador j: jogadores) {
			dados += j.exibirj();
		}
		return dados;
		}
	
	public String artilheiroTime() {
		String art = "";
		for(Jogador j : jogadores ) {
			if(j.getGols() > j.getGols()) {
				art = j.exibirj();
			}
		}return art;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	

}