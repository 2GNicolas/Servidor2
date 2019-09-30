/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class conexion {
	public static Connection conectar() {
		Connection con = null;
		
		String password = "root";
		String usuario = "root";
		String url = "jdbc:mysql://localhost:3306/ventas?user=" + usuario
				+ "&password=" + password;
		try {
			con = DriverManager.getConnection(url);
			if (con != null) {
				System.out.println("Conectado");
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		return con;
	}
}