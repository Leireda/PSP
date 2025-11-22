package main;

public class Tortuga extends Animal {
	
	private int velocidad = 2; 
	private int posicion = 0;
	
	public Tortuga(String nombre) {
		super(nombre); 
	}

	
	
	@Override 
	public void posicion() {
		this.posicion = this.posicion + this.velocidad;
		System.out.println(" la tortuga " + nombre + "  avanza " + this.posicion + " metros "); 
		
	}


	protected int getPosicion() {
		return posicion;
	}
}	
