package quest5_Pixels;

public class CampoRetangular {
	
	private float comprimento_h,altura_v;
	ParOrdenado cantsupesq;
	private  Bola esfera;
	public CampoRetangular(ParOrdenado cantsupesq, float comprimento_h, float altura_v, Bola esfera) {
		super();
		this.cantsupesq = cantsupesq;
		this.comprimento_h = comprimento_h;
		this.altura_v = altura_v;
		this.esfera = esfera;
	}
	/**
	 * @return the cantsupesq
	 */
	public ParOrdenado getCantsupesq() {
		return cantsupesq;
	}
	/**
	 * @return the comprimento_h
	 */
	public float getComprimento_h() {
		return comprimento_h;
	}
	/**
	 * @return the altura_v
	 */
	public float getAltura_v() {
		return altura_v;
	}
	/**
	 * @return the esfera
	 */
	public Bola getEsfera() {
		return esfera;
	}
	
	public boolean MET1() {
		if (esfera.getPosi_centro().getX()+esfera.getRaio() >= comprimento_h/2 ) {
			return true;
			
			
		}
		else {
			return false;
	}
		
	}
	public boolean MET2() {
		if (esfera.getPosi_centro().getX()+esfera.getRaio() <= -comprimento_h/2 ) {
			return true;
		}
		else {
			return false;
		}
}
	public boolean MET3() {
		if (esfera.getPosi_centro().getY()+esfera.getRaio() >= altura_v/2 ) {
			return true;
}
		else {
			return false;
		}
	}
	public boolean MET4() {
		if (esfera.getPosi_centro().getY()+esfera.getRaio() <= -altura_v/2 ) {
			return true;
}
		else {
			return false;
		}
	}
	
	public void movimentaBola() {
		if (MET1()) {
			esfera.setVelo_hori(-esfera.getVelo_hori());
			}
		
		else if(MET2()) {
			esfera.setVelo_hori(-esfera.getVelo_hori());
		}
		else if(MET3()) {
			esfera.setVelo_vert(-esfera.getVelo_vert());
		}
		else if(MET4()) {
			esfera.setVelo_vert(-esfera.getVelo_vert());
		}
		
		
		
		esfera.movimenta();
		
		
	}
}
