package Peliculas;

public class Proyeccion{
	
	private String FechaIni;
	private String FechaFin;
	private String Horario;
	
	
	public Proyeccion(String fechaIni,String fechaFin, String horario) {
		
		this.FechaIni = fechaIni;
		this.FechaFin = fechaFin;
		this.Horario = horario;
	}

	public String getFechaIni() {
		return FechaIni;
	}


	public void setFechaIni(String fechaIni) {
		this.FechaIni = fechaIni;
	}


	public String getFechaFin() {
		return FechaFin;
	}


	public void setFechaFin(String fechaFin) {
		this.FechaFin = fechaFin;
	}
	
	public String getHorario() {
		return Horario;
	}


	public void setHorario(String horario) {
		Horario = horario;
	}
	
	

}
