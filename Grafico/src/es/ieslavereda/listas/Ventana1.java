package es.ieslavereda.listas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Ventana1 extends JFrame{

	private JPanel contentPane;
	private JTextField textFieldDisplay;
	private JButton button9;
	private JButton button8;
	private JButton button7;
	private JButton button6;
	private JButton button5;
	private JButton button4;
	private JButton button3;
	private JButton button2;
	private JButton button1;
	private JButton buttonChangeSigne;
	private JButton button0;
	private JButton buttonComma;
	private JButton buttonPlus;
	private JButton buttonMinus;
	private JButton buttonEqual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panelSuperior = new JPanel();
		
		JPanel panelIzquierdo = new JPanel();
		
		JPanel panelDerecho = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panelSuperior, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(panelIzquierdo, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(panelDerecho, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelSuperior, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panelDerecho, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelIzquierdo, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(94, Short.MAX_VALUE))
		);
		panelDerecho.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panelDerecho.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 0, 5, 5));
		
		buttonPlus = new JButton("+");
		panel_1.add(buttonPlus);
		
		buttonMinus = new JButton("-");
		panel_1.add(buttonMinus);
		
		JPanel panel = new JPanel();
		panelDerecho.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		buttonEqual = new JButton("=");
		panel.add(buttonEqual, BorderLayout.CENTER);
		panelIzquierdo.setLayout(new GridLayout(4, 3, 5, 5));
		
		button9 = new JButton("9");
		panelIzquierdo.add(button9);
		
		button8 = new JButton("8");
		panelIzquierdo.add(button8);
		
		button7 = new JButton("7");
		panelIzquierdo.add(button7);
		
		button6 = new JButton("6");
		panelIzquierdo.add(button6);
		
		button5 = new JButton("5");
		panelIzquierdo.add(button5);
		
		button4 = new JButton("4");
		panelIzquierdo.add(button4);
		
		button3 = new JButton("3");
		panelIzquierdo.add(button3);
		
		button2 = new JButton("2");
		panelIzquierdo.add(button2);
		
		button1 = new JButton("1");
		panelIzquierdo.add(button1);
		
		buttonChangeSigne = new JButton("+/-");
		panelIzquierdo.add(buttonChangeSigne);
		
		button0 = new JButton("0");
		panelIzquierdo.add(button0);
		
		buttonComma = new JButton(",");
		panelIzquierdo.add(buttonComma);
		panelSuperior.setLayout(new BorderLayout(0, 0));
		
		textFieldDisplay = new JTextField();
		textFieldDisplay.setEditable(false);
		textFieldDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldDisplay.setFont(new Font("Dialog", Font.PLAIN, 17));
		textFieldDisplay.setText("13456");
		panelSuperior.add(textFieldDisplay, BorderLayout.CENTER);
		textFieldDisplay.setColumns(10);
		contentPane.setLayout(gl_contentPane);
	}

//	@Override
//	public void actionPerformed(ActionEvent arg0) {
//		String nombre = txtFieldNombre.getText();
//		String apellidos = txtFieldApellidos.getText();
//		
//			//System.out.println("Has hecho click " + nombre + " " +  apellidos);
//		JOptionPane.showMessageDialog(this, "Hola " + nombre + " " + apellidos, "Welcome", JOptionPane.ERROR_MESSAGE);
//	}
}
