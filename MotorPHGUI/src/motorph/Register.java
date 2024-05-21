package motorph;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Panel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JToggleButton;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Register() {
		setTitle("MotorPH");
		setResizable(false);
		JFrame frame= new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 224));
		panel.setBounds(0, 0, 784, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		ImageIcon imageIcon= new ImageIcon("motorph.png");
		Image image = imageIcon.getImage(); // Transform ImageIcon to Image
        Image newImage = image.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH); // Scale the image
        imageIcon = new ImageIcon(newImage);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        panel_1.setBounds(249, 73, 286, 325);
        panel.add(panel_1);
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(23, 74, 242, 29);
        panel_1.add(textField);
        textField.setColumns(10);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(23, 128, 242, 29);
        panel_1.add(passwordField);
        
        JLabel lblNewLabel_1 = new JLabel("Set Username");
        lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 11));
        lblNewLabel_1.setBounds(23, 56, 80, 14);
        panel_1.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Set Password");
        lblNewLabel_1_1.setFont(new Font("SansSerif", Font.PLAIN, 11));
        lblNewLabel_1_1.setBounds(23, 114, 80, 14);
        panel_1.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_2 = new JLabel("Register");
        lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblNewLabel_2.setBounds(110, 25, 66, 20);
        panel_1.add(lblNewLabel_2);
        
        JToggleButton btnRegister = new JToggleButton("Register");
        btnRegister.setFont(new Font("SansSerif", Font.PLAIN, 11));
        btnRegister.setBounds(88, 229, 106, 29);
        panel_1.add(btnRegister);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Set Password");
        lblNewLabel_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 11));
        lblNewLabel_1_1_1.setBounds(23, 168, 80, 14);
        panel_1.add(lblNewLabel_1_1_1);
        
        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(23, 182, 242, 29);
        panel_1.add(passwordField_1);
        
        JToggleButton tglbtnBackToLogin = new JToggleButton("Back to Login");
        tglbtnBackToLogin.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Portal portal= new Portal();
        		portal.setVisible(true);
        	}
        });
        tglbtnBackToLogin.setFont(new Font("SansSerif", Font.PLAIN, 11));
        tglbtnBackToLogin.setBounds(88, 269, 106, 29);
        panel_1.add(tglbtnBackToLogin);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(0, 0, 784, 461);
        panel.add(lblNewLabel);
        lblNewLabel.setIcon(imageIcon);
		
		
		
	}
}
