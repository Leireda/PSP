package main;


public class Main {
	
	public static void main (String [] args) {
		
		Tunel tunel = new Tunel(); 
	 
		Thread tortuga = new Thread (new Carrera(tunel, new Tortuga("tortuga"))); 
		Thread liebre = new Thread (new Carrera(tunel, new Tortuga("tortuga"))); 
		Thread pajaro = new Thread (new Carrera(tunel, new Tortuga("tortuga"))); 
		
		tortuga.start();
		liebre.start();
		pajaro.start();
		
	}
		
		
}		
		
		
		


