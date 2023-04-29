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
import javax.swing.JCheckBox;

public class Info {
	private static JTextField txt;
	private static JTextField txt2;
	private static JTextField txt4;
	 static String deptno;
	 static String empno;
	 static String ename;
	 static String job;
	 static String hiredate;
	 static String mgr;
	 static String comm;
	 static String sal;
	 static String loc;
	 static String dname;
	 private static JTextField txt3;
	 private static JTextField txt5;
	 private static JTextField txt6;
	 private static JTextField txt7;
	 private static JTextField txt8;

	public static void main(String[] args) {
		show();
		System.out.println(txt.getText());
	}
	
	public static void show() {
		JFrame frame = new JFrame("EMPRESA PATATA_"+Ventana1.nombre);
		frame.setBounds(200, 200, 721, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
//-------------------------------------Caso 1- Emp-----------------------------------------------------------------------	
		
		
		if(Ventana1.nombre == "Emp" && Opciones.caso == 1) {
		
		JLabel lel = new JLabel("Deptno:");
		lel.setHorizontalAlignment(SwingConstants.CENTER);
		lel.setForeground(Color.BLACK);
		lel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel.setBackground(Color.CYAN);
		lel.setBounds(10, 25, 123, 35);
		frame.getContentPane().add(lel);
		
		txt = new JTextField();
		txt.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt.setHorizontalAlignment(SwingConstants.LEFT);
		lel.setLabelFor(txt);
		txt.setBounds(143, 26, 192, 35);
		frame.getContentPane().add(txt);
		txt.setColumns(20);
		
		JLabel lel2 = new JLabel("Empno:");
		lel2.setHorizontalAlignment(SwingConstants.CENTER);
		lel2.setForeground(Color.BLACK);
		lel2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel2.setBackground(Color.CYAN);
		lel2.setBounds(10, 88, 123, 35);
		frame.getContentPane().add(lel2);
		
		JLabel lel4 = new JLabel("Job:");
		lel4.setHorizontalAlignment(SwingConstants.CENTER);
		lel4.setForeground(Color.BLACK);
		lel4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel4.setBackground(Color.CYAN);
		lel4.setBounds(10, 210, 123, 35);
		frame.getContentPane().add(lel4);
		
		txt2 = new JTextField();
		txt2.setHorizontalAlignment(SwingConstants.LEFT);
		txt2.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt2.setColumns(20);
		lel2.setLabelFor(txt2);
		txt2.setBounds(143, 89, 192, 35);
		frame.getContentPane().add(txt2);
		
		txt4 = new JTextField();
		txt4.setHorizontalAlignment(SwingConstants.LEFT);
		txt4.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt4.setColumns(20);
		lel4.setLabelFor(txt4);
		txt4.setBounds(143, 211, 192, 35);
		frame.getContentPane().add(txt4);
		
		
		JLabel lel5 = new JLabel("MGR:");
		lel5.setHorizontalAlignment(SwingConstants.CENTER);
		lel5.setForeground(Color.BLACK);
		lel5.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel5.setBackground(Color.CYAN);
		lel5.setBounds(378, 25, 123, 35);
		frame.getContentPane().add(lel5);
		
		JLabel lel3 = new JLabel("Ename:");
		lel3.setLabelFor(txt4);
		lel3.setHorizontalAlignment(SwingConstants.CENTER);
		lel3.setForeground(Color.BLACK);
		lel3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel3.setBackground(Color.CYAN);
		lel3.setBounds(10, 150, 123, 35);
		frame.getContentPane().add(lel3);
		
		JLabel lel6 = new JLabel("HireDate:");
		lel6.setHorizontalAlignment(SwingConstants.CENTER);
		lel6.setForeground(Color.BLACK);
		lel6.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel6.setBackground(Color.CYAN);
		lel6.setBounds(378, 88, 123, 35);
		frame.getContentPane().add(lel6);
		
		JLabel lel7 = new JLabel("Salary:");
		lel7.setHorizontalAlignment(SwingConstants.CENTER);
		lel7.setForeground(Color.BLACK);
		lel7.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel7.setBackground(Color.CYAN);
		lel7.setBounds(378, 150, 123, 35);
		frame.getContentPane().add(lel7);
		
		JLabel lel8 = new JLabel("Commision:");
		lel8.setHorizontalAlignment(SwingConstants.CENTER);
		lel8.setForeground(Color.BLACK);
		lel8.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel8.setBackground(Color.CYAN);
		lel8.setBounds(378, 210, 123, 35);
		frame.getContentPane().add(lel8);
		
		txt3 = new JTextField();
		txt3.setHorizontalAlignment(SwingConstants.LEFT);
		txt3.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt3.setColumns(20);
		txt3.setBounds(143, 150, 192, 35);
		frame.getContentPane().add(txt3);
		
		txt5 = new JTextField();
		txt5.setText("Manager ID");
		lel5.setLabelFor(txt5);
		txt5.setHorizontalAlignment(SwingConstants.LEFT);
		txt5.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt5.setColumns(20);
		txt5.setBounds(503, 26, 192, 35);
		frame.getContentPane().add(txt5);
		
		txt6 = new JTextField();
		txt6.setText("yyyy-mm-dd");
		lel6.setLabelFor(txt6);
		txt6.setHorizontalAlignment(SwingConstants.LEFT);
		txt6.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt6.setColumns(20);
		txt6.setBounds(503, 88, 192, 35);
		frame.getContentPane().add(txt6);
		
		txt7 = new JTextField();
		lel7.setLabelFor(txt7);
		txt7.setHorizontalAlignment(SwingConstants.LEFT);
		txt7.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt7.setColumns(20);
		txt7.setBounds(503, 150, 192, 35);
		frame.getContentPane().add(txt7);
		
		txt8 = new JTextField();
		lel8.setLabelFor(txt8);
		txt8.setHorizontalAlignment(SwingConstants.LEFT);
		txt8.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt8.setColumns(20);
		txt8.setBounds(503, 210, 192, 35);
		frame.getContentPane().add(txt8);
		
		}
//-------------------------------------Caso 1- Dept-----------------------------------------------------------------------	
	
		else if(Ventana1.nombre == "Dept" && Opciones.caso == 1){

		
		JLabel lel = new JLabel("Deptno:");
		lel.setHorizontalAlignment(SwingConstants.CENTER);
		lel.setForeground(Color.BLACK);
		lel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel.setBackground(Color.CYAN);
		lel.setBounds(10, 25, 123, 35);
		frame.getContentPane().add(lel);
		
		txt = new JTextField();
		txt.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt.setHorizontalAlignment(SwingConstants.LEFT);
		lel.setLabelFor(txt);
		txt.setBounds(143, 26, 192, 35);
		frame.getContentPane().add(txt);
		txt.setColumns(20);
		
		JLabel lel2 = new JLabel("Dname:");
		lel2.setHorizontalAlignment(SwingConstants.CENTER);
		lel2.setForeground(Color.BLACK);
		lel2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel2.setBackground(Color.CYAN);
		lel2.setBounds(10, 112, 123, 35);
		frame.getContentPane().add(lel2);
		
		JLabel lel4 = new JLabel("Loc:");
		lel4.setHorizontalAlignment(SwingConstants.CENTER);
		lel4.setForeground(Color.BLACK);
		lel4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel4.setBackground(Color.CYAN);
		lel4.setBounds(10, 210, 123, 35);
		frame.getContentPane().add(lel4);
		
		txt2 = new JTextField();
		txt2.setHorizontalAlignment(SwingConstants.LEFT);
		txt2.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt2.setColumns(20);
		lel2.setLabelFor(txt2);
		txt2.setBounds(143, 113, 192, 35);
		frame.getContentPane().add(txt2);
		
		txt4 = new JTextField();
		txt4.setHorizontalAlignment(SwingConstants.LEFT);
		txt4.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt4.setColumns(20);
		lel4.setLabelFor(txt4);
		txt4.setBounds(143, 211, 192, 35);
		frame.getContentPane().add(txt4);
		
		}
//-------------------------------------Caso 2- Emp && Dept-----------------------------------------------------------------------	
		
		
		else if(Opciones.caso == 2) {
			JLabel lel = new JLabel("Deptno:");
			lel.setHorizontalAlignment(SwingConstants.CENTER);
			lel.setForeground(Color.BLACK);
			lel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
			lel.setBackground(Color.CYAN);
			lel.setBounds(10, 25, 123, 35);
			frame.getContentPane().add(lel);
			
			txt = new JTextField();
			txt.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
			txt.setHorizontalAlignment(SwingConstants.LEFT);
			lel.setLabelFor(txt);
			txt.setBounds(143, 26, 192, 35);
			frame.getContentPane().add(txt);
			txt.setColumns(20);
			
			if(Ventana1.nombre.equals("Emp")) {
			
			JLabel lel2 = new JLabel("Empno:");
			lel2.setHorizontalAlignment(SwingConstants.CENTER);
			lel2.setForeground(Color.BLACK);
			lel2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
			lel2.setBackground(Color.CYAN);
			lel2.setBounds(10, 88, 123, 35);
			frame.getContentPane().add(lel2);
			
			txt2 = new JTextField();
			txt2.setHorizontalAlignment(SwingConstants.LEFT);
			txt2.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
			txt2.setColumns(20);
			lel2.setLabelFor(txt2);
			txt2.setBounds(143, 89, 192, 35);
			frame.getContentPane().add(txt2);
			}
		}
//-------------------------------------Caso 3- Emp-----------------------------------------------------------------------	
		
		else if(Opciones.caso == 3 && Ventana1.nombre.equals("Emp")) {
		
		JLabel lel = new JLabel("Deptno:");
		lel.setHorizontalAlignment(SwingConstants.CENTER);
		lel.setForeground(Color.BLACK);
		lel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel.setBackground(Color.CYAN);
		lel.setBounds(10, 25, 123, 35);
		frame.getContentPane().add(lel);
		
		txt = new JTextField();
		txt.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt.setHorizontalAlignment(SwingConstants.LEFT);
		lel.setLabelFor(txt);
		txt.setBounds(143, 26, 192, 35);
		frame.getContentPane().add(txt);
		txt.setColumns(20);
				
		JLabel lel2 = new JLabel("Empno:");
		lel2.setHorizontalAlignment(SwingConstants.CENTER);
		lel2.setForeground(Color.BLACK);
		lel2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel2.setBackground(Color.CYAN);
		lel2.setBounds(10, 88, 123, 35);
		frame.getContentPane().add(lel2);
		
		JLabel lel4 = new JLabel("Job:");
		lel4.setHorizontalAlignment(SwingConstants.CENTER);
		lel4.setForeground(Color.BLACK);
		lel4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel4.setBackground(Color.CYAN);
		lel4.setBounds(10, 210, 123, 35);
		frame.getContentPane().add(lel4);
		
		txt2 = new JTextField();
		txt2.setHorizontalAlignment(SwingConstants.LEFT);
		txt2.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt2.setColumns(20);
		lel2.setLabelFor(txt2);
		txt2.setBounds(143, 89, 192, 35);
		frame.getContentPane().add(txt2);
		
		txt4 = new JTextField();
		txt4.setHorizontalAlignment(SwingConstants.LEFT);
		txt4.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt4.setColumns(20);
		lel4.setLabelFor(txt4);
		txt4.setBounds(143, 211, 192, 35);
		frame.getContentPane().add(txt4);
		
		
		JLabel lel5 = new JLabel("MGR:");
		lel5.setHorizontalAlignment(SwingConstants.CENTER);
		lel5.setForeground(Color.BLACK);
		lel5.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel5.setBackground(Color.CYAN);
		lel5.setBounds(378, 25, 123, 35);
		frame.getContentPane().add(lel5);
		
		JLabel lel3 = new JLabel("Ename:");
		lel3.setLabelFor(txt4);
		lel3.setHorizontalAlignment(SwingConstants.CENTER);
		lel3.setForeground(Color.BLACK);
		lel3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel3.setBackground(Color.CYAN);
		lel3.setBounds(10, 150, 123, 35);
		frame.getContentPane().add(lel3);
		
		JLabel lel6 = new JLabel("HireDate:");
		lel6.setHorizontalAlignment(SwingConstants.CENTER);
		lel6.setForeground(Color.BLACK);
		lel6.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lel6.setBackground(Color.CYAN);
		lel6.setBounds(378, 88, 123, 35);
		frame.getContentPane().add(lel6);
		
		JLabel lel7 = new JLabel("Salary:");
		lel7.setHorizontalAlignment(SwingConstants.CENTER);
		lel7.setForeground(Color.BLACK);
		lel7.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lel7.setBackground(Color.CYAN);
		lel7.setBounds(378, 150, 123, 35);
		frame.getContentPane().add(lel7);
		
		JLabel lel8 = new JLabel("Commision:");
		lel8.setHorizontalAlignment(SwingConstants.CENTER);
		lel8.setForeground(Color.BLACK);
		lel8.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lel8.setBackground(Color.CYAN);
		lel8.setBounds(378, 210, 123, 35);
		frame.getContentPane().add(lel8);
		
		txt3 = new JTextField();
		txt3.setHorizontalAlignment(SwingConstants.LEFT);
		txt3.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt3.setColumns(20);
		txt3.setBounds(143, 150, 192, 35);
		frame.getContentPane().add(txt3);
		
		txt5 = new JTextField();
		txt5.setText("Manager ID");
		lel5.setLabelFor(txt5);
		txt5.setHorizontalAlignment(SwingConstants.LEFT);
		txt5.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt5.setColumns(20);
		txt5.setBounds(503, 26, 192, 35);
		frame.getContentPane().add(txt5);
		
		txt6 = new JTextField();
		txt6.setText("yyyy-mm-dd");
		lel6.setLabelFor(txt6);
		txt6.setHorizontalAlignment(SwingConstants.LEFT);
		txt6.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt6.setColumns(20);
		txt6.setBounds(503, 88, 192, 35);
		frame.getContentPane().add(txt6);
		
		txt7 = new JTextField();
		lel7.setLabelFor(txt7);
		txt7.setHorizontalAlignment(SwingConstants.LEFT);
		txt7.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt7.setColumns(20);
		txt7.setBounds(503, 150, 192, 35);
		frame.getContentPane().add(txt7);
		
		txt8 = new JTextField();
		lel8.setLabelFor(txt8);
		txt8.setHorizontalAlignment(SwingConstants.LEFT);
		txt8.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		txt8.setColumns(20);
		txt8.setBounds(503, 210, 192, 35);
		frame.getContentPane().add(txt8);
		
		JCheckBox chDeptno = new JCheckBox("");
		chDeptno.setBounds(10, 34, 97, 23);
		frame.getContentPane().add(chDeptno);
		
		JCheckBox chEmpno = new JCheckBox("");
		chEmpno.setBounds(10, 97, 97, 23);
		frame.getContentPane().add(chEmpno);
		
		JCheckBox chEname = new JCheckBox("");
		chEname.setBounds(10, 159, 97, 23);
		frame.getContentPane().add(chEname);
		
		JCheckBox chJob = new JCheckBox("");
		chJob.setBounds(10, 219, 97, 23);
		frame.getContentPane().add(chJob);
		
		JCheckBox chMgr = new JCheckBox("");
		chMgr.setBounds(378, 34, 97, 23);
		frame.getContentPane().add(chMgr);
		
		JCheckBox chHire = new JCheckBox("");
		chHire.setBounds(378, 97, 97, 23);
		frame.getContentPane().add(chHire);
		
		JCheckBox chSal = new JCheckBox("");
		chSal.setBounds(378, 159, 97, 23);
		frame.getContentPane().add(chSal);
		
		JCheckBox chComm = new JCheckBox("");
		chComm.setBounds(378, 219, 97, 23);
		frame.getContentPane().add(chComm);
		
		JLabel lelMarca = new JLabel("Marca lo que quieres quitar");
		lelMarca.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		lelMarca.setHorizontalAlignment(SwingConstants.CENTER);
		lelMarca.setBounds(214, 325, 220, 42);
		frame.getContentPane().add(lelMarca);
		
		
		}
//-------------------------------------Caso 3- Dept-----------------------------------------------------------------------	
		
		
		else if(Opciones.caso == 3 && Ventana1.nombre.equals("Dept")) {
			
			JLabel lel = new JLabel("Deptno:");
			lel.setHorizontalAlignment(SwingConstants.CENTER);
			lel.setForeground(Color.BLACK);
			lel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
			lel.setBackground(Color.CYAN);
			lel.setBounds(10, 25, 123, 35);
			frame.getContentPane().add(lel);
			
			txt = new JTextField();
			txt.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
			txt.setHorizontalAlignment(SwingConstants.LEFT);
			lel.setLabelFor(txt);
			txt.setBounds(143, 26, 192, 35);
			frame.getContentPane().add(txt);
			txt.setColumns(20);
			
			JLabel lel2 = new JLabel("Dname:");
			lel2.setHorizontalAlignment(SwingConstants.CENTER);
			lel2.setForeground(Color.BLACK);
			lel2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
			lel2.setBackground(Color.CYAN);
			lel2.setBounds(10, 112, 123, 35);
			frame.getContentPane().add(lel2);
			
			JLabel lel4 = new JLabel("Loc:");
			lel4.setHorizontalAlignment(SwingConstants.CENTER);
			lel4.setForeground(Color.BLACK);
			lel4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
			lel4.setBackground(Color.CYAN);
			lel4.setBounds(10, 210, 123, 35);
			frame.getContentPane().add(lel4);
			
			txt2 = new JTextField();
			txt2.setHorizontalAlignment(SwingConstants.LEFT);
			txt2.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
			txt2.setColumns(20);
			lel2.setLabelFor(txt2);
			txt2.setBounds(143, 113, 192, 35);
			frame.getContentPane().add(txt2);
			
			txt4 = new JTextField();
			txt4.setHorizontalAlignment(SwingConstants.LEFT);
			txt4.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
			txt4.setColumns(20);
			lel4.setLabelFor(txt4);
			txt4.setBounds(143, 211, 192, 35);
			frame.getContentPane().add(txt4);
			
			JCheckBox chDeptno = new JCheckBox("");
			chDeptno.setBounds(10, 34, 97, 23);
			frame.getContentPane().add(chDeptno);
			
			JCheckBox chDname = new JCheckBox("");
			chDname.setBounds(10, 124, 97, 23);
			frame.getContentPane().add(chDname);
			
			JCheckBox chLoc = new JCheckBox("");
			chLoc.setBounds(10, 222, 97, 23);
			frame.getContentPane().add(chLoc);
			
			JLabel lelMarca = new JLabel("Marca lo que quieres quitar");
			lelMarca.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
			lelMarca.setHorizontalAlignment(SwingConstants.CENTER);
			lelMarca.setBounds(214, 325, 220, 42);
			frame.getContentPane().add(lelMarca);
	}
			
//-------------------------------------Atras - Enviar-----------------------------------------------------------------------	
		
		JButton atras = new JButton("Atras");
		atras.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 15));
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
				Opciones.show();
			}
		});
		atras.setBounds(10, 324, 123, 43);
		frame.getContentPane().add(atras);
		
		JButton envia = new JButton("Enviar");
		envia.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 15));
		envia.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				deptno = txt.getText();
				empno = txt2.getText();
				ename = txt3.getText();
				job = txt4.getText();
				mgr = txt5.getText();
				hiredate = txt6.getText();
				sal = txt7.getText();
				comm = txt8.getText();
				dname = txt2.getText();
				loc = txt3.getText();
				
	
			}
			
		});
		envia.setBounds(572, 324, 123, 43);
		frame.getContentPane().add(envia);
		
		
		
		
		frame.setVisible(true);
	}
}
