package main;

public class Gato extends Animal {

	
	public int longitudBigotes; 
	
	
	 Gato ( String nombre, int edad, int longitudBigotes) {
		 
		 super (nombre, edad); 
		 
		 this.longitudBigotes = longitudBigotes; 
		 
	}
	
	
	public static void maullar (String [] args) {
		
		System.out.println("miau miau"); 
		
	}
	
	@Override
	public String toString () {
		return super.toString() + longitudBigotes; 
	}

}
