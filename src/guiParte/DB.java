package guiParte;
import java.sql.*;
public class DB {

	static String result = "";
	static String url = "jdbc:mysql://localhost:3306/empresa";
	static String user = "Ramez";
	static String pwd = "Ramez2003";
	public static void main(String[] args) {
		
		System.out.println(result);
	}
	
	public static void res(){
		try (Connection con = DriverManager.getConnection(url, user, pwd);){
			
			Statement st = con.createStatement();
			
			
			if(Opciones.caso == 1) {
				
				if(Ventana1.nombre == "Emp") {
					int rs = st.executeUpdate("Insert into " + Ventana1.nombre + " values( " + Info.empno + Info.ename + Info.job + 
							Info.mgr + Info.hiredate + Info.sal + Info.comm + Info.deptno + ");");
				}
				else {
					int rs = st.executeUpdate("Insert into " + Ventana1.nombre + " values( " + Info.deptno +  Info.dname + Info.loc + ");");
				}
			}
			else if(Opciones.caso == 2) {
				
				if(Ventana1.nombre == "Emp") {
					int rs = st.executeUpdate("Delete from " + Ventana1.nombre + " where empno = " + Info.empno + ";");
				}
				else {
					int rs = st.executeUpdate("Delete from " + Ventana1.nombre + " where deptno = " + Info.deptno + ";");
				}
			}
			else if(Opciones.caso == 3) {
				
				if(Ventana1.nombre == "Emp") {
					int rs = st.executeUpdate("Update " + Ventana1.nombre + " set " + Info.empno + ";");
				}
				else {
					int rs = st.executeUpdate("Update " + Ventana1.nombre + " set " + Info.empno + ";");
				}
			}
			else {
				
				ResultSet rs = st.executeQuery("Select * from " + Ventana1.nombre + ";");
				
				while(rs.next()) {
					
					if(Ventana1.nombre.equals("Emp")) {
						result = result + rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " "
								+ rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8) + " ";
					}
					else {
						result = result + rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " ";
					}
					System.out.println(result);
				}
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
