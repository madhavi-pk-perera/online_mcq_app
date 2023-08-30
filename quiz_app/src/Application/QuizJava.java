package Application;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import login.homepage;

public class QuizJava implements ActionListener{
	String[] questions = {
			"1. Which component is used to compile, debug and execute the java programs?",
			"2. Which one of the following is not a Java feature?",
			"3. What is the extension of java code files?",
			"4. Which of the following is not an OOPS concept in Java?",
			"5. Which exception is thrown when java is out of memory?",
			"6. Which of these are selection statements in Java?",
			"7. Which of these keywords is used to define interfaces in Java?",
			"8. Which of the following is a superclass of every class in Java?",
			"9. Which one of the following is not an access modifier?",
			"10. How many types of datatypes in Java?"
	};
	String[] [] options = {
							{"JRE"," JIT"," JDK"," JVM"},
							{"Object-oriented","Use of pointers","Portable","Dynamic and Extensible"},
							{" .js",".txt",".class",".java"},
							{"Polymorphism"," Inheritance"," Compilation","Encapsulation"},
							{"MemoryError","OutOfMemoryError","MemoryOutOfBoundsException","MemoryFullException"},
							{"break","continue","for()"," if()"},
							{" intf"," Intf"," interface"," Interface"},
							{"ArrayList","Abstract class","Object class","String"},
							{"Protected","Void"," Public","Private"},
							{"One","Two","Three","Four"},
														
	};
	
	char[] answers = {
						'c',
						'b',
						'd',
						'c',
						'b',
						'd',
						'c',
						'c',
						'b',
						'b',
						
	};
	
	char guess;
	char answer;
	int index;
	int correct_guesses =0;
	int total_questions = questions.length;
	int result;
	int seconds = 10;
	
	
	JFrame frame = new JFrame();
	JTextField textField = new JTextField ();
	JTextArea textarea = new JTextArea();
	
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JButton btnNewButton = new JButton("END");
	
	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	
	JTextField number_right = new JTextField ();
	JTextField percentage = new JTextField ();
	

	Timer timer= new Timer(1000,new ActionListener() {
		
	
		
		@Override
	
		public void actionPerformed(ActionEvent e) {
			
			seconds--;
			seconds_left.setText(String.valueOf(seconds));
			if(seconds<=0) {
				displayAnswer();
			}
			
			
			
		}
		
	});
	
	
	
	
	public QuizJava() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(848, 650);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		textField.setBounds(0,0,834,72);
		textField.setBackground(new Color (25,25,25));
		textField.setBackground(new Color (163,237,165));
		textField.setFont(new Font("Candara Light", Font.BOLD, 30));
		textField.setBorder(BorderFactory.createBevelBorder(1));
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setEditable(false);
		
		textarea.setBounds(0,69,834,133);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color (25,25,25));
		textarea.setBackground(new Color (163,237,165));
		textarea.setFont(new Font("Gabriola", Font.BOLD, 35));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
		buttonA.setBounds(0,202,100,100);
		buttonA.setFont(new Font ("Ink Free", Font.BOLD,35));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("a");
		
		buttonB.setBounds(0,303,100,100);
		buttonB.setFont(new Font ("Ink Free", Font.BOLD,35));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("b");
		
		buttonC.setBounds(0,403,100,100);
		buttonC.setFont(new Font ("Ink Free", Font.BOLD,35));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("c");
		
		buttonD.setBounds(0,503,100,100);
		buttonD.setFont(new Font ("Ink Free", Font.BOLD,35));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("d");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				End.main(null);
				frame.dispose();
			}
		});
		
		
		btnNewButton.setBounds(681, 366, 130, 33);
		//btnNewButton.setEnabled(false);
		btnNewButton.setEnabled(false);
		frame.setVisible(true);
		
		answer_labelA.setBounds(125, 202, 500, 100);
		answer_labelA.setBackground(new Color (50,50,50));
		answer_labelA.setForeground(new Color (163,237,165));
		answer_labelA.setFont(new Font ("MV Boli", Font.PLAIN,35));
		
		answer_labelB.setBounds(125, 303, 500, 100);
		answer_labelB.setBackground(new Color (50,50,50));
		answer_labelB.setForeground(new Color (163,237,165));
		answer_labelB.setFont(new Font ("MV Boli", Font.PLAIN,35));
		
		answer_labelC.setBounds(125, 403, 500, 100);
		answer_labelC.setBackground(new Color (50,50,50));
		answer_labelC.setForeground(new Color (163,237,165));
		answer_labelC.setFont(new Font ("MV Boli", Font.PLAIN,35));
		
		answer_labelD.setBounds(125, 503, 500, 100);
		answer_labelD.setBackground(new Color (50,50,50));
		answer_labelD.setForeground(new Color (163,237,165));
		answer_labelD.setFont(new Font ("MV Boli", Font.PLAIN,35));
		
		seconds_left.setBounds(724, 503, 100, 100);
		seconds_left.setBackground(new Color (25,25,25));
		seconds_left.setForeground(new Color (255,0,0));
		seconds_left.setFont(new Font ("MV Boli", Font.BOLD,60));
		seconds_left.setBorder(BorderFactory.createBevelBorder(1));
		seconds_left.setOpaque(true);
		seconds_left.setHorizontalAlignment(JTextField.CENTER);
		seconds_left.setText("10");
		
		time_label.setBounds(724, 468, 100, 25);
		time_label.setBackground(new Color (50,50,50));
		time_label.setForeground(new Color (255,0,0));
		time_label.setFont(new Font ("MV Boli", Font.PLAIN,16));
		time_label.setHorizontalAlignment(JTextField.CENTER);
		time_label.setText("timer ");
		
		number_right.setBounds(225, 225, 200, 100);
		number_right.setBackground(new Color (25,25,25));
		number_right.setForeground(new Color (163,237,165));
		number_right.setFont(new Font ("Ink Free", Font.BOLD,50));
		number_right.setBorder(BorderFactory.createBevelBorder(1));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		
		percentage.setBounds(225, 325, 200, 100);
		percentage.setBackground(new Color (25,25,25));
		percentage.setForeground(new Color (163,237,165));
		percentage.setFont(new Font ("Ink Free", Font.BOLD,50));
		percentage.setBorder(BorderFactory.createBevelBorder(1));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		
		frame.getContentPane().add(time_label);
		frame.getContentPane().add(seconds_left);
		frame.getContentPane().add(answer_labelA);
		frame.getContentPane().add(answer_labelB);
		frame.getContentPane().add(answer_labelC);
		frame.getContentPane().add(answer_labelD);
		frame.getContentPane().add(buttonA);
		frame.getContentPane().add(buttonB);
		frame.getContentPane().add(buttonC);
		frame.getContentPane().add(buttonD);
		frame.getContentPane().add(textarea);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		nextQuestion();
		
		
	}
	public void nextQuestion() {
		if(index>=total_questions) {
			results();
		}
		
		else {
			textField.setText("Question :"+(index+1));
			textarea.setText(questions[index]);
			answer_labelA.setText(options[index][0]);
			answer_labelB.setText(options[index][1]);
			answer_labelC.setText(options[index][2]);
			answer_labelD.setText(options[index][3]);
			
			timer.start();
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		
		if(e.getSource()==buttonA) {
			answer='a';
			if(answer== answers[index]) {
				correct_guesses++;
			}
		}
		
		if(e.getSource()==buttonB) {
			answer='b';
			if(answer== answers[index]) {
				correct_guesses++;
			}
		}
		
		if(e.getSource()==buttonC) {
			answer='c';
			if(answer== answers[index]) {
				correct_guesses++;
			}
		}
		
		if(e.getSource()==buttonD) {
			answer='d';
			if(answer== answers[index]) {
				correct_guesses++;
			}
		}
		
		displayAnswer();
		
		
		
	}
	
	
	public void displayAnswer() {
		
		 timer.stop();
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		
		if (answers[index]!='a') 
			answer_labelA.setForeground(new Color(255,0,0));
		if (answers[index]!='b') 
			answer_labelB.setForeground(new Color(255,0,0));
		if (answers[index]!='c') 
			answer_labelC.setForeground(new Color(255,0,0));
		if (answers[index]!='d') 
			answer_labelD.setForeground(new Color(255,0,0));
		
		Timer pause= new Timer(1000,new ActionListener() {
			
		
			
			@Override
		
			public void actionPerformed(ActionEvent e) {
				
				answer_labelA.setForeground(new Color (163,237,165));
				answer_labelB.setForeground(new Color (163,237,165));
				answer_labelC.setForeground(new Color (163,237,165));
				answer_labelD.setForeground(new Color (163,237,165));
				
				answer=' ';
				seconds=10;
				seconds_left.setText(String.valueOf(seconds));
				
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextQuestion();
				
			}
			
		});
		
		pause.setRepeats(false);
		pause.start();
		
			
		
		
	}
	
	
	public void results() {
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		btnNewButton.setEnabled(true);
		
		
		
		result= (int)((correct_guesses/(double)total_questions)*100);
		
		
		
		textField.setText("You finished the quiz...!");
		textarea.setText("");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");
		
		number_right.setText("("+correct_guesses+"/"+total_questions+")");
		percentage.setText(result+"%");
		
		frame.getContentPane().add(number_right);
		frame.getContentPane().add(percentage);
		
		
	}
	}


