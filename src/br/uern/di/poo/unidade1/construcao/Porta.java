package br.uern.di.poo.unidade1.construcao;

public class Porta {
	private Portas tipo;
	private double largura, altura;
	private boolean pivotan;
	private double valor;
	
	
	final private int PIVOTANTE = 350;
	final private double LARGURA = 0.70;
	final private double ALTURA = 1.8;
	
	// CONSTRUTORES  
	
	public Porta() {
		this.tipo = Portas.SIMPLES;
		this.largura = LARGURA;
		this.altura = ALTURA;
		this.pivotan = false;
	}


	public Porta(Portas tipo, double largura, double altura, boolean pivotan) {
		this.tipo = tipo;
		this.largura = largura;
		this.altura = altura;
		this.pivotan = pivotan;
		System.out.println("A largura é "+largura);
	}
	
	//FUNÇÕES 


	public double calculaPreco() {
		double metros = largura * altura;
		
		if(tipo == Portas.SIMPLES)
			valor = metros*50;
		else if(tipo == Portas.PADRAO)
			valor = metros*140;
		else if(tipo == Portas.LUXO)
			valor = metros*350;
		return valor;
	}
	
	public void exibePorta() {
		System.out.println("******* INFORMAÇOES SOBRE PORTAS ***********");
		System.out.println("TIPO DA PORTA: " +   this.tipo               );
		System.out.println("LARGURA DA PORTA: " +   this.largura         );
		System.out.println("ALTURA PORTA: " +   this.altura              );
		System.out.println("PORTA PIVOTANTE: "  + this.pivotan           );
		System.out.printf("VALOR DA PORTA R$: %.2f\n", calculaPreco()    );
		System.out.println("********************************************");
	}
	
	public Portas getTipo() {
		return tipo;
	}

	public void setTipo(Portas tipo) {
		this.tipo = tipo;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean ispivotan() {
		return pivotan;
	}

	public void setpivotan(boolean pivotan) {
		this.pivotan = pivotan;
	}

	public int getPIVOTANTE() {
		return PIVOTANTE;
	}

	public double getLARGURA() {
		return LARGURA;
	}

	public double getALTURA() {
		return ALTURA;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}


