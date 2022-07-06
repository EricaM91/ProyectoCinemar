package ConectorBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLconexion {

	public static Connection getConexion () {
		
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/cinemar";
			String usuario = "erica";
			String contraseña = "erica14";
			
			con = DriverManager.getConnection(url,usuario,contraseña); 
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el Driver");
			
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error con la BD");

			e.printStackTrace();
		}
		
		
		return con;
		
	}
	
}
