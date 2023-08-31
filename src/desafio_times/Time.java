package desafio_times;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Time {
	
	private String nome;
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	public String arti = "";
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
	
	public String artil() {
		Jogador art = jogadores.get(0);
		String arti = "*** " + getNome() + "***\n";
				for(Jogador j : jogadores ) {
			if(j.getGols() > art.getGols()) {
				arti = j.getNome();
			}
		}
		return arti;
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

	public String getArti() {
		return arti;
	}

	public void setArti(String arti) {
		this.arti = arti;
	}
	
	

}