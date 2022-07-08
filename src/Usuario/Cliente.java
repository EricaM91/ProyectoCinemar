package Usuario;

public class Cliente {

	 private String Nombre;
	 private String Apellido;
	 private String Email;
	 private String Password;
	 private String ConfirmarPassword;
	 private int FechaNacimiento;
	 private int Celular;



	public Cliente(String nombre, String apellido, String email, String password, String confirmarPassword,
			int fechaNacimiento, int celular) {

		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Email = email;
		this.Password = password;
		this.ConfirmarPassword = confirmarPassword;
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


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		this.Password = password;
	}
	public String getConfirmarPassword() {
		return ConfirmarPassword;
	}


	public void setConfirmarPassword(String confirmarPassword) {
		ConfirmarPassword = confirmarPassword;
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
	System.out.println("password"+ this.Password);
	System.out.println("confirmarPassword"+ this.ConfirmarPassword);
	System.out.println("fechaNacimiento"+ this.FechaNacimiento);
	System.out.println("celular"+ this.Celular);
	
	
	}
	
	public boolean EdadPermitida () {
		return false;
		
	}

	

}
