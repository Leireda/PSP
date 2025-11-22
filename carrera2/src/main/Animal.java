package main;

public abstract class Animal {

	protected  String nombre;

	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public abstract void posicion(); 
	public String getNombre() {
		return nombre; 
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	protected abstract int getPosicion(); 
		
	}
	
	

