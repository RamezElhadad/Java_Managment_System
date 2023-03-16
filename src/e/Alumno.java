package e;

import java.util.Scanner;

public class Alumno {
	
	private String Nombre;
	private String Apellido;
	private String grupo;
	private String email;
	private int NIA;
	private int Edad;
	private int Tel;
	private int Nota1=0;
	private int Nota2=0;
	private int Nota3=0;
	private int Nota4=0;
	private int NotaF=0;
	
	public int getNIA() {
		return NIA;
	}
	public void setNIA(int nIA) {
		NIA = nIA;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public int getTel() {
		return Tel;
	}
	public void setTel(int tel) {
		Tel = tel;
	}
	public int getNota1() {
		return Nota1;
	}
	public void setNota1(int nota1) {
		Nota1 = nota1;
	}
	public int getNota2() {
		return Nota2;
	}
	public void setNota2(int nota2) {
		Nota2 = nota2;
	}
	public int getNota3() {
		return Nota3;
	}
	public void setNota3(int nota3) {
		Nota3 = nota3;
	}
	public int getNota4() {
		return Nota4;
	}
	public void setNota4(int nota4) {
		Nota4 = nota4;
	}
	public int getNotaF() {
		return NotaF;
	}
	public void setNotaM(int notaF) {
		NotaF = notaF;
	}
	
	public Alumno(String nombre, String apellido, String grupo, String email, int nIA, int edad, int tel) {
		super();
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.grupo = grupo;
		this.email = email;
		this.NIA = nIA;
		this.Edad = edad;
		this.Tel = tel;
	}
	
	public boolean añadarNotas() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cual nota será? 1/2/3/4 ");
		int x=sc.nextInt();
		
		System.out.println("La Nota: ");
		int y= sc.nextInt();
		
		if(x==1) {
			this.Nota1 = y;
			return true;
		}
		else if(x==2){
			this.Nota2 = y;
			return true;
		}
		else if(x==3){
			this.Nota3 = y;
			return true;
		}
		else if(x==4){
			this.Nota4 = y;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public int notaMedia() {
		if(Nota4!=0) {
			NotaF=(Nota1+Nota2+Nota3+Nota4)/4;
		}
		else {
			NotaF=(Nota1+Nota2+Nota3)/3;
		}
		
		return NotaF;
				
	}
	
	public String toString() {

		return this.Nombre+"\nNombre: "+this.Nombre+"\nApellido: "+this.Apellido+"\nNIA: "+this.NIA+"\nEdad: "+this.Edad+"\nGrupo: "+this.grupo+"\nemail: "+this.email
				+"\nTelefono: "+this.Tel+"\nNota Final: "+this.NotaF+"\nNota eva1: "+this.Nota1+"\nNota eva2: "+this.Nota2+"\nNota eva3: "+this.Nota3+"\nNota eva4: "
				+this.Nota4+"\n-------------------------------------------------------";
	}
	


}
