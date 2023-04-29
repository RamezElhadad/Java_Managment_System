package guiParte;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
public class Opciones {

	public static void main(String[] args) {

		show();
	}
	
	static int caso;
	
	public static void show() {
		JFrame frame = new JFrame("EMPRESA PATATA_"+Ventana1.nombre);
		frame.setBounds(200, 200, 721, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton alta = new JButton("Dar Alta");
		alta.setFont(new Font("Serif", Font.BOLD, 15));
		alta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				caso = 1;
				Info.show();
			}
		});
		
		alta.setBounds(187, 11, 259, 74);
		frame.getContentPane().add(alta);
		
		JButton atras = new JButton("Atras");
		atras.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 15));
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Ventana1.show();
			}
		});
		atras.setBounds(10, 324, 123, 43);
		frame.getContentPane().add(atras);
		
		JButton mod = new JButton("Dar de Baja");
		mod.setFont(new Font("Serif", Font.BOLD, 15));
		mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caso = 2;
				Info.show();
			}
		});
		
		mod.setBounds(187, 103, 259, 74);
		frame.getContentPane().add(mod);
		
		JButton baja = new JButton("Modificar");
		baja.setFont(new Font("Serif", Font.BOLD, 15));
		baja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caso = 3;
				Info.show();
			}
		});
		
		baja.setBounds(187, 200, 259, 74);
		frame.getContentPane().add(baja);
		
		JButton ver = new JButton("Ver Lista");
		ver.setFont(new Font("Serif", Font.BOLD, 15));
		ver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caso = 4;
				Finale.show();
			}
		});
		
		ver.setBounds(187, 293, 259, 74);
		frame.getContentPane().add(ver);
		
		frame.setVisible(true);
	}

}
