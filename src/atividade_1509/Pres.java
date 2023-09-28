package atividade_1509;

public class Pres {

	private String nomeP;
	private char contraindP;
	private char indP;
	private char admP;
	
	public boolean Valida() {
		if(getContraindP() == getIndP()){
			return  false;
		}return  true;
	}
	
    public String getNomeP() {
		return nomeP;
	}
	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}
	public char getContraindP() {
		return contraindP;
	}
	public void setContraindP(char contraindP) {
		this.contraindP = contraindP;
	}
	public char getIndP() {
		return indP;
	}
	public void setIndP(char indP) {
		this.indP = indP;
	}
	public char getAdmP() {
		return admP;
	}
	public void setAdmP(char admP) {
		this.admP = admP;
	}

}
