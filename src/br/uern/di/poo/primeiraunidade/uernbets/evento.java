package br.uern.di.poo.primeiraunidade.uernbets;

public class evento {
	
	private String descricao,equipe1,equipe2;
	private double val1,val2,val3;
	private resultado resultado;
	
	public evento(String descricao, String equipe1, String equipe2, double val1, double val2, double val3) {
		super();
		this.descricao = descricao;
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEquipe1() {
		return equipe1;
	}
	public void setEquipe1(String equipe1) {
		this.equipe1 = equipe1;
	}
	public String getEquipe2() {
		return equipe2;
	}
	public void setEquipe2(String equipe2) {
		this.equipe2 = equipe2;
	}
	public double getVal1() {
		return val1;
	}
	public void setVal1(double val1) {
		this.val1 = val1;
	}
	public double getVal2() {
		return val2;
	}
	public void setVal2(double val2) {
		this.val2 = val2;
	}
	public double getVal3() {
		return val3;
	}
	public void setVal3(double val3) {
		this.val3 = val3;
	}
	public void setResultado(resultado resultado) {
		this.resultado = resultado;
	}
	public resultado getResultado(){
		return resultado;
	}
	
	public String TimeVencedor() {
		if (resultado == resultado.TIME1){
			return equipe1;
		}
		else if (resultado == resultado.TIME2){
		return equipe2;
		}
		else {
			return "EMPATE";
		}
			
	}

}
