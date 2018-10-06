
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.zip.*;
public class Login extends JFrame implements ActionListener
{
	JTextField uname,id;
	JPasswordField pass;
	Container c;
	JButton enter,exit;
	JLabel luname,lpass,ltype,lid,ltitle;
	JOptionPane jp = new JOptionPane();
	Choice ctype;
	String tu,p,pe;
	public Login()
	{
		super("Billing Project               ::SRI VALLI INDUSTRIES::");
		c = getContentPane(); c.setBackground(new Color(24, 241, 178  ));
		c.setLayout(null); 
		setBounds(0,0,400,400);
	    
		JLabel ltitle = new JLabel("SRI VALLI INDUSTRIES"); 
		ltitle.setForeground(Color.blue);
		ltitle.setBounds(150,80,300,50);
		c.add(ltitle);
		
		
		JLabel luname = new JLabel("User Name :"); 
		luname.setForeground(Color.black);
		luname.setBounds(80,150,220,20);
		c.add(luname);
		JLabel lpass = new JLabel("Password :"); 
		lpass.setForeground(Color.black);
		lpass.setBounds(80,200,220,20);
		c.add(lpass);
		
		
		uname = new JTextField();
		uname.setForeground(Color.black); 
		uname.setBackground(Color.white);
		uname.setBounds(160,150,180,25);
		c.add(uname);
		pass = new JPasswordField();
		pass.setForeground(Color.black); 
		pass.setBackground(Color.white);
		pass.setBounds(160,200,180,25);
		c.add(pass);
		
		enter = new JButton("Enter"); 
		enter.setForeground(Color.white); 
		enter.setBackground(new Color(128,0,0));
		enter.setToolTipText("Login in to Project");
		enter.setBounds(130,300,100,30);
		enter.addActionListener(this);
		c.add(enter);

		exit = new JButton("Exit"); 
		exit.setForeground(Color.white);
		exit.setBackground(new Color(128,0,0));
		exit.setBounds(240,300,100,30);
		exit.addActionListener(this);
		c.add(exit);
				
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
	}

	public void actionPerformed(ActionEvent ae)
	{	
		String str1=(String)ae.getActionCommand();
		Object source = ae.getSource();
		if(source==enter)
		{
			String s1="lakshman";
			String s2="vishnu";
			if((s1.equals(uname.getText()))&&(s2.equals(pass.getText())))
			{
				
				this.dispose();
				Home p1=new Home();
				p1.nn();
			
			}
			else
			jp.showMessageDialog(this,"Sorry, User Name or Password is Wrong","WARRNING",jp.ERROR_MESSAGE);
			}
			
		if(source==exit)
		{
			System.exit(0);
		}
	}	
	public static void main(String arg[])
 	{
 		
		 Login u=new Login();
		//u.setResizable(false);
		u.setBounds(0,0,450,450);
		u.show();
	 }
}
