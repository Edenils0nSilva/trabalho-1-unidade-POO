package br.uern.di.poo.unidade1.construcao;

public class Main {
public static void main(String[] args) {
		
		Porta servisso1 = new Porta();
		Porta servisso2 = new Porta(Portas.LUXO, 0.6, 2.5, true);
		Porta servisso3 = new Porta(Portas.LUXO, 0.7,3.0, false);
		Porta servisso4 = new Porta(Portas.PADRAO, 0.5, 1.89, true);
		
		servisso1.exibePorta();
		Servico.calculaServico(servisso1);
		servisso2.exibePorta();
		Servico.calculaServico(servisso2);
		servisso3.exibePorta();
		Servico.calculaServico(servisso3);
		servisso4.exibePorta();
		Servico.calculaServico(servisso4);
		
	}

}



