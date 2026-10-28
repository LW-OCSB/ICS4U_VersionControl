package sandbox;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class GUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/** 
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 712, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIcsuVersionControl = new JLabel("ICS4U Version Control");
		lblIcsuVersionControl.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIcsuVersionControl.setBounds(243, 36, 234, 33);
		frame.getContentPane().add(lblIcsuVersionControl);
		
		JButton buttonEight = new JButton("Anushka");
		buttonEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonEight(textField);
			}
		});
		buttonEight.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonEight.setBounds(169, 131, 89, 23);
		frame.getContentPane().add(buttonEight);
		
		JButton buttonNine = new JButton("Albert");
		buttonNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonNine(textField);
			}
		});
		buttonNine.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonNine.setBounds(169, 192, 89, 23);
		frame.getContentPane().add(buttonNine);
		
		JButton buttonFour = new JButton(" ");
		buttonFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonFour(textField);
			}
		});
		buttonFour.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonFour.setBounds(70, 192, 89, 23);
		frame.getContentPane().add(buttonFour);
		
		JButton buttonThree = new JButton(" ");
		buttonThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonThree(textField);
			}
		});
		buttonThree.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonThree.setBounds(70, 226, 89, 23);
		frame.getContentPane().add(buttonThree);
		
		JButton buttonTen = new JButton("Ryan");
		buttonTen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonTen(textField);
			}
		});
		buttonTen.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonTen.setBounds(169, 226, 89, 23);
		frame.getContentPane().add(buttonTen);
		
		JButton buttonTwo = new JButton("");
		buttonTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonTwo(textField);
			}
		});
		buttonTwo.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonTwo.setBounds(70, 289, 89, 23);
		frame.getContentPane().add(buttonTwo);
		
		JButton sofiaEleven = new JButton("");
		sofiaEleven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonEleven(textField);
			}
		});
		sofiaEleven.setFont(new Font("Tahoma", Font.BOLD, 11));
		sofiaEleven.setBounds(169, 289, 89, 23);
		frame.getContentPane().add(sofiaEleven);
		
		JButton buttonOne = new JButton("");
		buttonOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonOne(textField);
			}
		});
		buttonOne.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonOne.setBounds(70, 323, 89, 23);
		frame.getContentPane().add(buttonOne);
		
		JButton buttonTwelve = new JButton("Liam");
		buttonTwelve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonTwelve(textField);
			}
		});
		buttonTwelve.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonTwelve.setBounds(169, 323, 89, 23);
		frame.getContentPane().add(buttonTwelve);
		
		JButton buttonEighteen = new JButton("");
		buttonEighteen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonEighteen(textField);
			}
		});
		buttonEighteen.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonEighteen.setBounds(318, 97, 89, 23);
		frame.getContentPane().add(buttonEighteen);
		
		JButton buttonNineteen = new JButton("");
		buttonNineteen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonNineteen(textField);
			}
		});
		buttonNineteen.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonNineteen.setBounds(417, 97, 89, 23);
		frame.getContentPane().add(buttonNineteen);
		
		JButton buttonSeventeen = new JButton("");
		buttonSeventeen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonSeventeen(textField);
			}
		});
		buttonSeventeen.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonSeventeen.setBounds(318, 131, 89, 23);
		frame.getContentPane().add(buttonSeventeen);
		
		JButton buttonTwenty = new JButton("");
		buttonTwenty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonTwenty(textField);
			}
		});
		buttonTwenty.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonTwenty.setBounds(417, 131, 89, 23);
		frame.getContentPane().add(buttonTwenty);
		
		JButton buttonSixteen = new JButton("");
		buttonSixteen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonSixteen(textField);
			}
		});
		buttonSixteen.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonSixteen.setBounds(318, 192, 89, 23);
		frame.getContentPane().add(buttonSixteen);
		
		JButton buttonTwentyOne = new JButton("Adam");
		buttonTwentyOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonTwentyOne(textField);
			}
		});
		buttonTwentyOne.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonTwentyOne.setBounds(417, 192, 89, 23);
		frame.getContentPane().add(buttonTwentyOne);
		
		JButton buttonFifteen = new JButton("");
		buttonFifteen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonFifteen(textField);
			}
		});
		buttonFifteen.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonFifteen.setBounds(318, 226, 89, 23);
		frame.getContentPane().add(buttonFifteen);
		
		JButton buttonTwentyTwo = new JButton("Humam");
		buttonTwentyTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonTwentyTwo(textField);
			}
		});
		buttonTwentyTwo.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonTwentyTwo.setBounds(417, 226, 89, 23);
		frame.getContentPane().add(buttonTwentyTwo);
		
		JButton buttonFourteen = new JButton("");
		buttonFourteen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonFourteen(textField);
			}
		});
		buttonFourteen.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonFourteen.setBounds(318, 289, 89, 23);
		frame.getContentPane().add(buttonFourteen);
		
		JButton buttonTwentyThree = new JButton("");
		buttonTwentyThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonTwentyThree(textField);
			}
		});
		buttonTwentyThree.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonTwentyThree.setBounds(417, 289, 89, 23);
		frame.getContentPane().add(buttonTwentyThree);
		
		JButton buttonThirteen = new JButton("Alec");
		buttonThirteen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonThirteen(textField);
			}
		});
		buttonThirteen.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonThirteen.setBounds(318, 323, 89, 23);
		frame.getContentPane().add(buttonThirteen);
		
		JButton buttonTwentyFour = new JButton("David");
		buttonTwentyFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonTwentyFour(textField);
			}
		});
		buttonTwentyFour.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonTwentyFour.setBounds(417, 323, 89, 23);
		frame.getContentPane().add(buttonTwentyFour);
		
		textField = new JTextField();
		textField.setBounds(70, 376, 235, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Message");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(146, 420, 81, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JButton buttonTwentySeven = new JButton("Mr. Wong");
		buttonTwentySeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Methods.buttonTwentySeven(textField);
			}
		});
		buttonTwentySeven.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonTwentySeven.setBounds(368, 422, 89, 23);
		frame.getContentPane().add(buttonTwentySeven);
		
		JButton clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		clearButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		clearButton.setBounds(131, 451, 89, 23);
		frame.getContentPane().add(clearButton);
		
		JButton buttonSeven = new JButton("Samantha");
		buttonSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Methods.buttonSeven(textField);
			}
		});
		buttonSeven.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonSeven.setBounds(169, 97, 89, 23);
		frame.getContentPane().add(buttonSeven);
		
		JButton buttonSix = new JButton("Aadhya");
		buttonSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Methods.buttonSix(textField);
			}
		});
		buttonSix.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonSix.setBounds(70, 97, 89, 23);
		frame.getContentPane().add(buttonSix);
		
		JButton buttonFive = new JButton("Antonia");
		buttonFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonFive.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonFive.setBounds(70, 131, 89, 23);
		frame.getContentPane().add(buttonFive);
		
		JButton buttonTwentyFive = new JButton("");
		buttonTwentyFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonTwentyFive(textField);
			}
		});
		buttonTwentyFive.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonTwentyFive.setBounds(568, 289, 89, 23);
		frame.getContentPane().add(buttonTwentyFive);
		
		JButton buttonTwentySix = new JButton("");
		buttonTwentySix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Methods.buttonTwentySix(textField);
			}
		});
		buttonTwentySix.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonTwentySix.setBounds(568, 226, 89, 23);
		frame.getContentPane().add(buttonTwentySix);

	}
}