package Cinemar;

import java.util.ArrayList;
import java.util.Scanner;

import Peliculas.Butacas;
import Peliculas.Pelicula;
import Peliculas.Sala;
import Usuario.Cliente;
import Usuario.Usuario;
import Usuario.UsuarioBD;


   public class AppMain {
	 
   
   static Scanner leer = new Scanner(System.in);
   public static void main(String[] args) {
	   
	   //PAQUETE USUARIO
		
		
		
		
		/*String email;
		System.out.println("Ingrese un email");
		email = leer.nextLine();
		
		String password;
		System.out.println("Ingrese el password");
		password = leer.nextLine();*/
		
		
		
		
		
		//PAQUETE PELICULA

//		ArrayList <Pelicula> ListaPeliculas = new ArrayList <Pelicula> ();
//		
//		Pelicula pelicula0 = new Pelicula("Dog un viaje salvaje", "Drama", 101, "Briggs, un ex ranger del ej�rcito que se aventurar� a cruzar el pa�s junto a su perra Lulu", "Espa�ol Latino" );
//		Pelicula pelicula1= new Pelicula("Jurassic world dominio", "Aventura", 147, "Los dinosaurios ahora viven y cazan junto a los humanos en todo el mundo. Este fr�gil equilibrio cambiar� el futuro", "Espa�ol Latino");
//		Pelicula pelicula2= new Pelicula("Minions nace un villano", "Animacion", 87, "Llega la historia de un adolescente de 12 a�os que sue�a con convertirse en el villano m�s grande del mundo: MINIONS: NACE UN VILLANO", "Espa�ol Latino");
//		Pelicula pelicula3= new Pelicula("Thor amor y trueno", "Aventura", 125, " Thor en una b�squeda por la paz interior, es interrumpido por un asesino gal�ctico conocido como Gorr,", "Espa�ol Latino");
//		Pelicula pelicula4= new Pelicula("Lightyear", "Animacion", 100, "Pel�cula sobre el joven piloto de pruebas Buzz Lightyear qui�n luego se convertir�a en el popular juguete que todos los ni�os querr�an tener en Toy Story" , "Espa�ol Latino");
//		Pelicula pelicula5= new Pelicula("El telefono negro", "Terror", 104, "Finney Shaw, un t�mido, pero inteligente ni�o de 13 a�os es secuestrado por un s�dico asesino y atrapado en un aterrador, oscuro y aislado s�tano", "Ingles");
//		Pelicula pelicula6= new Pelicula("Todo en todas partes al mismo tiempo", "Accion", 139, "Una inmigrante china, se ve envuelta en una aventura salvaje en la que solo ella puede salvar el mundo explorando otros universos", "Ingles");
//		Pelicula pelicula7= new Pelicula("Top gun maverick", "Accion", 131, "Despu�s de m�s de treinta a�os de servicio como uno de los mejores aviadores de la Armada, Pete est� donde pertenece, como un valiente piloto", "Ingles");
//		Pelicula pelicula8= new Pelicula(null, null, 0, null, null);
//		Pelicula pelicula9= new Pelicula(null, null, 0, null, null);
//		Pelicula pelicula10= new Pelicula(null, null, 0, null, null);
//		
//		ListaPeliculas.add(pelicula0);
//		ListaPeliculas.add(pelicula1);
//		ListaPeliculas.add(pelicula2);
//		ListaPeliculas.add(pelicula3);
//		ListaPeliculas.add(pelicula4);
//		ListaPeliculas.add(pelicula5);
//		ListaPeliculas.add(pelicula6);
//		ListaPeliculas.add(pelicula7);
//		
//		ArrayList <Butacas> listaButacas = new ArrayList <Butacas> ();
//		Butacas oneButacas = new Butacas(1,1,true);
//		listaButacas.add(oneButacas);
//		Butacas twoButacas = new Butacas(1,2,false);
//		listaButacas.add(twoButacas);
//		Butacas threeButacas = new Butacas(1,3,true);
//		listaButacas.add(threeButacas);
//		Butacas fourButacas = new Butacas(1,4,true);
//		listaButacas.add(fourButacas);
//		Butacas fiveButacas = new Butacas(1,5,true);
//		listaButacas.add(fiveButacas);
//		Butacas sixButacas = new Butacas(1,6,false);
//		listaButacas.add(sixButacas);
//		Butacas sevenButacas = new Butacas(1,7,false);
//		listaButacas.add(sevenButacas);
//		Butacas eightButacas = new Butacas(1,8,true);
//		listaButacas.add(eightButacas);
//		Butacas nineButacas = new Butacas(1,9,true);
//		listaButacas.add(nineButacas);
//		Butacas tenButacas = new Butacas(1,10,true);
//		listaButacas.add(tenButacas);
//		//Agregar ciclo?
//		
//		//Salas
//		
//		
//	    Sala sala1 = new Sala(1, "2D", listaButacas );
//	    Sala sala2 = new Sala(2, "3D", listaButacas ); 
//	    Sala sala3 = new Sala(3, "2D", listaButacas );
//	    Sala sala4 = new Sala(4, "3D", listaButacas );
//	    Sala sala5 = new Sala(5, "2D", listaButacas );
//	    Sala sala6 = new Sala(6, "3D", listaButacas );
//	    Sala sala7 = new Sala(7, "2D", listaButacas );
//	    Sala sala8 = new Sala(8, "3D", listaButacas );
//	    Sala sala9 = new Sala(9, "2D", listaButacas );
//	    Sala sala10 = new Sala(10, "3D", listaButacas );
//
//
//	    sala1.mostrar();
//	    sala2.mostrar();
//	    sala3.mostrar();
//	    sala4.mostrar();
//	    sala5.mostrar();
//	    sala6.mostrar();
//	    sala7.mostrar();
//	    sala8.mostrar();
//	    sala9.mostrar();
//	    sala10.mostrar();
//	    
//
//	    Scanner lectura = new Scanner(System.in);
//	    
//	    System.out.println("\n#####################   MENU CINEMAR PARA LA ADMINISTRACION   #####################\n");
//	    System.out.println("#####################   SELECCIONE UNA OPCION   ######################");
//	    System.out.println("\n");
//	    System.out.println("1-VER TODAS LAS RESERVAS");
//	    System.out.println("2-VER UN CLIENTE EN PARTICULAR");
//	    System.out.println("3-CREAR SALA CON UNA PELICULA");
//	    System.out.println("4-MODIFICAR LA SALA");
//	    System.out.println("5-ELIMINAR LA SALA");
//	    System.out.println("6-MODIFICAR DESCUENTOS");
//	    
	   int option  = MenuClient();
	   Scanner leerScanner=new Scanner(System.in);
	   UsuarioBD usuarioDb= new UsuarioBD();
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
				cliente.Mostrar();
			}else
			{
				System.out.println("Hubo un problema con el registro!!!!!!!!!!!!");
				
			}

	     break;
	   case 3:
	     System.out.println("Wednesday");
	     break;
	   case 4:
	     System.out.println("Thursday");
	     break;
	   case 5:
	     System.out.println("Friday");
	     break;
	   case 6:
	     System.out.println("Saturday");
	     break;
	   case 0:
	    
	     break;
	 }
	
}
   
	public static int MenuClient() {
		
		String result;
		int option = 0;
		boolean bandera = false;
		do{
			CleanScreen();
			System.out.println("###### BIENVENIDOS A CINEMAR ######");
			System.out.println("ELIGE UNA OPCION");
			System.out.println("\n");
			System.out.println("1. INICIAR SESION");
			System.out.println("2. REGISTRARSE");
			System.out.println("3. CREAR UNA RESERVA");
			System.out.println("4. MODIFICAR UNA RESERVA");
			System.out.println("5. OBSERVAR MIS RESERVAS");
			System.out.println("6. VER HISTORIAL DE MIS ENTRADAS");
			System.out.println("0. SALIR");
			System.out.println("\n");
			
			result = leer.nextLine();
		    try {

		    	option = Integer.parseInt(result);
		    	if(option>=0 && option<=6)
		    	{
		    		bandera = false;
		    	}
		    	else if(option < 0 || option > 6) 
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