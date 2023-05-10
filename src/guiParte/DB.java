package guiParte;
import java.sql.*;
public class DB {

	static String result;
	private static String url = "jdbc:mysql://localhost:3306/empresa";
	private static String user = "alumno";
	private static String pwd = "alumno";
	private static String name = Ventana1.nombre;
	
	public static String res(){
		
		result = "";
		
		try {
			Connection con = DriverManager.getConnection(url, user, pwd);
			Statement st = con.createStatement();
			
			
			if(Opciones.caso == 1 && Ventana1.nombre == "Emp") {
				
				int rs = st.executeUpdate("Insert into " +name + " values( " + "\"" + Info.empno + "\"" +" ,"+ "\"" + Info.ename + "\"" +", "+ "\"" + Info.job + "\"" + " ,"+
							"\"" + Info.mgr +"\"" + " ,"+ "\"" + Info.hiredate +"\"" +" ,"+ "\"" + Info.sal +"\"" +" ,"+ "\"" + Info.comm +"\"" +" ,"+ "\"" + Info.deptno +"\"" + ");");
				
				result = Integer.toString(rs);
			}
			
			
			else if(Opciones.caso == 1 && Ventana1.nombre == "Dept") {
				 
				int rs = st.executeUpdate("Insert into " +name + " values( " + "\"" + Info.deptno +"\"" + " ,"+ "\"" + Info.dname +"\"" +" ,"+ "\"" + Info.loc +"\"" + ");");
				
				result = Integer.toString(rs);
			}
			
			
			else if(Opciones.caso == 2 && Ventana1.nombre == "Emp") {
								
				int rs = st.executeUpdate("Delete from " +name + " where empno = " +"\"" + Info.empno +"\"" + ";");
				
				result = Integer.toString(rs);
			}
			
			
			else if(Opciones.caso == 2 && Ventana1.nombre == "Dept"){
				
				int rs = st.executeUpdate("Delete from " +name + " where deptno = " +"\"" + Info.deptno +"\"" + ";");
				
				result = Integer.toString(rs);
			}
			
			
			else if(Opciones.caso == 3 && Ventana1.nombre == "Emp") {
				int rs = 0;
													
					if(Info.deptnoch == true ) {
						rs = st.executeUpdate("Update " +name + " set deptno = " +"\"" + Info.deptno +"\"" + " where empno = " + "\"" +Info.empno + "\"" +";");
					}
					
					if(Info.enamech == true) {
						rs = st.executeUpdate("Update " +name + " set ename = " +"\"" + Info.ename +"\"" + " where empno = " +"\"" + Info.empno +"\"" + ";");
					}
					
					if(Info.jobch == true) {
						rs = st.executeUpdate("Update " +name + " set job = " + "\"" +Info.job +"\"" + " where empno = " +"\"" + Info.empno + "\"" +";");
					}
					
					if(Info.mgrch == true) {
						rs = st.executeUpdate("Update " +name + " set mgr = " +"\"" + Info.mgr +"\"" + " where empno = " + "\"" +Info.empno +"\"" + ";");
					}
					
					if(Info.hirech == true) {
						rs = st.executeUpdate("Update " +name + " set hiredate = " +"\"" + Info.hiredate +"\"" + " where empno = " +"\"" + Info.empno +"\"" + ";");
					}
					
					if(Info.salch == true) {
						rs = st.executeUpdate("Update " +name + " set sal = " +"\"" + Info.sal +"\"" + " where empno = " +"\"" + Info.empno +"\"" + ";");
					}
					
					if(Info.commch == true) {
						rs = st.executeUpdate("Update " +name + " set comm = " +"\"" + Info.comm +"\"" + " where empno = " +"\"" + Info.empno +"\"" + ";");
					}
				
				result = Integer.toString(rs);
			}
			
			
			else if(Opciones.caso == 3 && Ventana1.nombre == "Dept") {
				int rs = 0;
				
				if(Info.dnamech == true) {
					rs = st.executeUpdate("Update " +name + " set dname = " +"\"" + Info.dname +"\"" + " where deptno = " +"\"" + Info.deptno +"\"" + ";");
				}
				
				if(Info.locch == true) {
					rs = st.executeUpdate("Update " +name + " set loc = " +"\"" + Info.loc +"\"" + " where deptno = " +"\"" + Info.deptno +"\"" + ";");
				}
				result = Integer.toString(rs);
				
			}
			
		
			else if(Opciones.caso == 4){
				
				if(Ventana1.nombre == "Emp") {
					ResultSet rs = st.executeQuery("Select * from Emp;");
					while(rs.next()) {
					
						result = result + rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4) + "  "
								+ rs.getString(5) + "  " + rs.getString(6) + "  " + rs.getString(7) + "  " + rs.getString(8) + "\n";
					}
				}
					else {
						ResultSet rs = st.executeQuery("Select * from Dept;");
						while(rs.next()) {
							result = result + rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "\n";
						}
					}
									
			}
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
