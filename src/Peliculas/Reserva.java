package Peliculas;

public class Reserva {
	
	private String FechaCompra;
	private String FechaProyeccion;
	
	
	public Reserva(String fechaCompra, String fechaProyeccion) {
	
		FechaCompra = fechaCompra;
		FechaProyeccion = fechaProyeccion;
	}


	public String getFechaCompra() {
		return FechaCompra;
	}


	public void setFechaCompra(String fechaCompra) {
		FechaCompra = fechaCompra;
	}


	public String getFechaProyeccion() {
		return FechaProyeccion;
	}


	public void setFechaProyeccion(String fechaProyeccion) {
		FechaProyeccion = fechaProyeccion;
	}
	
	
	
	

}
