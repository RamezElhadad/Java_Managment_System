package guiParte;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.DropMode;

public class Funciones {
	private static JTextField txt;
	private static JTextField txt2;
	private static JTextField txt3;
	private static String deptno;
	private static String empno;
	private static String ename;

	public static void main(String[] args) {
		show();
		System.out.println(txt.getText());
	}
	
	public static void show() {
		JFrame frame = new JFrame("EMPRESA PATATA_"+Ventana1.nombre);
		frame.setBounds(200, 200, 721, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton atras = new JButton("Atras");
		atras.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 15));
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
				Dept.show();
			}
		});
		atras.setBounds(10, 11, 123, 43);
		frame.getContentPane().add(atras);
		
		JLabel lel = new JLabel("Deptno:");
		lel.setHorizontalAlignment(SwingConstants.CENTER);
		lel.setForeground(Color.BLACK);
		lel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel.setBackground(Color.CYAN);
		lel.setBounds(10, 85, 123, 35);
		frame.getContentPane().add(lel);
		
		txt = new JTextField();
		txt.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt.setHorizontalAlignment(SwingConstants.LEFT);
		lel.setLabelFor(txt);
		txt.setBounds(143, 85, 192, 35);
		frame.getContentPane().add(txt);
		txt.setColumns(20);
		
		if(Ventana1.nombre == "Emp") {
		
		JLabel lel2 = new JLabel("Empno");
		lel2.setHorizontalAlignment(SwingConstants.CENTER);
		lel2.setForeground(Color.BLACK);
		lel2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel2.setBackground(Color.CYAN);
		lel2.setBounds(10, 176, 123, 35);
		frame.getContentPane().add(lel2);
		
		JLabel lel3 = new JLabel("Ename");
		lel3.setHorizontalAlignment(SwingConstants.CENTER);
		lel3.setForeground(Color.BLACK);
		lel3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel3.setBackground(Color.CYAN);
		lel3.setBounds(10, 282, 123, 35);
		frame.getContentPane().add(lel3);
		
		txt2 = new JTextField();
		txt2.setHorizontalAlignment(SwingConstants.LEFT);
		txt2.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt2.setColumns(20);
		lel2.setLabelFor(txt2);
		txt2.setBounds(143, 176, 192, 35);
		frame.getContentPane().add(txt2);
		
		txt3 = new JTextField();
		txt3.setHorizontalAlignment(SwingConstants.LEFT);
		txt3.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt3.setColumns(20);
		lel3.setLabelFor(txt3);
		txt3.setBounds(143, 282, 192, 35);
		frame.getContentPane().add(txt3);
		
		}
		
		deptno = txt.getText();
		empno = txt2.getText();
		ename = txt3.getText();
		frame.setVisible(true);
	}
}
