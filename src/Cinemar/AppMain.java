package Cinemar;

import java.util.ArrayList;
import java.util.Scanner;

import Peliculas.Butacas;
import Peliculas.Pelicula;
import Peliculas.Sala;


   public class AppMain {
	 
   
	
   public static void main(String[] args) {
	   
	   //PAQUETE USUARIO
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("###### BIENVENIDOS A CINEMAR ######");
		System.out.println("1. Inicia sesion");
		System.out.println("2. Registrarse");
		System.out.println("0. Salir");
		System.out.println("Selecciona una opcion");
		
		/*String email;
		String clave;
		
		System.out.println("Ingrese un email");
		
		email = leer.nextLine();
		
		
		System.out.println("Ingrese la clave");
		
		clave = leer.nextLine();*/
		
		
		
		
		//PAQUETE PELICULA

		ArrayList <Pelicula> ListaPeliculas = new ArrayList <Pelicula> ();
		
		Pelicula pelicula0 = new Pelicula("Dog un viaje salvaje", "Drama", 101, "Briggs, un ex ranger del ejército que se aventurará a cruzar el país junto a su perra Lulu", "Español Latino" );
		Pelicula pelicula1= new Pelicula("Jurassic world dominio", "Aventura", 147, "Los dinosaurios ahora viven y cazan junto a los humanos en todo el mundo. Este frágil equilibrio cambiará el futuro", "Español Latino");
		Pelicula pelicula2= new Pelicula("Minions nace un villano", "Animacion", 87, "Llega la historia de un adolescente de 12 años que sueña con convertirse en el villano más grande del mundo: MINIONS: NACE UN VILLANO", "Español Latino");
		Pelicula pelicula3= new Pelicula("Thor amor y trueno", "Aventura", 125, " Thor en una búsqueda por la paz interior, es interrumpido por un asesino galáctico conocido como Gorr,", "Español Latino");
		Pelicula pelicula4= new Pelicula("Lightyear", "Animacion", 100, "Película sobre el joven piloto de pruebas Buzz Lightyear quién luego se convertiría en el popular juguete que todos los niños querrían tener en Toy Story" , "Español Latino");
		Pelicula pelicula5= new Pelicula("El telefono negro", "Terror", 104, "Finney Shaw, un tímido, pero inteligente niño de 13 años es secuestrado por un sádico asesino y atrapado en un aterrador, oscuro y aislado sótano", "Ingles");
		Pelicula pelicula6= new Pelicula("Todo en todas partes al mismo tiempo", "Accion", 139, "Una inmigrante china, se ve envuelta en una aventura salvaje en la que solo ella puede salvar el mundo explorando otros universos", "Ingles");
		Pelicula pelicula7= new Pelicula("Top gun maverick", "Accion", 131, "Después de más de treinta años de servicio como uno de los mejores aviadores de la Armada, Pete está donde pertenece, como un valiente piloto", "Ingles");
		Pelicula pelicula8= new Pelicula(null, null, 0, null, null);
		Pelicula pelicula9= new Pelicula(null, null, 0, null, null);
		Pelicula pelicula10= new Pelicula(null, null, 0, null, null);
		
		ListaPeliculas.add(pelicula0);
		ListaPeliculas.add(pelicula1);
		ListaPeliculas.add(pelicula2);
		ListaPeliculas.add(pelicula3);
		ListaPeliculas.add(pelicula4);
		ListaPeliculas.add(pelicula5);
		ListaPeliculas.add(pelicula6);
		ListaPeliculas.add(pelicula7);
		
		ArrayList <Butacas> listaButacas = new ArrayList <Butacas> ();
		Butacas oneButacas = new Butacas(1,1,true);
		listaButacas.add(oneButacas);
		Butacas twoButacas = new Butacas(1,2,false);
		listaButacas.add(twoButacas);
		Butacas threeButacas = new Butacas(1,3,false);
		listaButacas.add(threeButacas);
		Butacas fourButacas = new Butacas(1,4,false);
		listaButacas.add(fourButacas);
		Butacas fiveButacas = new Butacas(1,5,false);
		listaButacas.add(fiveButacas);
		Butacas sixButacas = new Butacas(1,6,false);
		listaButacas.add(sixButacas);
		Butacas sevenButacas = new Butacas(1,7,false);
		listaButacas.add(sevenButacas);
		Butacas eightButacas = new Butacas(1,8,false);
		listaButacas.add(eightButacas);
		Butacas nineButacas = new Butacas(1,9,false);
		listaButacas.add(nineButacas);
		Butacas tenButacas = new Butacas(1,10,false);
		listaButacas.add(tenButacas);
		
		//CREAR MAS BUTACAS Y AGREGARLA A LA LISTA
	    Sala sala1 = new Sala(1, "2D", listaButacas );
	    Sala sala2 = new Sala(2, "3D", listaButacas ); 
	    Sala sala3 = new Sala(3, "2D", listaButacas );
	    Sala sala4 = new Sala(4, "3D", listaButacas );
	    Sala sala5 = new Sala(5, "2D", listaButacas );
	    Sala sala6 = new Sala(6, "3D", listaButacas );
	    Sala sala7 = new Sala(7, "2D", listaButacas );
	    Sala sala8 = new Sala(8, "3D", listaButacas );
	    Sala sala9 = new Sala(9, "2D", listaButacas );
	    Sala sala10 = new Sala(10, "3D", listaButacas );


	    
	  
	    
	    System.out.print("#####################   MENU CINEMAR #####################");
	    System.out.print("#####################   SELECCIONE LA OPCION  ######################");
	    System.out.print("1-VER TODAS LAS RESERVAS");
	    System.out.print("2-VER UN CLIENTE EN PARTICULAR");
	    System.out.print("3-CREAR UNA SALA CON UNA PELICULA");
	    System.out.print("4-MODIFICAR LA SALA");
	    System.out.print("5-ELIMINAR LA SALA");
	    System.out.print("6-MODIFICAR DESCUENTOS");
	    

	
}
   
   

}