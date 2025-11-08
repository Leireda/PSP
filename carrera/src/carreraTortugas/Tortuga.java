package carreraTortugas;

import java.util.concurrent.Semaphore; 

public class Tortuga implements Runnable {
	
	private String nombre; 
	private int  velocidad; 
	private int avanzar = 0; 
	private Semaphore semaforo; 
	
	
	
	public Tortuga (String nombre, Semaphore semaforo){
		
		this.nombre = nombre; 
		this.semaforo = semaforo; 
		this.velocidad = 1; 
		
	
		
	}
		public void posicion () {
			
			this.avanzar = this.avanzar + this.velocidad; 
			System.out.println(" la tortuga "  +  nombre +  " avanzo " + avanzar + " metros ");
			
		}
		
		@Override
		public void run() {
			
			for(int k = 0; k < 35;  k++) {
				if(k == 20) {
					try {
						semaforo.acquire();
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}
				} else if(k ==30) {
					semaforo.release();
					
				}
				this.posicion(); 
				 	try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}
				
			}
			
			
		}

		
}
