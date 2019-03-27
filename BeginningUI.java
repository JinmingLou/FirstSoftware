package ui;

import java.awt.*;
import javax.swing.*;

public class BeginningUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel welcomeLabel;
	private JLabel userChooseLabel;
	private JButton libraryButton;
	private JButton labButton;
	private JButton shopButton;
	private JButton registerButton;
	private JLabel registerLabel;
	private JLabel administorLabel;
	private JButton adEnterButton;
	private JButton emailButton;
	
	public BeginningUI() {
		this.setTitle("coursework"); 
		this.setSize(1200, 940);  
    	this.setLocation(500, 200);  
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setLayout(null);
    	this.setVisible(true);
    	
    	welcomeLabel = new JLabel("Welcome to the Scooter Sharing System!");
    	welcomeLabel.setFont(new Font("Times New Roman",Font.BOLD, 50));
    	this.add(welcomeLabel);
    	welcomeLabel.setBounds(90, 60, 1000, 80);
    	
    	userChooseLabel = new JLabel("If you are a user/worker:");
    	userChooseLabel.setFont(new Font("Times New Roman",Font.BOLD, 50));
    	this.add(userChooseLabel);
    	userChooseLabel.setBounds(90, 170, 1000, 80);
    	
    	libraryButton = new JButton("Library");
    	libraryButton.setFont(new Font("Arial",Font.BOLD, 36));
    	this.add(libraryButton);
    	libraryButton.setBounds(90, 280, 250, 80);
    	
    	labButton = new JButton("Laboratory");
    	labButton.setFont(new Font("Arial",Font.BOLD, 36));
    	this.add(labButton);
    	labButton.setBounds(410, 280, 250, 80);
    	
    	shopButton = new JButton("Shop");
    	shopButton.setFont(new Font("Arial",Font.BOLD, 36));
    	this.add(shopButton);
    	shopButton.setBounds(740, 280, 250, 80);
    	
    	registerButton = new JButton("Register Now!");
    	registerButton.setFont(new Font("Cambria",Font.BOLD, 34));
    	this.add(registerButton);
    	registerButton.setBounds(90, 420, 300, 80);
    	
    	registerLabel = new JLabel("If you don't have an account.");
    	registerLabel.setFont(new Font("Times New Roman",Font.BOLD, 40));
    	this.add(registerLabel);
    	registerLabel.setBounds(420, 420, 600, 80);
    	
    	administorLabel = new JLabel("If you are an administor:");
    	administorLabel.setFont(new Font("Times New Roman",Font.BOLD, 50));
    	this.add(administorLabel);
    	administorLabel.setBounds(90, 540, 1000, 80);
    	
    	adEnterButton = new JButton("Click here to Enter!");
    	adEnterButton.setFont(new Font("Cambria",Font.BOLD, 34));
    	this.add(adEnterButton);
    	adEnterButton.setBounds(90, 660, 400, 80);
    	
    	emailButton = new JButton("Send E-mail");
    	emailButton.setFont(new Font("Cambria",Font.BOLD, 34));
    	this.add(emailButton);
    	emailButton.setBounds(590, 660, 400, 80);
	}	
	
	public static void main(String args[]) {
		new BeginningUI();
	}
}
