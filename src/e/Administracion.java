
package e;

import java.util.*;
import java.io.*;
import java.nio.file.Files;

public class Administracion {
	private ArrayList<Alumno> al = new ArrayList();
	private BufferedReader br;
	private BufferedWriter bw;
	private File alumnos;
	public Administracion() {}
	
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
			a.setNotaF();
		}
		else if(x==9) {
			System.out.println("Nota: ");
			z = sc.nextInt();
			al.get(al.indexOf(a)).setNota2(z);
			a.setNotaF();
		}
		else if(x==10) {
			System.out.println("Nota: ");
			z = sc.nextInt();
			al.get(al.indexOf(a)).setNota3(z);
			a.setNotaF();
		}
		else if(x==11) {
			System.out.println("Nota: ");
			z = sc.nextInt();
			al.get(al.indexOf(a)).setNota4(z);
			a.setNotaF();
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
		alumnos = new File("C:\\Users\\Vespertino\\eclipse-workspace\\AdministracionAlumnos\\Alumnos\\Datos.txt");
		
		try {
			alumnos.createNewFile();
			br = new BufferedReader(new FileReader(alumnos));
			bw = new BufferedWriter(new FileWriter(alumnos,false));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main (String[] args) {
		Administracion ad = new Administracion();
		Scanner sc = new Scanner(System.in);
		
		Alumno a;
		Alumno a1 = new Alumno("Ramez", "Elhadad", "DW1E", "ramez@gmail.com", 111111, 20, 99999999,10,10,10,0);
		Alumno a2 = new Alumno("Ruben", "Ramos", "DW1E", "ruben@gmail.com", 222222, 25, 88888888,9,10,6,7);
		Alumno a3 = new Alumno("Zyad", "Mazen", "DW1E", "mazen@gmail.com", 333333, 22, 77777777,5,5,5,5);
		
		int y,nia,edad;
		float n1,n2,n3,n4;
		long tel;
		String resp,nomb,app,grop,mail;
		
		
		
		do {
			System.out.println("1.Alta \n2.Baja \n3.Modificar \n4.Ver Datos \n5.Lista");
			System.out.println("Elige un opcion: ");
			y = sc.nextInt();
			
			if(y==1) {
				System.out.println("NIA: ");
				nia=sc.nextInt();
				
				System.out.println("Nombre: ");
				nomb=sc.next();
				
				System.out.println("Apellido: ");
				app=sc.next();
				
				System.out.println("Edad: ");
				edad=sc.nextInt();
				
				System.out.println("Grupo: ");
				grop=sc.next();
				
				System.out.println("Email: ");
				mail=sc.next();
				
				System.out.println("Telefono: ");
				tel=sc.nextInt();
				
				System.out.println("Nota eva1: ");
				n1=sc.nextInt();
				
				System.out.println("Nota eva2: ");
				n2=sc.nextInt();
				
				System.out.println("Nota eva3: ");
				n3=sc.nextInt();
				
				System.out.println("Nota eva4: ");
				n4=sc.nextInt();
				
				a = new Alumno(nomb, app, grop, mail, nia, edad, tel,n1,n2,n3,n4);
				ad.alta(a);
				ad.actualizar();
			}
			else if(y==2) {
				System.out.println("Escribe el NIA: ");
				y=sc.nextInt();
				
				for(Alumno i: ad.al) {
					if(i.getNIA()==y) {
						ad.baja(i);
						ad.actualizar();
					}
				}
			}
			else if(y==3) {
				System.out.println("Escribe el NIA: ");
				y=sc.nextInt();
				
				for(Alumno i: ad.al) {
					if(i.getNIA()==y) {
						ad.modifcar(i);
						ad.actualizar();
					}
				}
			}
			else if(y==4) {
				System.out.println("Escribe el NIA: ");
				y=sc.nextInt();
				
				for(Alumno i: ad.al) {
					if(i.getNIA()==y) {
						ad.verDatos(i);
						ad.actualizar();
					}
				}
			}
			else if(y==5) {
				ad.lista();
			}
			else {
				System.out.println("Error!! ");
			}
			
			System.out.println("Algo mas?  SI/NO");
			resp=sc.next();
		}
		while(resp.charAt(0)=='S'||resp.charAt(0)=='s');
		
		System.out.println("Hasta luego");


	}
}
