package main;

import java.util.concurrent.Semaphore; 

public class Carrera implements Runnable{
	
	public Semaphore semaforo; 
	public Animal animal; 
	
	
	
	
	
public Carrera(Tunel tunel, Animal animal) {
		super();
		this.semaforo = semaforo;
		this.animal = animal;
	

}



	@Override
	public void run() {
		for(int k = 0; k < 1000;  k++) {
			if(k == 50) {
				try {
					semaforo.acquire();
					System.out.println(animal.getNombre() + "esta en el tunel"); 
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			} else if(k ==1) {
				semaforo.release();
				System.out.println(animal.getNombre() + "sale del tunel");
				
			}
			animal.posicion(); 
			 	try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			
		}
	}
}	
