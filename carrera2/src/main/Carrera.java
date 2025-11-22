package main;

import java.util.concurrent.Semaphore; 

public class Carrera implements Runnable{
	
	public Tunel semaforo; 
	public Animal animal; 
	
	
	
	
	
public Carrera(Tunel semaforo, Animal animal) {
		super();
		this.semaforo = semaforo;
		this.animal = animal;
	

}



	@Override
	public void run() {
		while (animal.getPosicion() < 300) {
				animal.posicion(); 
			if(animal.getPosicion() == 50) {
				try {
					semaforo.ticketEntrada();
					System.out.println(animal.getNombre() + " esta en el tunel "); 
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			} else if(animal.getPosicion() == 150) {
				semaforo.dejarTicket();
				System.out.println(animal.getNombre() + " sale del tunel ");
				
			}
		 	try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}	
		}
		System.out.println(animal.getNombre() + " llego a la meta ");
		System.exit(0);
	}
}	
