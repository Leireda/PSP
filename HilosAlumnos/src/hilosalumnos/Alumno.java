package hilosalumnos;

public class Alumno implements Runnable {
		
	String mensaje; 
		
		public Alumno(String nombre) {
			
         
			if(nombre.toLowerCase().equals("pepito")) {
				this.mensaje = "mira que ser yo pepito... pues me cierro"; 
			} else { 
				this.mensaje = "hola soy " + nombre + " y este es mi mensaje nuemro "; 
			}
			
	}
		public void run() {
			for(int k = 1; k <=  5; k++) {
		     if (mensaje.equals("mira que ser yo pepito... pues me cierro")) {
		    	 System.out.println(mensaje); 
		    	 return; 
			}else {
				System.out.println(mensaje + k); 
			}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
  }

