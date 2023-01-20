package br.uern.di.poo.unidade1.construcao;

public enum Portas {
	SIMPLES("MADEIRA COMPENSADA", "FECHADURA SIMPLES", 50),
	PADRAO("MADEIRA ANDIROBE", "FECHADURA DE ENCAIXE", 140),
	LUXO("MADEIRA DE IPE", "FECHADURA TETRA", 350);
	
	//VARIAVEIS
	private final String material, fechadura;
	private final int valorM;
	
	//CONSTREUTOR
	private Portas(String material, String fechadura, int valorM) {
		this.material = material;
		this.fechadura = fechadura;
		this.valorM = valorM;
	}
	
	
	public String getMaterial() {
		return material;
	}

	public String getFechadura() {
		return fechadura;
	}

	public int getValorM() {
		return valorM;
	}
}


