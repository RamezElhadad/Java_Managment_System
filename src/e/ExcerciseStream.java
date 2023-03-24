package e;

import java.util.ArrayList;
import java.io.*;

public class ExcerciseStream {

	public static void main(String[] args) {
		
		ArrayList<Alumno> al = new ArrayList();
		
		Alumno a1 = new Alumno("Ramez", "Elhadad", "DW1E", "ramez@gmail.com", 111111, 20, 99999999,10,10,10,0);
		Alumno a2 = new Alumno("Ruben", "Ramos", "DW1E", "ruben@gmail.com", 222222, 25, 88888888,9,10,6,7);
		Alumno a3 = new Alumno("Zyad", "Mazen", "DW1E", "mazen@gmail.com", 333333, 22, 77777777,5,5,5,5);
		Alumno a4 = new Alumno("Bro", "Mikel", "DW1E", "mikel@gmail.com", 444444, 20, 66666666,5,6,7,8);
		Alumno a5 = new Alumno("John", "Alex", "DW1E", "joe@gmail.com", 555555, 22, 55555555,10,9,8,7);
		

		
		al.add(a1);
		al.add(a3);
		al.add(a2);
		al.add(a4);
		al.add(a5);
		
		try {
			ObjectOutputStream fo = new ObjectOutputStream(new FileOutputStream("File.txt"));
			fo.writeObject(al);
			fo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream fi = new ObjectInputStream(new FileInputStream("File.txt"));
			ArrayList<Alumno> alu = (ArrayList) fi.readObject();
			for(Alumno z :alu) {
				System.out.println(z);
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		}
	}


