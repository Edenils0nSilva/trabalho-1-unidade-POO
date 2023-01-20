package quest5_Pixels;

import java.util.Scanner;

public class TesteCampo {
	public static void main (String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println(" INFORME A ALTURA DO CAMPO:\n ");
	float altura = entrada.nextFloat();
	
	System.out.println(" INFORME A LARGURA DO CAMPO:\n ");
	float largura = entrada.nextFloat();
	
	System.out.println(" INFORME O VALOR DO CANTO SUPERIOR X:\n ");
	int  x = entrada.nextInt();
	
	System.out.println(" INFORME O VALOR DO CANTO SUPERIOR Y:\n ");
	int y = entrada.nextInt();
	 
	ParOrdenado dadoscampo = new ParOrdenado(x,y);
	
	System.out.println(" INFORME O VALOR DO  RAIO DA BOLA:\n ");
	int raio = entrada.nextInt();
	
	System.out.println(" INFORME O VALOR DA VELOCIDADE HORIZONTAL:\n ");
	float velohori = entrada.nextFloat();
	
	System.out.println(" INFORME O VALOR DA VELOCIDADE VERTICAL:\n");
	float veloverti = entrada.nextFloat();
	
	System.out.println(" INFORME O VALOR INICIAL DA BOLA X :\n ");
	  x = entrada.nextInt();
	
	System.out.println(" INFORME OUTRO VALOR INICIAL DA BOLA Y :\n ");
	y = entrada.nextInt();
	
	ParOrdenado dadosbola = new ParOrdenado(x,y);
	
	 Bola bol = new Bola(dadosbola,velohori,veloverti );
	 
	 CampoRetangular campret =  new CampoRetangular (dadoscampo,altura,largura, bol); 
	
	for (int i = 0; i < 30; i++) {
		campret.movimentaBola();
		System.out.println( bol.toString());
	}
	
	
	entrada.close();	

		
	}
}
