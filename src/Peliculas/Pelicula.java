package Peliculas;

public class Pelicula {
	
	private String nombre;
	private String genero;
	private int duracion;
	private String descripcion;
	private String idioma;
	
	
	public Pelicula(String nombre, String genero, int duracion, String descripcion, String idioma) {

		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
		this.descripcion = descripcion;
		this.idioma = idioma;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	
	public void mostrar() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	
	
	
	
	

}
