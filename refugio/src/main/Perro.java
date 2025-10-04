package main;

public class Perro extends Animal {
	
	public String raza; 
	
	
	Perro( String nombre, int edad, String raza) {
		super(nombre, edad); 
		
		this.raza = raza; 
		
	}
	
	
	public static void ladrar (String [] args) {
		
		System.out.println("guau guau");
	}
	
    @Override 
    public String toString() {
    	return super.toString() + raza; 
    }
}
