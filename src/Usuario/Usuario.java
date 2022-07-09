package Usuario;

public class Usuario {
	
	private String Email;
	private String Password;
	
	
	public Usuario(String email, String password) {
	
		this.Email = email;
		this.Password = password;
	}
	


	public Usuario() {
	
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


	public void Mostrar () {
		System.out.println("");	
	}
	
	public String Insertar() {
		return "insert into usuario values ('"+this.Email+"','"+this.Password+"');";
	}
	

}
