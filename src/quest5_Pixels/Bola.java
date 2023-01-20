package quest5_Pixels;

public class Bola {
	
	ParOrdenado posi_centro;
	float velo_hori,velo_vert;
	final int Raio = 5;
	public Bola(ParOrdenado posi_centro, float velo_hori, float velo_vert) {
		super();
		this.posi_centro = posi_centro;
		this.velo_hori = velo_hori;
		this.velo_vert = velo_vert;
	}
	/**
	 * @return the velo_hori
	 */
	public float getVelo_hori() {
		return velo_hori;
	}
	/**
	 * @param velo_hori the velo_hori to set
	 */
	public void setVelo_hori(float velo_hori) {
		this.velo_hori = velo_hori;
	}
	/**
	 * @return the velo_vert
	 */
	public float getVelo_vert() {
		return velo_vert;
	}
	/**
	 * @param velo_vert the velo_vert to set
	 */
	public void setVelo_vert(float velo_vert) {
		this.velo_vert = velo_vert;
	}
	/**
	 * @return the posi_centro
	 */
	public ParOrdenado getPosi_centro() {
		return posi_centro;
	}
	/**
	 * @return the rai
	 */
	public int getRaio() {
		return Raio;
	}
	public void movimenta(){
		posi_centro.setX(velo_hori + posi_centro.getX());
		posi_centro.setY(velo_vert + posi_centro.getY());
	}
	@Override
	public String toString() {
		return "\"A bola está na posição" +posi_centro.toString()+ "se movendo a uma velocidade ("+velo_hori  +","+velo_vert + ") pixels por movimento\"";
	}
	
}
	
