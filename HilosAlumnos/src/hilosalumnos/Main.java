package hilosalumnos;

import java.util.Scanner; 

public class Main {
	
	
       public static void main (String [] args) {

    	   Scanner sc = new Scanner (System.in); 
    		
    	   String nombre; 
    	   
    	   System.out.println("introduce el primer nombre"); 
    	   nombre = sc.nextLine(); 
    	   
    	   Thread a = new Thread (new Alumno(nombre)); 
    	   
    	   System.out.println("introduce el segundo nombre"); 
    	   nombre = sc.nextLine();
    	   Thread s = new Thread (new Alumno(nombre)); 
    	   
    	   System.out.println("introduce el tercer nombre"); 
    	   nombre = sc.nextLine();
    	   Thread h = new Thread (new Alumno(nombre)); 
    	   
    	 
    	   try {
    	    a.start();
			a.join();
			s.start();
			s.join();
	        h.start();
	    	h.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
       }
}


