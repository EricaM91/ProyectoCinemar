package Usuario;

import java.util.Scanner;

public class Registro {

	
	public boolean Registrarse () {
		boolean Rta = true;
			
	String Nombre;
	String Apellido;
	String Email;
    String Contrase�a;
    String ConfirmarContrase�a;
    int FechaNacimiento;
    int Celular;

	Scanner leerScanner = new Scanner(System.in);
	
	System.out.println("Ingrese nombre *: ");
	Nombre = leerScanner.nextLine();
	
	System.out.println("Ingrese apellido *: ");
	Apellido = leerScanner.nextLine();
	
	System.out.println("Ingrese email *: ");
	Email = leerScanner.nextLine();
	
	System.out.println("Ingrese contrase�a *: ");
	Contrase�a = leerScanner.nextLine();
	
	System.out.println("Ingrese confirmarcontrase�a *: ");
	ConfirmarContrase�a = leerScanner.nextLine();
	
	System.out.println("Ingrese fechaNacimiento *: ");
	FechaNacimiento = leerScanner.nextInt();
	
	System.out.println("Ingrese celular *: ");
	Celular = leerScanner.nextInt();
	
	System.out.println(" *: ");
	
	
	
	
	
	return false;
	
	
		
	}
	
}
