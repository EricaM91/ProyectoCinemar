package Usuario;

public class Usuario {
	private int Id;
	private String Email;
	private String Password;
	
	
	public Usuario(String email, String password) {
		
		this.Email = email;
		this.Password = password;
	}
	
	
	public Usuario(int id, String email, String password) {
	
		this.Id = id;
		this.Email = email;
		this.Password = password;
	}
	


	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
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
		return "insert into usuario values ('"+this.Id+"','"+this.Email+"','"+this.Password+"');";
	}
	

}
