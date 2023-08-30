package Application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.TextArea;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

import login.homepage;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class End {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					End window = new End();
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
	public End() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(122, 207, 199));
		frame.setBounds(100, 100, 644, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FEEDBACK");
		lblNewLabel.setBackground(new Color(213, 234, 234));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 30));
		lblNewLabel.setBounds(144, 29, 342, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(84, 121, 465, 177);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setWrapStyleWord(true);
		
		JButton btnsubmit = new JButton("SEND FEEDBACK");
		btnsubmit.addActionListener(new ActionListener() {
	

			public void actionPerformed(ActionEvent e) {
				String feed_back = textArea.getText();
				if(feed_back.isEmpty()) {
					JOptionPane.showMessageDialog(null, "We are waiting for your valuable response!!!");
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Thank you for your valuable response!!!");
					textArea.setText(null);
				}
			
				
				
			}
		});
		btnsubmit.setBackground(new Color(213, 234, 234));
		btnsubmit.setBorderPainted(false);
		btnsubmit.setFont(new Font("MV Boli", Font.BOLD, 20));
		btnsubmit.setBounds(63, 341, 212, 48);
		frame.getContentPane().add(btnsubmit);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(213, 234, 234));
		btnNewButton_1.setFont(new Font("MV Boli", Font.BOLD, 20));
		btnNewButton_1.setBounds(361, 342, 192, 46);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(213, 234, 234));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(226, 399, 165, 45);
		frame.getContentPane().add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 315, 610, 10);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 92, 610, 2);
		frame.getContentPane().add(separator_1);
		
		
		
		
	}
}
