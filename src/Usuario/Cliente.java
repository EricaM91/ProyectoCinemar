package Usuario;

public class Cliente {

	 private String Nombre;
	 private String Apellido;
	 private String Email;
	 private String Contraseña;
	 private String ConfirmarContraseña;
	 private int FechaNacimiento;
	 private int Celular;



	public Cliente(String nombre, String apellido, String email, String contraseña, String confirmarcontraseña,
			int fechaNacimiento, int celular) {

		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Email = email;
		this.Contraseña = contraseña;
		this.ConfirmarContraseña = confirmarcontraseña;
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


	public String getContraseña() {
		return Contraseña;
	}


	public void setContraseña(String contraseña) {
		this.Contraseña = contraseña;
	}


	public String getConfirmarcontraseña() {
		return ConfirmarContraseña;
	}


	public void setConfirmarcontraseña(String confirmarcontraseña) {
		this.ConfirmarContraseña = confirmarcontraseña;
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
	System.out.println("contraseña"+ this.Contraseña);
	System.out.println("confirmarContraseña"+ this.ConfirmarContraseña);
	System.out.println("fechaNacimiento"+ this.FechaNacimiento);
	System.out.println("celular"+ this.Celular);
	
	
	}
	
	public boolean EdadPermitida () {
		return false;
		
	}

	

}
