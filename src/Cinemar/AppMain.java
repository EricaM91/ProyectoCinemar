package Cinemar;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import Peliculas.Butacas;
import Peliculas.ClienteBD;
import Peliculas.Pelicula;
import Peliculas.PeliculaBD;
import Peliculas.Reserva;
import Peliculas.ReservaBD;
import Peliculas.Sala;
import Usuario.Cliente;
import Usuario.Usuario;
import Usuario.UsuarioBD;


   public class AppMain {
	 
   
   static Scanner leer = new Scanner(System.in);
   public static void main(String[] args) {
	   
	   Scanner leerScanner=new Scanner(System.in);
	   UsuarioBD usuarioDb= new UsuarioBD();
	   ClienteBD ClienteBD = new ClienteBD();
	   ReservaBD reservaBD = new ReservaBD ();
	   PeliculaBD peliculaDb = new PeliculaBD(); 
	   
	   System.out.println("1- Cliente");
	   System.out.println("2 - Administrador");
       String  gestionCuenta = leerScanner.nextLine();
       if(gestionCuenta.equals("1"))
       {
    	   int option;
    	   do
    	   {
    		   option  = MenuClient();
    		   
    		  
    		   
    		   switch (option) {
    		   case 1:
    				System.out.println("Cinemar");
    				System.out.println("Iniciar sesion");
    				
    				System.out.print("Email:");
    				String email = leerScanner.nextLine();
    				System.out.println();

    				System.out.print("Clave:");
    				String password=leerScanner.nextLine();
    				
    				System.out.println();
    				Usuario usuario = new Usuario(email, password);
    				boolean tieneAcceso = usuarioDb.IniciarSesion(usuario);
    				if(tieneAcceso == true ) 
    				{
    					System.out.println("Bienvenido a Cinemar");
    				}else 
    				{
    					System.out.println("El email o password son incorrectos");
    				}

    		     break;
    		   case 2:
    			   
    				System.out.println("Ingrese nombre *: ");
    	            String  nombre = leerScanner.nextLine();
    				
    				System.out.println("Ingrese apellido *: ");
    				String apellido = leerScanner.nextLine();
    				
    				System.out.println("Ingrese email *: ");
    				String emailCliente = leerScanner.nextLine();
    				
    				System.out.println("Ingrese password *: ");
    				String passwordCliente = leerScanner.nextLine();
    				
    				System.out.println("Confirmar password *: ");
    				String confirmarPassword = leerScanner.nextLine();
    				
    				System.out.println("Ingrese fechaNacimiento *: ");
    				String fechaNacimiento = leerScanner.nextLine();
    				
    				System.out.println("Ingrese celular *: ");
    				String celular = leerScanner.nextLine();
    				
    				Cliente cliente = new Cliente(nombre, apellido, emailCliente, passwordCliente, confirmarPassword, fechaNacimiento, celular);
    				boolean registrado = usuarioDb.Registrarse(cliente);
    				if(registrado == true)
    				{
    					System.out.println("Usted ya es cliente de Cinemar...");
    					cliente.MostrarCliente();
    				}else
    				{
    					System.out.println("Hubo un problema con el registro!!!!!!!!!!!!");
    					
    				}

    		     break;
    		   case 3:
    		     System.out.println("Ingresar una fecha de proyeccion");
    		     String  fechaProyeccion = leerScanner.nextLine();
    		     SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    		     String fechaReserva = sdf.format(new java.util.Date());
    		     
    		     Reserva reserva = new Reserva (usuarioDb.Usuario.getId(),usuarioDb.Usuario.getEmail(), fechaReserva, fechaProyeccion) ;
    		     boolean reservado = reservaBD.hacerReserva(reserva);
    		 	 if(reservado == true)
    			 {
    				System.out.println("Reserva exitosa");
    			
    			 }else
    			 {
    				System.out.println("Error en la reserva");
    				
    			 }
    		     break;
    		   case 4:
    				System.out.println("Ingrese la fecha de proyeccion: ");
    	            String  busquedafechaProyeccion = leerScanner.nextLine();
    	            Reserva reservaEncontrada = reservaBD.consultarReserva(busquedafechaProyeccion);
    	            reservaEncontrada.MostrarReserva();
    	            
    		     break;
    		   case 0:
    			   System.out.println("Muchas gracias por su visita!!!!");
    		     break;
    		 }   
    	   }while(option != 0);
    	   
       }else   if(gestionCuenta.equals("2")) 
       {
    	   int option;
    	   do
    	   {
    		   option  = MenuAdministrador();
    		   switch (option) {
    		   case 1:
    				System.out.println("Cinemar");
    				System.out.println("Iniciar sesion");
    				
    				System.out.print("Email:");
    				String email = leerScanner.nextLine();
    				System.out.println();

    				System.out.print("Clave:");
    				String password=leerScanner.nextLine();
    				
    				System.out.println();
    				Usuario usuario = new Usuario(email, password);
    				boolean tieneAcceso = usuarioDb.IniciarSesion(usuario);
    				if(tieneAcceso == true ) 
    				{
    					System.out.println("Bienvenido a Cinemar");
    				}else 
    				{
    					System.out.println("El email o password son incorrectos");
    				}

    		     break;
    		   case 2:
    			   
    				System.out.println("Ingrese nombre *: ");
    	            String  nombre = leerScanner.nextLine();
    				
    				System.out.println("Ingrese apellido *: ");
    				String apellido = leerScanner.nextLine();
    				
    				System.out.println("Ingrese email *: ");
    				String emailCliente = leerScanner.nextLine();
    				
    				System.out.println("Ingrese password *: ");
    				String passwordCliente = leerScanner.nextLine();
    				
    				System.out.println("Confirmar password *: ");
    				String confirmarPassword = leerScanner.nextLine();
    				
    				System.out.println("Ingrese fechaNacimiento *: ");
    				String fechaNacimiento = leerScanner.nextLine();
    				
    				System.out.println("Ingrese celular *: ");
    				String celular = leerScanner.nextLine();
    				
    				Cliente cliente = new Cliente(nombre, apellido, emailCliente, passwordCliente, confirmarPassword, fechaNacimiento, celular);
    				boolean registrado = usuarioDb.Registrarse(cliente);
    				if(registrado == true)
    				{
    					System.out.println("Usted ya es cliente de Cinemar...");
    					cliente.MostrarCliente();
    				}else
    				{
    					System.out.println("Hubo un problema con el registro!!!!!!!!!!!!");
    					
    				}

    		     break;
    		   case 3:
    		    System.out.println("Ingrese el email del cliente");
    		    String  correoCliente = leerScanner.nextLine();
    		    Cliente clienteEncontrado = ClienteBD.consultarCliente(correoCliente);
 	            clienteEncontrado.MostrarCliente();
 	            
 	            break;
    		   case 4:
    			   
    				System.out.println("Ingrese el numero de sala *: ");
    				String salaNumber = leerScanner.nextLine();
    				
    				System.out.println("Tipo de Sala*: ");
    				String tipoSala = leerScanner.nextLine();
    				Sala unaSala = new Sala(Integer.parseInt(salaNumber), tipoSala, 0 );
    				
    				System.out.println("Ingrese nombre *: ");
    				String nombrePelicula = leerScanner.nextLine();
    				
    				System.out.println("Ingrese genero *: ");
    				String genero = leerScanner.nextLine();
    				
    				System.out.println("Ingrese duracion *: ");
    				String duracion = leerScanner.nextLine();
    		
    				
    				System.out.println("Descripcion *: ");
    				String descripcion = leerScanner.nextLine();
    				
    				System.out.println("Idioma *: ");
    				String idioma = leerScanner.nextLine();
    				
    				Pelicula pelicula = new Pelicula(0, nombrePelicula, genero, Integer.parseInt(duracion), descripcion, idioma, 0);
    				
    				boolean peliculaCreada = peliculaDb.CrearUnaPelicula(unaSala, pelicula);
    				
    				if(peliculaCreada == true)
    				{
    					System.out.println("Pelicula agregada");
    				}else
    				{
    					System.out.println("Hubo un problema!!!!!!!!!!!!");
    				}

    		     break;
    		   case 0:
    			   System.out.println("Muchas gracias por su visita!!!!");
    		     break;
    		 }   
    	   }while(option != 0);
    	   
       }else 
       {
    	   System.out.println("Opcion invalida!!!");
       }
       
       
       


	
}
   
	public static int MenuClient() {
		
		String result;
		int option = 0;
		boolean bandera = false;
		do{
			CleanScreen();
			System.out.println("###### BIENVENIDOS A CINEMAR-Clientes######");
			System.out.println("ELIGE UNA OPCION");
			System.out.println("\n");
			System.out.println("1. INICIAR SESION");
			System.out.println("2. REGISTRARSE");
			System.out.println("3. HACER UNA RESERVA");
			System.out.println("4. CONSULTAR MI RESERVA");
			System.out.println("0. SALIR");
			System.out.println("\n");
			
			result = leer.nextLine();
		    try {

		    	option = Integer.parseInt(result);
		    	if(option>=0 && option<=4)
		    	{
		    		bandera = false;
		    	}
		    	else if(option < 0 || option > 4) 
				{
					bandera = true;
					System.out.println("Ingrese una opcion Valida...");
				} 
			   
	        }
	        catch (Exception e)
		    {
	        	bandera = true;
	        	System.out.println("Ingrese una opcion Valida...");
	        } 
		
		}while(bandera);
		return option;
		
		
	}
	
	public static int MenuAdministrador() {
		
		String result;
		int option = 0;
		boolean bandera = false;
		do{
			CleanScreen();
		    System.out.println("\n#####################   MENU CINEMAR PARA LA ADMINISTRACION   #####################\n");
		    System.out.println("#####################   SELECCIONE UNA OPCION   ######################");
		    System.out.println("\n");
			System.out.println("1. INICIAR SESION");
			System.out.println("2. REGISTRARSE");
		    System.out.println("3. VER UN CLIENTE EN PARTICULAR");
		    System.out.println("4. CREAR SALA CON UNA PELICULA");
			System.out.println("0. SALIR");
			System.out.println("\n");
			
			result = leer.nextLine();
		    try {

		    	option = Integer.parseInt(result);
		    	if(option>=0 && option<=4)
		    	{
		    		bandera = false;
		    	}
		    	else if(option < 0 || option > 4) 
				{
					bandera = true;
					System.out.println("Ingrese una opcion Valida...");
				} 
			   
	        }
	        catch (Exception e)
		    {
	        	bandera = true;
	        	System.out.println("Ingrese una opcion Valida...");
	        } 
		
		}while(bandera);
		return option;
		
		
	}
	

	public static void CleanScreen() {
		 System.out.print("\033[H\033[2J");
	        System.out.flush();
	}
	    
    
}