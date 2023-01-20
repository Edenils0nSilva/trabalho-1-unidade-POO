package quest5_Pixels; 

import java.util.Scanner;
import java.util.Random;

public class TesteCampo2 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("INFORME A LARGURA DO CAMPO");
		float largcomp = entrada.nextFloat();
		System.out.println("INFORME A ALTURA DO CAMPO");
		float altucomp = entrada.nextFloat();
		System.out.println("INFORME A DIMENSÃO DO RAIO");
		ParOrdenado bolinha = new ParOrdenado(0,0);
		float alturaminima = (altucomp * 5/100);
		float alturamaxima = (altucomp *10/100);
		float largmini = (largcomp * 5/100);
		float largmaxi = (largcomp * 10/100);
		
		Random random = new Random();
        float bolahorizont =  random.nextFloat(largmaxi - largmini) + largmini;
        float bolaverti    =  random.nextFloat(alturamaxima - alturaminima) + largmini;
        Bola bol = new Bola(bolinha,bolahorizont,bolaverti);
        CampoRetangular endcamp = new CampoRetangular(bolinha,largcomp,altucomp,bol);
        
        for (int i = 0; i < 30; i++) {
    		endcamp.movimentaBola();
    		System.out.println( bol.toString());
    	}
		entrada.close();
	}
	

}
