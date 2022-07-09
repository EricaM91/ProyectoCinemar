package Peliculas;

import Cinemar.MySQLconexion;
import Usuario.Usuario;

public class ReservaBD {
	private boolean reservado;
	private MySQLconexion mySQLconexion = new MySQLconexion("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost:3307/cinemar" ,"erica","erica14");
	public boolean hacerReserva (Reserva reserva)
	{
		if(mySQLconexion.conectar()) 
		{
			
			if(mySQLconexion.insert(reserva.Insertar()))
			{

				reservado = true;
				mySQLconexion.cerrar();
			}
			else 
			{
				reservado = false;
			}

	

		}
		return reservado;
		
	}
	
    public boolean modificarReserva (Reserva reserva) 
    {
    	if(mySQLconexion.conectar()) 
		{
    	     boolean  test = mySQLconexion.insert(reserva.Modifcar());
    		 mySQLconexion.cerrar();
    		 
//			if()
//			{
//
//				reservado = true;
//				mySQLconexion.cerrar();
//			}
//			else 
//			{
//				reservado = false;
//			}

	

		}
		return true;
	
	}

    public Reserva consultarReserva (String fechaProy) 
    {
	
    	Reserva unaReserva = new Reserva();
    	if(mySQLconexion.conectar() == false) 
    	{
    		System.out.println("Problema de conexion");
    	}
    	else 
    	{
    		String resultado = mySQLconexion.select("select FechaCompra, FechaProyeccion, Id, Email from reserva where FechaProyeccion='"+fechaProy+"';");
    		if(resultado == "" ) 
    		{
    			unaReserva = null;
            }else
            {
            	resultado = resultado.substring(0, resultado.length()-1);
    			
    			String [] reservaInfo =resultado.split(",");
    			unaReserva.setEmail(reservaInfo[3]);
    			unaReserva.setFechaCompra(reservaInfo[0]);
    			unaReserva.setFechaProyeccion(reservaInfo[1]);
    			unaReserva.setId(Integer.parseInt(reservaInfo[2]));
            }
               
    	}
    	
    	return unaReserva;
    }
	
}
