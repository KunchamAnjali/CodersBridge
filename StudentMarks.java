package codersBridge;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentMarks {

	private JFrame frame;
	private JTextField txtnum1;
	private JTextField txtnum2;
	private JTextField txtnum3;
	private JTextField txttot;
	private JTextField txtavg;
	private JTextField txtgrade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarks window = new StudentMarks();
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
	public StudentMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 828, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), null, null, null));
		panel.setBounds(10, 10, 728, 426);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtnum1 = new JTextField();
		txtnum1.setBounds(401, 88, 175, 32);
		panel.add(txtnum1);
		txtnum1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Marks 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(290, 93, 57, 17);
		panel.add(lblNewLabel);
		
		JLabel lblMarks = new JLabel("Marks 2");
		lblMarks.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarks.setBounds(290, 139, 69, 23);
		panel.add(lblMarks);
		
		JLabel lblMarks_1 = new JLabel("Marks 3");
		lblMarks_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarks_1.setBounds(290, 187, 69, 23);
		panel.add(lblMarks_1);
		
		txtnum2 = new JTextField();
		txtnum2.setColumns(10);
		txtnum2.setBounds(401, 137, 175, 32);
		panel.add(txtnum2);
		
		txtnum3 = new JTextField();
		txtnum3.setColumns(10);
		txtnum3.setBounds(401, 185, 175, 32);
		panel.add(txtnum3);
		
		txttot = new JTextField();
		txttot.setColumns(10);
		txttot.setBounds(401, 244, 175, 32);
		panel.add(txttot);
		
		txtavg = new JTextField();
		txtavg.setColumns(10);
		txtavg.setBounds(401, 302, 175, 32);
		panel.add(txtavg);
		
		txtgrade = new JTextField();
		txtgrade.setColumns(10);
		txtgrade.setBounds(401, 365, 175, 32);
		panel.add(txtgrade);
		
		JLabel lblMarks_1_1 = new JLabel("Total");
		lblMarks_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarks_1_1.setBounds(290, 246, 69, 23);
		panel.add(lblMarks_1_1);
		
		JLabel lblMarks_1_2 = new JLabel("Average");
		lblMarks_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarks_1_2.setBounds(290, 304, 69, 23);
		panel.add(lblMarks_1_2);
		
		JLabel lblMarks_1_3 = new JLabel("Grade");
		lblMarks_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarks_1_3.setBounds(290, 351, 69, 23);
		panel.add(lblMarks_1_3);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int m1=Integer.parseInt(txtnum1.getText());
				int m2=Integer.parseInt(txtnum2.getText());
				int m3=Integer.parseInt(txtnum3.getText());
				int tot=m1+m2+m3;
				
				double avg=tot/3;
				
				txttot.setText(String.valueOf(tot));
				txtavg.setText(String.valueOf(avg));
				
				if(avg>50) {
					txtgrade.setText("Pass");
				}
				else {
					txtgrade.setText("Fail");
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(616, 97, 91, 42);
		panel.add(btnNewButton);
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtnum1.setText(" ");
				txtnum2.setText(" ");
				txtnum3.setText(" ");
				txttot.setText(" ");
				txtavg.setText(" ");
				txtgrade.setText(" ");
				txtnum1.requestFocus();
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBounds(616, 185, 91, 42);
		panel.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(616, 275, 91, 42);
		panel.add(btnExit);
		
		JLabel lblNewLabel_1 = new JLabel("Student Grade Calculator");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(292, 36, 313, 42);
		panel.add(lblNewLabel_1);
	}
}
