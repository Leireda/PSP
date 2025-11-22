package main;

public class Pajaro extends Animal{
	
	private int velocidad = 3; 
	private int posicion; 
    

	public Pajaro(String nombre) {
		super(nombre);
		
	}

      public int getPosicion() {
		return posicion;
    	  
    	  
      }
      
      
      public void volar() {
    	  int aleatorio = (int) (Math.random()*10 + 1);
    	  
    	  if (aleatorio > 7) {
    		  velocidad = 10; 
    	  } else if (aleatorio < 3) {
    		  velocidad = -10; 
    	  } else {
    		  velocidad = 3; 
    	  }
      }
      
      public void seguir () {
		  if(velocidad == 3) {
			  System.out.println(" el pajaro " + nombre + " avanzo " + posicion + " metros ");
		  } else if (velocidad == 10) {
			  System.out.println(" el pajaro " + nombre + " volo y avanzo " + posicion + " metros ");
		  }
      }

	  @Override
	  public void posicion() {
		
		  volar(); 
		  if (posicion > 40 && posicion < 50 ) {
			  posicion = 50; 
			  System.out.println(" el pajaro " + nombre + " volo y avanzo " + posicion + " metros ");
		  } else if (posicion > 140 && posicion < 150 ) {
			  posicion = 150; 
			  System.out.println(" el pajaro " + nombre + " volo y avanzo " + posicion + " metros ");
		  } else {
			  this.posicion = posicion + velocidad; 
			  	if (velocidad == -10) {
				  if (posicion >= 50 && posicion <  61 || posicion >= 150 && posicion < 161) {
					  volar();
					  seguir();
				  } else {
					  System.out.println(" el pajaro " + nombre + " volo hacia atras y retrocedio hasta los  " + posicion + " metros ");
				  }
			  } else {
				  seguir();
			  }
		  }		     
	  }
}
