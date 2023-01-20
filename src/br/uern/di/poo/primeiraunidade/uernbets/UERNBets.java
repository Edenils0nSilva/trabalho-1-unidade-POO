package br.uern.di.poo.primeiraunidade;

import br.uern.di.poo.primeiraunidade.uernbets.APOSTA;
import br.uern.di.poo.primeiraunidade.uernbets.evento;
import br.uern.di.poo.primeiraunidade.uernbets.resultado;

public class UERNBets {
	
	 public static void main(String args[]){
	   	 evento quartasFinal1 = new evento ("Quartas de final da copa do mundo","Brasil", "Croácia", 1.18, 1.8, 2.5);
	   	 evento quartasFinal2 = new evento ("Quartas de final da copa do mundo", "Argentina", "Holanda", 1.4, 1.5, 1.9);
	   
	   	 APOSTA APOSTA1 = new APOSTA(quartasFinal1, resultado.TIME1, 1000);
	   	 APOSTA APOSTA2 = new APOSTA(quartasFinal1, resultado.EMPATE, 400);
	   	 APOSTA APOSTA3 = new APOSTA(quartasFinal2, resultado.TIME2, 2000);
	   	 
	   	 quartasFinal1.setResultado(resultado.TIME1);
	   	 quartasFinal2.setResultado(resultado.TIME2);
	   	 
		 evento semifinal1 = new evento("resultado da semifinal", quartasFinal1.TimeVencedor(), quartasFinal2.TimeVencedor(), 1.18, 1.4, 2.5);
		 semifinal1.setResultado(resultado.TIME1);
		 
	   	 if(APOSTA3.getResultado() == semifinal1.getResultado())
	   		 System.out.println("O APOSTAdor ganhou R$ " +
	   			 APOSTA1.CalcularLucro(semifinal1));
	   	 else
	   		 System.out.println("O APOSTAdor perdeu R$ " + 
	                     APOSTA1.getValorAPOSTA());
	   	 
	   	 
	    }

	}


