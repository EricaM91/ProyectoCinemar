package Usuario;

public class Cliente {

	 private String Nombre;
	 private String Apellido;
	 private String Email;
	 private String Contrase�a;
	 private String ConfirmarContrase�a;
	 private int FechaNacimiento;
	 private int Celular;



	public Cliente(String nombre, String apellido, String email, String contrase�a, String confirmarcontrase�a,
			int fechaNacimiento, int celular) {

		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Email = email;
		this.Contrase�a = contrase�a;
		this.ConfirmarContrase�a = confirmarcontrase�a;
		this.FechaNacimiento = fechaNacimiento;
		this.Celular = celular;
		
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}


	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		this.Email = email;
	}


	public String getContrase�a() {
		return Contrase�a;
	}


	public void setContrase�a(String contrase�a) {
		this.Contrase�a = contrase�a;
	}


	public String getConfirmarcontrase�a() {
		return ConfirmarContrase�a;
	}


	public void setConfirmarcontrase�a(String confirmarcontrase�a) {
		this.ConfirmarContrase�a = confirmarcontrase�a;
	}


	public int getFechaNacimiento() {
		return FechaNacimiento;
	}


	public void setFechaNacimiento(int fechaNacimiento) {
		this.FechaNacimiento = fechaNacimiento;
	}

	public int getCelular() {
		return Celular;
	}


	public void setCelular(int celular) {
		this.Celular = celular;
	}

	
	public void Mostrar () {
	System.out.println("nombre"+ this.Nombre);
	System.out.println("apellido"+ this.Apellido);
	System.out.println("email"+ this.Email);
	System.out.println("contrase�a"+ this.Contrase�a);
	System.out.println("confirmarContrase�a"+ this.ConfirmarContrase�a);
	System.out.println("fechaNacimiento"+ this.FechaNacimiento);
	System.out.println("celular"+ this.Celular);
	
	
	}
	
	public boolean EdadPermitida () {
		return false;
		
	}

	

}
