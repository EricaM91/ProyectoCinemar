package Usuario;

public class Usuario {
	
	private String Email;
	private String Clave;
	
	
	public Usuario(String email, String clave) {
	
		this.Email = email;
		this.Clave = clave;
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
		return Clave;
	}


	public void setClave(String clave) {
		this.Clave = clave;
	}


	public void Mostrar () {
		System.out.println("");	
	}
	
	


}
