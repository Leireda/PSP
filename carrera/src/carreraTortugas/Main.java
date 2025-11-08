package carreraTortugas;

import java.util.concurrent.Semaphore; 


public class Main {
	
	public static void main (String [] args) {

		Semaphore semaforo = new Semaphore(1); 
		Thread a = new Thread (new Tortuga ("tortu", semaforo)); 
		Thread j = new Thread (new Tortuga ("torta", semaforo)); 
		Thread d= new Thread (new Tortuga ("torti", semaforo)); 
		
		a.start();
		j.start();
		d.start();
		
	}

	
}
