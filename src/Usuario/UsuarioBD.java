package Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import cinemar.peliculas.MySQLconexion;

public class UsuarioBD {

public Usuario obtenerUsuario (Usuario usuario) {
		
//		Usuario usuario = null;
//		
//		Connection con  = null;
//		PreparedStatement pst = null;
//		ResultSet rs = null;
//		
//		try {
//			
//		 con = MySQLconexion.getConexion();
//		 
//		 String sql =  "select*from usuario  where Email =? and Password =?";
//		 
//		 pst = con.prepareStatement(sql);
//		 
//		 pst.setString(1,usuario.getEmail());
//		 pst.setString(2, usuario.getPassword());
//		 
//		 rs = pst.executeQuery();
//		 
//		 while(rs.next()) {
//			    usuario = new Usuario(rs.getString(1), rs.getString(2));
//			 
//		 }
//		 
//		} catch (Exception e) {
//			System.out.println("No se pudo obtener un usuario");
//		
//			
//		}
		
		
		return usuario;
 }	

}
