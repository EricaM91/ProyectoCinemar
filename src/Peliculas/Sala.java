package Peliculas;

import java.util.ArrayList;

public class Sala{

	private int SalaNumber;
	private String Tipo;
	private int IdSala;
	


	public Sala(int salaNumber, String tipo, int idSala) {
		SalaNumber = salaNumber;
		Tipo = tipo;
		IdSala = idSala;
	}



	public int getSala() {
		return SalaNumber;
	}



	public void setSala(int sala) {
		this.SalaNumber = sala;
	}



	public String getTipo() {
		return Tipo;
	}



	public void setTipo(String tipo) {
		this.Tipo = tipo;
	}

	public int getSalaNumber() {
		return SalaNumber;
	}



	public void setSalaNumber(int salaNumber) {
		SalaNumber = salaNumber;
	}



	public int getIdSala() {
		return IdSala;
	}



	public void setIdSala(int idSala) {
		IdSala = idSala;
	}



	public void mostrar () {
		System.out.println("\nSala de cine");
		System.out.println("Tipo");
		System.out.println("Lista de butacas\n");
		
	}
	public String Insertar() 
	{
		return "insert into sala values ('"+this.SalaNumber+"','"+this.Tipo+"','"+this.IdSala+"');";
	}
	
	
}
