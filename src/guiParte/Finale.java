package guiParte;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

public class Finale {

	public static void main(String[] args) {
		
		show();
		
	}
	
	public static void show() {
		JFrame frame = new JFrame("EMPRESA PATATA_"+Ventana1.nombre);
		frame.setBackground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.setBounds(200, 200, 721, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		if(DB.res() == "0" || DB.getResult() == null || DB.getResult() == "") {
			JOptionPane.showMessageDialog(frame, "Un Error se pasó", "Resulta", JOptionPane.ERROR_MESSAGE);
		}
		else {
			if(Opciones.caso != 4) {
				JOptionPane.showMessageDialog(frame, "El proceso pasó bien", "Resulta", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(frame, DB.getResult(), "Resulta", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		JButton si = new JButton("SI");
		si.setForeground(Color.WHITE);
		si.setBackground(new Color(0, 0, 0));
		si.setFont(new Font("Serif", Font.BOLD, 15));
		si.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				Ventana1.show();
			}
		});
		
		si.setBounds(235, 144, 74, 74);
		frame.getContentPane().add(si);
		
		JLabel txt = new JLabel("Algo Mas?");
		txt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		txt.setForeground(new Color(0, 0, 0));
		txt.setBackground(new Color(0, 0, 0));
		txt.setHorizontalAlignment(SwingConstants.CENTER);
		txt.setBounds(228, 66, 217, 39);
		frame.getContentPane().add(txt);
		
		JButton no = new JButton("NO");
		no.setForeground(Color.WHITE);
		no.setBackground(new Color(0, 0, 0));
		no.setFont(new Font("Serif", Font.BOLD, 15));
		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
			
		});
		no.setBounds(371, 144, 74, 74);
		frame.getContentPane().add(no);
		
		frame.setVisible(true);
		
		
	}
}
