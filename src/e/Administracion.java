package e;

import java.util.*;
import java.io.*;

public class Administracion {
	private ArrayList<Alumno> al = new ArrayList();
	private BufferedReader br;
	private BufferedWriter bw;
	private File alumnos;
	public Administracion() {
		 alumnos = new File("D:\\ELCURSO\\Eclipse\\Eclipse-workspace\\AdministracionAlumno\\Alumnos\\Datos.txt");
		
		try {
			alumnos.createNewFile();
			br = new BufferedReader(new FileReader(alumnos));
			bw = new BufferedWriter(new FileWriter(alumnos));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void alta(Alumno a) {
		
		al.add(a);

	}
	
	public void baja(Alumno a) {
		
		al.remove(a);
	}
	
	public void modifcar(Alumno a) {
		Scanner sc = new Scanner(System.in);
		String y;
		int z;
		System.out.println("Que quieres modificar:\n"
				+ "1.Nombre\n"
				+ "2.Apellido\n"
				+ "3.NIA\n"
				+ "4.grupo\n"
				+ "5.Edad\n"
				+ "6.email\n"
				+ "7.Telefono\n"
				+ "8.Nota de eva1\n"
				+ "9.Nota de eva2\n"
				+ "10.Nota de eva3\n"
				+ "11.Nota de eva4\n");
		int x = sc.nextInt();
		
		if(x==1) {
			System.out.println("Nombre: ");
			y = sc.next();
			al.get(al.indexOf(a)).setNombre(y);
		}
		else if(x==2) {
			System.out.println("Apellido: ");
			y = sc.next();
			al.get(al.indexOf(a)).setApellido(y);;
		}
		else if(x==3) {
			System.out.println("NIA: ");
			z = sc.nextInt();
			al.get(al.indexOf(a)).setNIA(z);;
		}
		else if(x==4) {
			System.out.println("Grupo: ");
			y = sc.next();
			al.get(al.indexOf(a)).setGrupo(y);
		}
		else if(x==5) {
			System.out.println("Edad: ");
			z = sc.nextInt();
			al.get(al.indexOf(a)).setEdad(z);
		}
		else if(x==6) {
			System.out.println("Email: ");
			y = sc.next();
			al.get(al.indexOf(a)).setEmail(y);
		}
		else if(x==7) {
			System.out.println("Telefono: ");
			z = sc.nextInt();
			al.get(al.indexOf(a)).setTel(z);
		}
		else if(x==8) {
			System.out.println("Nota: ");
			z = sc.nextInt();
			al.get(al.indexOf(a)).setNota1(z);
		}
		else if(x==9) {
			System.out.println("Nota: ");
			z = sc.nextInt();
			al.get(al.indexOf(a)).setNota2(z);
		}
		else if(x==10) {
			System.out.println("Nota: ");
			z = sc.nextInt();
			al.get(al.indexOf(a)).setNota3(z);
		}
		else if(x==11) {
			System.out.println("Nota: ");
			z = sc.nextInt();
			al.get(al.indexOf(a)).setNota4(z);
		}
		else{
			System.out.println("Error");
		}
	}
	
	public void verDatos(Alumno a) {
		String data;
		try {
			data=br.readLine();
			while(data!=null) {
				if("Alumno: ".concat(Integer.toString(a.getNIA())).equals(data)) {
					for(int x=0;x<13;x++) {
					System.out.println(data);
					data=br.readLine();

					}
				}
				data=br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void lista() {
		
		String data;
		try {
			data= br.readLine();
			while(data!=null) {
				System.out.println(data);
				data = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void actualizar() {
		
		for(Alumno a:al) {
			try {
				bw.write(a.toString());
				bw.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main (String[] args) {
		Administracion ad = new Administracion();
		Alumno a1 = new Alumno("Ramez", "Elhadad", "DW1E", "ramez@gmail.com", 111111, 20, 99999999);
		Alumno a2 = new Alumno("Ruben", "Ramos", "DW1E", "ruben@gmail.com", 222222, 25, 88888888);
		Alumno a3 = new Alumno("Zyad", "Mazen", "DW1E", "mazen@gmail.com", 333333, 22, 77777777);
		
		a1.añadarNotas();
		a2.añadarNotas();
		a3.añadarNotas();

		
		ad.alta(a1);
		ad.alta(a2);
		ad.alta(a3);
		ad.actualizar();
		ad.verDatos(a2);
		
	}
}
