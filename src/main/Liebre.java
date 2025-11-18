package main;

public class Liebre {
	
	private String nombre; 
	private int velocidad = 5; 
	private int posicion; 
	private  int caminar; 
	
	public Liebre(String nombre) {
		super(); 
	}
	
	public int getPosicion() {
		return posicion; 
		
		
	}
	
	
	public void posicion() {
		
		if(caminar != 4) {
			posicion++; 
			System.out.println("la liebre" + posicion + "camina tantos" + caminar + "metros"); 
		} 
		
		else if(caminar == 10) {
			posicion--; 
			System.out.println("la liebre" + posicion + "esta quieta"); 
		} 
		
	}

}
