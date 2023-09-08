package inv.pro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.BorderLayout;

public class Home extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup home_btn_groups = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setExtendedState(Home.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 107, 214, 409);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Customer");
		home_btn_groups.add(tglbtnNewToggleButton);
		tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		tglbtnNewToggleButton.setBounds(25, 10, 156, 38);
		panel.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Suppiler");
		home_btn_groups.add(tglbtnNewToggleButton_1);
		tglbtnNewToggleButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		tglbtnNewToggleButton_1.setBounds(25, 58, 156, 38);
		panel.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("Product");
		home_btn_groups.add(tglbtnNewToggleButton_2);
		tglbtnNewToggleButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		tglbtnNewToggleButton_2.setBounds(25, 154, 156, 38);
		panel.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("Employee");
		home_btn_groups.add(tglbtnNewToggleButton_3);
		tglbtnNewToggleButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		tglbtnNewToggleButton_3.setBounds(25, 106, 156, 38);
		panel.add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("Invoice");
		home_btn_groups.add(tglbtnNewToggleButton_4);
		tglbtnNewToggleButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		tglbtnNewToggleButton_4.setBounds(25, 202, 156, 38);
		panel.add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("Reports");
		home_btn_groups.add(tglbtnNewToggleButton_5);
		tglbtnNewToggleButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		tglbtnNewToggleButton_5.setBounds(25, 298, 156, 38);
		panel.add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_2_2 = new JToggleButton("Customers");
		home_btn_groups.add(tglbtnNewToggleButton_2_2);
		tglbtnNewToggleButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		tglbtnNewToggleButton_2_2.setBounds(25, 346, 156, 38);
		panel.add(tglbtnNewToggleButton_2_2);
		
		JToggleButton tglbtnNewToggleButton_2_1 = new JToggleButton("Sales");
		home_btn_groups.add(tglbtnNewToggleButton_2_1);
		tglbtnNewToggleButton_2_1.setBounds(25, 250, 156, 38);
		panel.add(tglbtnNewToggleButton_2_1);
		tglbtnNewToggleButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(245, 107, 965, 401);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(10, 10, 1200, 86);
		contentPane.add(panel_2);
		
	}
}
