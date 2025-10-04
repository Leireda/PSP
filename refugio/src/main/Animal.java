package main;

public class Animal {
	
	public int edad; 
	public String nombre; 
	
	
	Animal (String nombre, int edad){
		
		this.edad = edad; 
		this.nombre = nombre; 
		
	}
	
	public  void mostrarDatos () {
		
		System.out.println(nombre + edad); 
		
	}
	
	@Override
	public String toString() {
		return nombre + edad; 
	}
	
	
}
