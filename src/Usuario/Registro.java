package Usuario;

import java.util.Scanner;

public class Registro {

	
	public boolean Registrarse () {
		boolean Rta = true;
			
	String Nombre;
	String Apellido;
	String Email;
    String Contraseņa;
    String ConfirmarContraseņa;
    int FechaNacimiento;
    int Celular;

	Scanner leerScanner = new Scanner(System.in);
	
	System.out.println("Ingrese nombre *: ");
	Nombre = leerScanner.nextLine();
	
	System.out.println("Ingrese apellido *: ");
	Apellido = leerScanner.nextLine();
	
	System.out.println("Ingrese email *: ");
	Email = leerScanner.nextLine();
	
	System.out.println("Ingrese contraseņa *: ");
	Contraseņa = leerScanner.nextLine();
	
	System.out.println("Ingrese confirmarcontraseņa *: ");
	ConfirmarContraseņa = leerScanner.nextLine();
	
	System.out.println("Ingrese fechaNacimiento *: ");
	FechaNacimiento = leerScanner.nextInt();
	
	System.out.println("Ingrese celular *: ");
	Celular = leerScanner.nextInt();
	
	System.out.println(" *: ");
	
	
	
	
	
	return false;
	
	
		
	}
	
}
