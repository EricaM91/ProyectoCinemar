package Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Cinemar.MySQLconexion;


public class UsuarioBD {
	
public  UsuarioBD() {}

private boolean tieneAcceso;
private boolean registrado;
private MySQLconexion mySQLconexion = new MySQLconexion("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost:3307/cinemar" ,"erica","erica14");
public boolean IniciarSesion (Usuario usuario) 
{

	if(mySQLconexion.conectar() == false) 
	{
		System.out.println("Problema de conexion");
	}
	else 
	{
		String resultado = mySQLconexion.select("select Password, Email from usuario where Email='"+usuario.getEmail()+"';");
		if(resultado == "" ) 
		{
			tieneAcceso = false;
        }else
        {
        	resultado = resultado.substring(0, resultado.length()-1);
			
			String [] usuarioInfo =resultado.split(",");	
			if(usuarioInfo[0] == usuario.getPassword()) 
			{
				tieneAcceso = true; 
			}else
			{
				tieneAcceso = false; 
			}
        	
        }
           
	}
	
	return tieneAcceso;

 }	

public boolean Registrarse(Cliente cliente) 
{
	// guardar tabla  usuario y en la tabla cliente.
	
	if(mySQLconexion.conectar()) 
	{
		String resultadoString = mySQLconexion.select("select email from Clientes where email='"+cliente.getEmail()+"';");
		if(resultadoString == "") 
		{
			Usuario usuario = new Usuario(cliente.getEmail(), cliente.getPassword());
			if(mySQLconexion.insert(cliente.Insertar()))
			{
				mySQLconexion.insert(usuario.Insertar());
				registrado = true;
				mySQLconexion.cerrar();
			}
			else 
			{
				registrado = false;
			}
		}
	}
	return registrado;
	
}

}
