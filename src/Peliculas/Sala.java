package Peliculas;

public class Sala extends Butacas {

	private int sala;
	private String tipo;
	
	
	
	public Sala(int fila, int columna, int sala, String tipo) {
		super(fila, columna);
		this.sala = sala;
		this.tipo = tipo;
	}



	public int getSala() {
		return sala;
	}



	public void setSala(int sala) {
		this.sala = sala;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void mostrar () {
		System.out.println("");
		System.out.println("");
		
	}
	
}
