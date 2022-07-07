package Peliculas;

import java.util.ArrayList;

public class Sala{

	private int SalaNumber;
	private String Tipo;
	private ArrayList<Butacas> ListaButacas ;
	
	
	public Sala(int salaNumber, String tipo, ArrayList<Butacas> listaButacas ) {
		this.ListaButacas = listaButacas;
		this.SalaNumber = salaNumber;
		this.Tipo = tipo;
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

	public ArrayList<Butacas> getListaButacas() {
		return ListaButacas;
	}

	public void setListaButacas(ArrayList<Butacas> listaButacas) {
		ListaButacas = listaButacas;
	}


	public void mostrar () {
		System.out.println("");
		System.out.println("");
		
	}
	
}
