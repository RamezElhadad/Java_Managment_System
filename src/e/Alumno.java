package e;

import java.util.Scanner;

public class Alumno {
	
	private String Nombre;
	private String Apellido;
	private String grupo;
	private String email;
	private int NIA;
	private int Edad;
	private long Tel;
	private float Nota1;
	private float Nota2;
	private float Nota3;
	private float Nota4;
	private float NotaF;
	
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
	public long getTel() {
		return Tel;
	}
	public void setTel(long tel) {
		Tel = tel;
	}
	public float getNota1() {
		return Nota1;
	}
	public void setNota1(float nota1) {
		Nota1 = nota1;
	}
	public float getNota2() {
		return Nota2;
	}
	public void setNota2(float nota2) {
		Nota2 = nota2;
	}
	public float getNota3() {
		return Nota3;
	}
	public void setNota3(float nota3) {
		Nota3 = nota3;
	}
	public float getNota4() {
		return Nota4;
	}
	public void setNota4(float nota4) {
		Nota4 = nota4;
	}
	public float getNotaF() {
		return NotaF;
	}
	public void setNotaF() {
		if(Nota4!=0) {
			this.NotaF=(Nota1+Nota2+Nota3+Nota4)/4;
		}
		else {
			NotaF=(Nota1+Nota2+Nota3)/3;
		}
	}
	
	public Alumno(String nombre, String apellido, String grupo, String email, int nIA, int edad, long tel,float n1,float n2,float n3,float n4) {
		super();
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.grupo = grupo;
		this.email = email;
		this.NIA = nIA;
		this.Edad = edad;
		this.Tel = tel;
		this.Nota1 = n1;
		this.Nota2 = n2;
		this.Nota3 = n3;
		this.Nota4 = n4;
		
		if(Nota4!=0) {
			this.NotaF=(Nota1+Nota2+Nota3+Nota4)/4;
		}
		else {
			NotaF=(Nota1+Nota2+Nota3)/3;
		}
	}
	
	
	public String toString() {

		return "Alumno: "+this.NIA+"\nNombre: "+this.Nombre+"\nApellido: "+this.Apellido+"\nEdad: "+this.Edad+"\nGrupo: "+this.grupo+"\nemail: "+this.email
				+"\nTelefono: "+this.Tel+"\nNota Final: "+this.NotaF+"\nNota eva1: "+this.Nota1+"\nNota eva2: "+this.Nota2+"\nNota eva3: "+this.Nota3+"\nNota eva4: "
				+this.Nota4+"\n-------------------------------------------------------";
	}
	


}
