package guiParte;
import java.sql.*;
public class DB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/empresa";
		String user = "alumno";
		String pwd = "alumno";
		
		try {
			Connection con = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
