package Usuario;

public class Usuario {
	
	private String Email;
	private String Password;
	
	
	public Usuario(String email, String clave) {
	
		this.Email = email;
		this.Password = clave;
	}
	


	public Usuario() {
	
	}



	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		this.Email = email;
	}


	public String getClave() {
		return Password;
	}


	public void setClave(String clave) {
		this.Password = clave;
	}


	public void Mostrar () {
		System.out.println("");	
	}
	
	


}
