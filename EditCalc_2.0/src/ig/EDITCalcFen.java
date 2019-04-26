package ig;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EDITCalcFen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EDITCalcFen window = new EDITCalcFen();
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
	public EDITCalcFen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 680, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button_1 = new JButton("2");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		
		JButton button = new JButton("1");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		button.setBounds(10, 359, 89, 45);
		frame.getContentPane().add(button);
		button_1.setBounds(109, 359, 89, 45);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		button_2.setBounds(208, 359, 89, 45);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		button_3.setBounds(10, 303, 89, 45);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		button_4.setBounds(109, 303, 89, 45);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		button_5.setBounds(208, 303, 89, 45);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		button_6.setBounds(10, 247, 89, 45);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		button_7.setBounds(109, 247, 89, 45);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		button_8.setBounds(208, 247, 89, 45);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {	
			}
		});
		button_9.setBounds(317, 247, 89, 69);
		frame.getContentPane().add(button_9);
		
		JButton btnAide = new JButton("Aide");
		btnAide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnAide.setBounds(493, 11, 141, 33);
		frame.getContentPane().add(btnAide);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 396, 88);
		frame.getContentPane().add(panel);
		panel.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 110, 395, 88);
		frame.getContentPane().add(panel_1);
		
		JButton button_10 = new JButton("10");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		button_10.setBounds(317, 327, 89, 77);
		frame.getContentPane().add(button_10);
		
	}
}
