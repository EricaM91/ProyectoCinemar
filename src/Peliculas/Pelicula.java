package Peliculas;

public class Pelicula {
	private int idpelicula;
	private String Nombre;
	private String Genero;
	private int Duracion;
	private String Descripcion;
	private String Idioma;
	private int IdSala;
	
	
	public Pelicula(int idpelicula, String nombre, String genero, int duracion, String descripcion, String idioma, int idSala ) {
		
        this.idpelicula = idpelicula;
		this.Nombre = nombre;
		this.Genero = genero;
		this.Duracion = duracion;
		this.Descripcion = descripcion;
		this.Idioma = idioma;
		this.IdSala = idSala; 
	}
	public int getIdSala() {
		return IdSala;
	}
	public void setIdSala(int idSala) {
		IdSala = idSala;
	}
	public int getIdpelicula() {
		return idpelicula;
	}


	public void setIdpelicula(int idpelicula) {
		this.idpelicula = idpelicula;
		
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
	
	public String Insertar() {
		return "insert into pelicula values ('"+this.idpelicula+"','"+this.Nombre+"','"+this.Genero+"', '"+this.Duracion+"', '"+this.Descripcion+"','"+this.Idioma+"','"+this.IdSala+"');";
	
}
}