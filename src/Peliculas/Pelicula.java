package Peliculas;

public class Pelicula {
	
	private String Nombre;
	private String Genero;
	private int Duracion;
	private String Descripcion;
	private String Idioma;
	
	
	public Pelicula(String nombre, String genero, int duracion, String descripcion, String idioma) {

		this.Nombre = nombre;
		this.Genero = genero;
		this.Duracion = duracion;
		this.Descripcion = descripcion;
		this.Idioma = idioma;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}


	public String getGenero() {
		return Genero;
	}


	public void setGenero(String genero) {
		this.Genero = genero;
	}


	public int getDuracion() {
		return Duracion;
	}


	public void setDuracion(int duracion) {
		this.Duracion = duracion;
	}


	public String getDescripcion() {
		return Descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.Descripcion = descripcion;
	}


	public String getIdioma() {
		return Idioma;
	}


	public void setIdioma(String idioma) {
		this.Idioma = idioma;
	}
	
	
	public void mostrar() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	
	
	
	
	

}
