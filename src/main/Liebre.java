package main;

public class Liebre extends Animal{
	
	private int velocidad = 5; 
	private int posicion = 0; 
	private  int caminar = 0; 
	private int quieta; 
	
	public Liebre(String nombre) {
		super(nombre); 
	}
	
	public int getPosicion() {
		return posicion; 
	}
	
	
	public void posicion() {
		
		if(caminar != 4) {
			posicion = posicion + velocidad; 
			System.out.println(" la liebre " + nombre + "  avanza " + this.posicion + " metros "); 
			caminar++; 
			quieta = 10; 
			
		} 
		
		else if(caminar == 4) {
			System.out.println(" la liebre " + nombre + " esta quieta " + quieta + " segundos ");
			quieta--; 
			
			if(quieta == 0) {
				caminar = 0; 
			}
			
		} 
		
	}

}
