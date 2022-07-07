package Usuario;

import java.util.Scanner;

public class Registro {

	
	public boolean Registrarse () {
		boolean Rta = true;
			
	String Nombre;
	String Apellido;
	String Email;
    String Contraseña;
    String ConfirmarContraseña;
    int FechaNacimiento;
    int Celular;

	Scanner leerScanner = new Scanner(System.in);
	
	System.out.println("Ingrese nombre *: ");
	Nombre = leerScanner.nextLine();
	
	System.out.println("Ingrese apellido *: ");
	Apellido = leerScanner.nextLine();
	
	System.out.println("Ingrese email *: ");
	Email = leerScanner.nextLine();
	
	System.out.println("Ingrese contraseña *: ");
	Contraseña = leerScanner.nextLine();
	
	System.out.println("Ingrese confirmarcontraseña *: ");
	ConfirmarContraseña = leerScanner.nextLine();
	
	System.out.println("Ingrese fechaNacimiento *: ");
	FechaNacimiento = leerScanner.nextInt();
	
	System.out.println("Ingrese celular *: ");
	Celular = leerScanner.nextInt();
	
	System.out.println(" *: ");
	
	
	
	
	
	return false;
	
	
		
	}
	
}
