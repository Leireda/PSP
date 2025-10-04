package main;
import java.util.Scanner;
import java.util.ArrayList; 

public class Main {	

public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
	
		ArrayList<Perro> per = new ArrayList<>(); 
		
		ArrayList<Gato> gat = new ArrayList<>();
		
		int edad; 
		String nombre; 
		int longitudBigotes; 
		String raza; 
		
		int x = 7; 
		
		
		while (x != 0) {
			System.out.println("0 salir, 1 añadirAnimal, 2 mostrarDatos"); 
			x = sc.nextInt(); 
			
			if (x == 1) {
				System.out.println("1 añadirGatos, 2 añadirPerros"); 
				int y = sc.nextInt(); 
				if (y == 1) {
					System.out.println("nombre"); 
					nombre = sc.next(); 
					System.out.println("edad"); 
					edad = sc.nextInt(); 
					System.out.println("longitudBigotes");
					longitudBigotes = sc.nextInt(); 
					Gato gato = new Gato(nombre, edad, longitudBigotes); 
					gat.add(gato); 
					
					
				} else if (y == 2) {
					System.out.println("nombre"); 
					nombre = sc.next(); 
					System.out.println("edad"); 
					edad = sc.nextInt();
					System.out.println("raza"); 
					raza = sc.next(); 
					Perro perro = new Perro (nombre, edad, raza); 
					per.add(perro);
					
			       	
				}
				
			} else if (x == 2) {
				System.out.println("1 mostrarGatos, 2 mostrarPerros"); 
				int y = sc.nextInt();
				if (y == 1) {
					for(int i = 0; i < gat.size(); i++) {
						System.out.println(gat.get(i)); 
					}
					
				} else if (y == 2) {
					for(int i = 0; i < per.size(); i++) {
						System.out.println(per.get(i)); 
					}
					
				} 
				
			} else if (x == 0) {
				return; 
			}
			
			
		}
		
		

	}

}
