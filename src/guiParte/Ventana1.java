package guiParte;
import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Ventana1 {

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		show();
	}
	
	static String nombre;
	
	
	public static void show() {
		JFrame frame = new JFrame("EMPRESA PATATA_Inicio");
		frame.setBounds(200, 200, 721, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton emp = new JButton("Gestionar Emp");
		emp.setSize(196, 100);
		emp.setLocation(40, 68);
		emp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre = "Emp";
				
				frame.setVisible(false);
				Opciones.show();
				
			}
		});
		frame.getContentPane().add(emp);
		
		JButton dept = new JButton("Gestionar Dept");
		dept.setSize(196, 100);
		dept.setLocation(411, 68);
		frame.getContentPane().add(dept);
		dept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre = "Dept";
				
				frame.setVisible(false);
				Opciones.show();
				
			}
		});
		
		JButton salir = new JButton("Salir");
		salir.setLocation(233, 218);
		salir.setSize(196, 100);
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(salir);
		
		frame.setVisible(true);
	}
}
