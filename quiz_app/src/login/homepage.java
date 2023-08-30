package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.border.SoftBevelBorder;

import Application.Main;
import Application.MainCS;
import Application.MainHTML;
import Application.MainPython;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class homepage {

	private JFrame frame;
	private JButton btnjava;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage window = new homepage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial Narrow", Font.BOLD, 30));
		frame.getContentPane().setBackground(new Color(128, 0, 0));
		frame.setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 735, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnjava = new JButton("Java");
		btnjava.setBorderPainted(false);
		btnjava.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnjava.setSelected(true);
		btnjava.setForeground(new Color(83, 13, 2));
		btnjava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main(null);
				frame.dispose();
				
			}
		});
		btnjava.setBackground(new Color(255, 235, 205));
		btnjava.setFont(new Font("Century", Font.BOLD, 30));
		btnjava.setBounds(64, 167, 151, 68);
		frame.getContentPane().add(btnjava);
		
		JButton btnpython = new JButton("Python");
		btnpython.setForeground(new Color(83, 13, 2));
		btnpython.setFont(new Font("Century", Font.BOLD, 30));
		btnpython.setBorderPainted(false);
		btnpython.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPython.main(null);
				frame.dispose();
			}
		});
		btnpython.setBackground(new Color(255, 235, 205));
		btnpython.setBounds(64, 362, 151, 68);
		frame.getContentPane().add(btnpython);
		
		JButton btncs = new JButton("C#");
		btncs.setForeground(new Color(83, 13, 2));
		btncs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainCS.main(null);
				frame.dispose();
				
			}
		});
		btncs.setFont(new Font("Century", Font.BOLD, 30));
		btncs.setBackground(new Color(255, 235, 205));
		btncs.setBorderPainted(false);
		btncs.setBounds(447, 167, 151, 68);
		frame.getContentPane().add(btncs);
		
		JButton btnNewButton = new JButton("HTML");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainHTML.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setForeground(new Color(83, 13, 2));
		btnNewButton.setFont(new Font("Century", Font.BOLD, 30));
		btnNewButton.setBackground(new Color(255, 235, 205));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(447, 362, 151, 68);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Welcome To The Quizzer");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 45));
		lblNewLabel.setBackground(new Color(250, 240, 230));
		lblNewLabel.setBounds(10, 38, 694, 68);
		frame.getContentPane().add(lblNewLabel);
	}
}
