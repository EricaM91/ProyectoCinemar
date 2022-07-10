package Usuario;

public class Cliente {

	 private String Nombre;
	 private String Apellido;
	 private String Email;
	 private String Password;
	 private String ConfirmarPassword;
	 private String FechaNacimiento;
	 private String Celular;



	public Cliente(String nombre, String apellido, String email, String password, String confirmarPassword, String fechaNacimiento, String celular) {

		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Email = email;
		this.Password = password;
		this.ConfirmarPassword = confirmarPassword;
		this.FechaNacimiento = fechaNacimiento;
		this.Celular = celular;
		
	}


	public Cliente() {
		// TODO Auto-generated constructor stub
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


	public String getFechaNacimiento() {
		return FechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.FechaNacimiento = fechaNacimiento;
	}

	public String getCelular() {
		return Celular;
	}


	public void setCelular(String celular) {
		this.Celular = celular;
	}

	
	public void MostrarCliente () {
	System.out.println("Nombre: "+ this.Nombre);
	System.out.println("Apellido: "+ this.Apellido);
	System.out.println("Email: "+ this.Email);
	System.out.println("Password: "+ this.Password);
	System.out.println("Confirmacion de Password: "+ this.ConfirmarPassword);
	System.out.println("Fecha Nacimiento: "+ this.FechaNacimiento);
	System.out.println("Celular: "+ this.Celular);
	
	
	}
	
	public boolean EdadPermitida () {
		return false;
		
	}

	public String Insertar() {
		return "insert into cliente (Nombre, Apellido, Email,Password,ConfirmarPassword,FechaNacimiento,Celular) values ('"+this.Nombre+"','"+this.Apellido+"','"+this.Email+"','"+this.Password+"','"+this.ConfirmarPassword+"','"+this.FechaNacimiento+"', '"+this.Celular+"');";
	}
	


}
