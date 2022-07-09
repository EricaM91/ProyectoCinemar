package Peliculas;

public class Reserva 
{
	private int Id;
	private String Email;
	private String FechaCompra;
	private String FechaProyeccion;

	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}

  public Reserva() {}
	public Reserva(int id, String email, String fechaCompra, String fechaProyeccion) {
	    Id = id;
	    Email = email;	
		FechaCompra = fechaCompra;
		FechaProyeccion = fechaProyeccion;
	}


	public String getFechaCompra() {
		return FechaCompra;
	}


	public void setFechaCompra(String fechaCompra) {
		FechaCompra = fechaCompra;
	}


	public String getFechaProyeccion() {
		return FechaProyeccion;
	}


	public void setFechaProyeccion(String fechaProyeccion) {
		FechaProyeccion = fechaProyeccion;
	}
	
	public void MostrarReserva() 
	{
		System.out.println("Fecha de Compra: "+ this.FechaCompra);
		System.out.println("Fecha de Proyeccion: "+ this.FechaProyeccion);
		System.out.println("Id: "+ this.Id);
		System.out.println("Email: "+ this.Email);
		
	}
	public String Insertar() {
		return "insert into reserva values ('"+this.FechaCompra+"','"+this.FechaProyeccion+"','"+this.Id+"', '"+this.Email+"');";
	}
	public String Modifcar() {
		return "update reserva set FechaProyeccion = '"+this.FechaProyeccion+"';";
	}
	

}
