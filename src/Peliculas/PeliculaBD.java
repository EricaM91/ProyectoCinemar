package Peliculas;

import Cinemar.MySQLconexion;

public class PeliculaBD 
{
	private boolean peliculaCreada;
	private MySQLconexion mySQLconexion = new MySQLconexion("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost:3307/cinemar" ,"erica","erica14");
	
	public boolean CrearUnaPelicula (Sala sala, Pelicula pelicula)
	{
		if(mySQLconexion.conectar()) 
		{
			if(mySQLconexion.insert(sala.Insertar()))
		    {
				String IdSala = mySQLconexion.select("select IdSala from sala where SalaNumber='"+sala.getSalaNumber()+"';");
				IdSala = IdSala.replace(";", "");
				pelicula.setIdSala(Integer.parseInt(IdSala));
				mySQLconexion.insert(pelicula.Insertar());
				peliculaCreada = true;
				mySQLconexion.cerrar();
		    }
			else 
			{
				peliculaCreada = false;
			}

		}
		return peliculaCreada;
		
	}
	
}
