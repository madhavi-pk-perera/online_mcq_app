package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login  {

	private JFrame frame;
	public  JTextField textField;
	public JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/*private*/ public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBackground(UIManager.getColor("InternalFrame.borderShadow"));
		frame.setBounds(100, 100, 636, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblwelcome = new JLabel("WELCOME");
		lblwelcome.setForeground(new Color(0, 0, 128));
		lblwelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblwelcome.setFont(new Font("Courier New", Font.BOLD, 60));
		lblwelcome.setBounds(160, 29, 284, 64);
		frame.getContentPane().add(lblwelcome);
		
		JLabel lblusername = new JLabel("USER NAME");
		lblusername.setFont(new Font("Cambria", Font.BOLD, 30));
		lblusername.setHorizontalAlignment(SwingConstants.LEFT);
		lblusername.setBounds(70, 142, 194, 36);
		frame.getContentPane().add(lblusername);
		
		JLabel lblpassword = new JLabel("PASSWORD");
		lblpassword.setFont(new Font("Cambria", Font.BOLD, 30));
		lblpassword.setBounds(72, 219, 192, 36);
		frame.getContentPane().add(lblpassword);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		textField.setFont(new Font("Cambria", Font.PLAIN, 20));
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(345, 142, 250, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(345, 219, 250, 36);
		frame.getContentPane().add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(57, 326, 653, -12);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 326, 737, 9);
		frame.getContentPane().add(separator_1);
		
		
		//USE 1234 AS LOGIN PASSWORD
		//USE quizzer AS THE USERNAME
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user_name= textField.getText();
				String password = passwordField.getText();
				if (user_name.isEmpty() || password.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Enter User Name And Password...");
				}
				else {
					if(user_name.equals("quizzer") && password .equals("1234")) {
						JOptionPane.showMessageDialog(null, "Login Successful...");
						homepage.main(null);//To link to the homepage
						frame.dispose();//To close the login frame after opening the homepage frame
							
					}
					else {
						JOptionPane.showMessageDialog(null, "Login Failed...");
					}
						
				}
			
			}
		});
		btnLogIn.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 20));
		btnLogIn.setBounds(10, 366, 125, 45);
		frame.getContentPane().add(btnLogIn);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				passwordField.setText(null);
				
				
			}
		});
		btnReset.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 20));
		btnReset.setBounds(247, 366, 125, 45);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 20));
		btnExit.setBounds(491, 366, 125, 45);
		frame.getContentPane().add(btnExit);
	}
}
