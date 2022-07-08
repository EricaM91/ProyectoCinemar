package Peliculas;

public class Butacas {

	
	private int Fila;
	private int Columna;
	private boolean Disponible;



	public Butacas(int fila, int columna, boolean disponible) {
		this.Fila = fila;
		this.Columna = columna;
		this.Disponible = disponible;
	}

	public boolean isDiponible() {
		return Disponible;
	}



	public void setDiponible(boolean diponible) {
		this.Disponible = diponible;
	}



	public int getFila() {
		return Fila;
	}



	public void setFila(int fila) {
		this.Fila = fila;
	}



	public int getColumna() {
		return Columna;
	}



	public void setColumna(int columna) {
		this.Columna = columna;
	}
	
	/*public boolean VerificarButaca(int seleccionFila, int seleccionColumna) {
		int O  = Ocupado;
		boolean verificar = seleccionFila > Fila || 
				             seleccionColumna > Columna ||
				             seleccionFila == O   || seleccionColumna == O;
	    if (verificar) {
	    	
	    }
	    else if () {
	    	
	    }
	    
	    
				             
		
		return true;
	*/
	 
}
