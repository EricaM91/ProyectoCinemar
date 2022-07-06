package Peliculas;

public class Proyeccion extends Pelicula {
	
	private String fechaIni;
	private String fechaFin;
	
	
	public Proyeccion(String nombre, String genero, int duracion, String descripcion, String idioma, String fechaIni,
			String fechaFin) {
		super(nombre, genero, duracion, descripcion, idioma);
		
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
	}


	public String getFechaIni() {
		return fechaIni;
	}


	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}


	public String getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
	
	

}
