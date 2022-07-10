package Peliculas;

import Cinemar.MySQLconexion;
import Usuario.Cliente;

public class ClienteBD
{
	private MySQLconexion mySQLconexion = new MySQLconexion("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost:3307/cinemar" ,"erica","erica14");
	
    public Cliente consultarCliente (String email) 
    {
	
    	Cliente unCliente = new Cliente();
    	if(mySQLconexion.conectar() == false) 
    	{
    		System.out.println("Problema de conexion");
    	}
    	else 
    	{
    		String resultado = mySQLconexion.select("select Nombre, Apellido, Email, Password, ConfirmarPassword, FechaNacimiento, Celular from cliente where Email='"+email+"';");
    		if(resultado == "" ) 
    		{
    			unCliente = null;
            }else
            {
            	int valor  = resultado.length()-1;
            	resultado = resultado.substring(0, resultado.length()-1);
    			
    			String [] clienteInfo =resultado.split(",", 7);
    			
    			unCliente.setNombre(clienteInfo[0]);
    			unCliente.setApellido(clienteInfo[1]);
    			unCliente.setEmail(clienteInfo[2]);
    			unCliente.setPassword(clienteInfo[3]);
    			unCliente.setConfirmarPassword(clienteInfo[4]);
    			unCliente.setFechaNacimiento(clienteInfo[5]);
    			unCliente.setCelular(clienteInfo[6]);
            }
               
    	}
    	
    	return unCliente;
    }
}
