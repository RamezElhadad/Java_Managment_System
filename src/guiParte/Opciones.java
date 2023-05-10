package guiParte;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.SystemColor;
public class Opciones {

	public static void main(String[] args) {

		show();
	}
	
	static int caso;
	
	public static void show() {
		JFrame frame = new JFrame("EMPRESA PATATA_"+Ventana1.nombre);
		frame.setBackground(Color.BLUE);
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.setBounds(200, 200, 721, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton alta = new JButton("Dar Alta");
		alta.setForeground(Color.WHITE);
		alta.setBackground(Color.BLACK);
		alta.setFont(new Font("Serif", Font.BOLD, 15));
		alta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				caso = 1;
				
				frame.setVisible(false);
				Info.show();
			}
		});
		
		alta.setBounds(187, 11, 259, 74);
		frame.getContentPane().add(alta);
		
		JButton atras = new JButton("Atras");
		atras.setForeground(Color.BLUE);
		atras.setBackground(Color.BLACK);
		atras.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 15));
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				Ventana1.show();
			}
		});
		atras.setBounds(10, 324, 123, 43);
		frame.getContentPane().add(atras);
		
		JButton mod = new JButton("Dar de Baja");
		mod.setForeground(Color.WHITE);
		mod.setBackground(Color.BLACK);
		mod.setFont(new Font("Serif", Font.BOLD, 15));
		mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caso = 2;
				
				frame.setVisible(false);
				Info.show();
			}
		});
		
		mod.setBounds(187, 103, 259, 74);
		frame.getContentPane().add(mod);
		
		JButton baja = new JButton("Modificar");
		baja.setForeground(Color.WHITE);
		baja.setBackground(Color.BLACK);
		baja.setFont(new Font("Serif", Font.BOLD, 15));
		baja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caso = 3;
				
				frame.setVisible(false);
				Info.show();
			}
		});
		
		baja.setBounds(187, 200, 259, 74);
		frame.getContentPane().add(baja);
		
		JButton ver = new JButton("Ver Lista");
		ver.setForeground(Color.WHITE);
		ver.setBackground(Color.BLACK);
		ver.setFont(new Font("Serif", Font.BOLD, 15));
		ver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caso = 4;
				
				frame.setVisible(false);
				Finale.show();
			}
		});
		
		ver.setBounds(187, 293, 259, 74);
		frame.getContentPane().add(ver);
		
		frame.setVisible(true);
	}

}
