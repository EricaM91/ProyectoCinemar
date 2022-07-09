package Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Cinemar.MySQLconexion;


public class UsuarioBD {
	
public  UsuarioBD() {}
public static Usuario Usuario; 
private boolean tieneAcceso;
private boolean registrado;
private MySQLconexion mySQLconexion = new MySQLconexion("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost:3307/cinemar" ,"erica","erica14");

public  void UsuarioActual(Usuario usuario) 
{
	this.Usuario = usuario;
}
public boolean IniciarSesion (Usuario usuario) 
{

	if(mySQLconexion.conectar() == false) 
	{
		System.out.println("Problema de conexion");
	}
	else 
	{
		String resultado = mySQLconexion.select("select Id, Password, Email from usuario where Email='"+usuario.getEmail()+"';");
		if(resultado == "" ) 
		{
			tieneAcceso = false;
        }else
        {
        	resultado = resultado.substring(0, resultado.length()-1);
			
			String [] usuarioInfo =resultado.split(",");
			Usuario usuarioActual = new Usuario(Integer.parseInt(usuarioInfo[0]), usuarioInfo[2], usuarioInfo[1] );
			UsuarioActual(usuarioActual);
			String valor = usuarioInfo[1].toString();
			
			if(usuarioInfo[1].toString().equals(usuario.getPassword())) 
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
		String resultadoString = mySQLconexion.select("select email from cliente where Email='"+cliente.getEmail()+"';");
		if(resultadoString == "") 
		{
			Usuario usuario = new Usuario(0, cliente.getEmail(), cliente.getPassword());
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
		}else 
		{
			System.out.println("El Usuario ya existe");
		}
	}
	return registrado;
	
}



}
