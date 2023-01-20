package br.uern.di.poo.unidade1.construcao;

public class Servico {
	static final double LUXO = 0.1;
	static final double INSTALACAO = 70.0;
	static final double INSTALACAOPIVOT = 250.0;
	

	public static void calculaServico(Porta porthax) {
		
		double Metros = porthax.getAltura() * porthax.getLargura();
		double VAL_X = 0.0;
		
		if(porthax.ispivotan() == true) {
			VAL_X = (Metros * INSTALACAO)+ INSTALACAOPIVOT;
			if(porthax.getTipo() == Portas.LUXO)
				VAL_X = (Metros * INSTALACAO + INSTALACAOPIVOT)*LUXO;
		}
		else if(porthax.getTipo() == Portas.LUXO)
			VAL_X = (Metros*INSTALACAO)*LUXO;
		else
			VAL_X = Metros*INSTALACAO;
		
		System.out.println("-------------------------------------------\n");
		System.out.printf("O VALOR DA INSTALAÇÃO É: R$%.2f\n", VAL_X);
		System.out.println("-------------------------------------------\n");
	}
	
}




