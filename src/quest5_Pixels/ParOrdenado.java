package quest5_Pixels;

public class ParOrdenado {
	
	private float x,y;

	public ParOrdenado(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}


	public String toString() {
		return "(" + x + "," + y + ")"; 
	}
	
	
	
	
	
	

}
