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
	
	static String nombre = "";
	
	
	public static void show() {
		JFrame frame = new JFrame("EMPRESA PATATA_Inicio");
		frame.setBounds(200, 200, 721, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(3,1));
		
		JButton emp = new JButton("Gestionar Emp");
		emp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre = "Emp";
				
				frame.setVisible(false);
				Dept.show();
				
			}
		});
		frame.getContentPane().add(emp);
		
		JButton dept = new JButton("Gestionar Dept");
		frame.getContentPane().add(dept);
		dept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre = "Dept";
				frame.setVisible(false);
				Dept.show();
				
			}
		});
		
		JButton salir = new JButton("Salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(salir);
		
		frame.setVisible(true);
	}

}
