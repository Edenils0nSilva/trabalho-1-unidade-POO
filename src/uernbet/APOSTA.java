package uernbet;

public class APOSTA {
	
	private evento etapa1;
	private resultado resultado;
	private double val_APOSTA;
	public evento getEtapa1() {
		return etapa1;
	}
	public void setEtapa1(evento etapa1) {
		this.etapa1 = etapa1;
	}
	public APOSTA(evento etapa1,  resultado resultado, double val_APOSTA) {
		super();
		this.etapa1 = etapa1;
		this.resultado = resultado;
		this.val_APOSTA = val_APOSTA;
	}
	public void setResultado(resultado resultado) {
		this.resultado = resultado;
	}
	public resultado getResultado() {
		return resultado;
	}
	
	public double getVal_APOSTA() {
		return val_APOSTA;
	}
	public void setVal_aposta(double val_aposta) {
		this.val_APOSTA = val_aposta;
	}
	public double CalcularLucro(evento evento) {
		double ganho =0;
		if(resultado == resultado.TIME1)
			ganho = val_APOSTA *evento.getVal1();
		else if(resultado == resultado.EMPATE) {
			ganho = val_APOSTA *evento.getVal2();
		}
		else if(resultado == resultado.TIME2) {
			ganho = val_APOSTA *evento.getVal3();
		}
		
		
		return ganho;
	}
	public double getValorAPOSTA() {
		return val_APOSTA;
	}

}
