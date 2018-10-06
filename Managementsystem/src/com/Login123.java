package com;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login123 extends JFrame implements ActionListener
{
	JTextField uname,id;
	JPasswordField pass;
	Container c;
	JButton enter,exit;
	JLabel luname,lpass,ltype,lid,ltitle;
	JOptionPane jp = new JOptionPane();
	Choice ctype;
	String tu,p,pe;
	public Login123()
	{
		super("Course Enrollment             ::Glosys System::");
		c = getContentPane(); c.setBackground(new Color(24, 241, 178  ));
		c.setLayout(null); 
		setBounds(0,0,400,400);
		
		ltype= new JLabel("User Type :"); 
		ltype.setForeground(Color.black);
		ltype.setBounds(80,100,220,20);
		c.add(ltype);
	    JLabel luname = new JLabel("User Name :"); 
		luname.setForeground(Color.black);
		luname.setBounds(80,150,220,20);
		c.add(luname);
		JLabel lpass = new JLabel("Password :"); 
		lpass.setForeground(Color.black);
		lpass.setBounds(80,200,220,20);
		c.add(lpass);
		ctype = new Choice();
		ctype.add("Admin");
		ctype.add("staff");
		ctype.add("student");
		ctype.setBounds(180,120,70,25);
		c.add(ctype);
		
		
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
			pe=ctype.getSelectedItem();
			if(pe.equals("Admin"))
			{
			String s1 = "admin";
			String s2="vishnu";
			if((s1.equals(uname.getText()))&&(s2.equals(pass.getText())))
			{
				
				this.dispose();
				Admin p1=new Admin();
				p1.n1();
				}
			else
			jp.showMessageDialog(this,"Sorry, User Name or Password is Wrong","WARRNING",jp.ERROR_MESSAGE);
			}
			
			pe=ctype.getSelectedItem();
			if(pe.equals("staff"))
			{
			String s1 = "staff";
			String s2="vishnu";
			if((s1.equals(uname.getText()))&&(s2.equals(pass.getText())))
			{
				
				this.dispose();
				Staff p2=new Staff();
				p2.n2();
				}
			else
			jp.showMessageDialog(this,"Sorry, User Name or Password is Wrong","WARRNING",jp.ERROR_MESSAGE);
			}
			pe=ctype.getSelectedItem();
			if(pe.equals("student"))
			{
				String s1 = "student";
				String s2="vishnu";
				if((s1.equals(uname.getText()))&&(s2.equals(pass.getText())))
				{
					
					this.dispose();
					Student p1=new Student();
					p1.n2();
					}
				else
				jp.showMessageDialog(this,"Sorry, User Name or Password is Wrong","WARRNING",jp.ERROR_MESSAGE);
				}
				
				
				}
		       if(source==exit)
		      {
			   System.exit(0);
		      }
		     }

		
	public static void main(String arg[])
 	{
 		
		 Login123 u=new Login123();
		//u.setResizable(false);
		u.setBounds(0,0,450,450);
		u.show();
	 }
}
