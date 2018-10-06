package com;

import java.awt.Choice;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Student extends JFrame implements ActionListener
{
	JTextField name,id,name1,name2,name3;
	JPasswordField pass;
	Container c;
	JButton enter,exit,enter1;
	JLabel luname,lpass,ltype,lid,ltitle;
	JOptionPane jp = new JOptionPane();
	Choice ctype;
	String tu,p,pe,s;
	String tp;
	int t=0,in=0;
	int it[]=new int[100];
	String ct[]=new String[100];
	
	public Student()
	{
		super("Course Enrollment             ::Glosys System::");
		c = getContentPane(); c.setBackground(new Color(24, 241, 178  ));
		c.setLayout(null); 
		setBounds(0,0,400,400);
		
		ctype = new Choice();
		ctype.add("Course");
		
		ctype.setBounds(190,80,150,20);
		c.add(ctype);
		
		ltype= new JLabel("Select Course:"); 
		ltype.setForeground(Color.black);
		ltype.setBounds(60,80,220,20);
		c.add(ltype);
		
		
		
		ltype= new JLabel("StudentID:"); 
		ltype.setForeground(Color.black);
		ltype.setBounds(80,105,80,50);
		c.add(ltype);
	    JLabel luname = new JLabel("StudentName :"); 
		luname.setForeground(Color.black);
		luname.setBounds(80,150,220,20);
		c.add(luname);
		JLabel lpass = new JLabel("MobileNo"); 
		lpass.setForeground(Color.black);
		lpass.setBounds(80,200,220,20);
		c.add(lpass);
		
		name = new JTextField(); 
		name.setForeground(Color.black);
		name.setBackground(Color.white);
		name.setBounds(190,120,150,20);
		c.add(name);
		name1 = new JTextField();
		name1.setForeground(Color.black);
		name1.setBackground(Color.white);
		name1.setBounds(190,150,150,20);
		c.add(name1);
		name2 = new JTextField();
		name2.setForeground(Color.black);
		name2.setBackground(Color.white);
		name2.setBounds(190,180,150,20);
		c.add(name2);
		name3 = new JTextField();
		name3.setForeground(Color.black);
		name3.setBackground(Color.white);
		name3.setBounds(190,180,150,20);
		c.add(name3);
		
		
		enter = new JButton("View Courses"); 
		enter.setForeground(Color.white); 
		enter.setBackground(new Color(128,0,0));
		enter.setToolTipText("Login in to Project");
		enter.setBounds(40,300,100,30);
		enter.addActionListener(this);
		c.add(enter);
		
		enter1 = new JButton("Register"); 
		enter1.setForeground(Color.white); 
		enter1.setBackground(new Color(128,0,0));
		enter1.setToolTipText("Login in to Project");
		enter1.setBounds(130,300,100,30);
		enter1.addActionListener(this);
		c.add(enter1);

		exit = new JButton("Exit"); 
		exit.setForeground(Color.white);
		exit.setBackground(new Color(128,0,0));
		exit.setBounds(240,300,100,30);
		exit.addActionListener(this);
		c.add(exit);
				
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
	}
	//c.addItemListener(new ItemListener(){
        public void itemStateChanged(ItemEvent ie)
        {
        
        }

	public void actionPerformed(ActionEvent ae)
	{	
		String str1=(String)ae.getActionCommand();
		Object source = ae.getSource();
		if(source==enter)
		{
			String s1=name1.getText();
			Connection c=null;
			 try {
		            
				    Connection cc= DriverManager.getConnection("jdbc:mysql://localhost/userlogin?useSSL=false","root","Vishnuk12");
					Statement stm = cc.createStatement();
					ResultSet rs1 = stm.executeQuery("select * from courses");
					    
					while(rs1.next())
					{	
		                ctype.add(rs1.getString("CourseName"));
						
						
				    }
					
					//rs1.executeUpdate();
					jp.showMessageDialog(this,"Updated Courses Listed","SUCCESS",jp.INFORMATION_MESSAGE);
						
		 
		        } 
		     
		        catch(SQLException sql)
				{
					jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);
				}
			 //day u1=new day();
			 //u1.n1(it,ct,in);
		}
		if(source==enter1)
		{
			String s1=name1.getText();
			Connection c=null;
			 try {
		            
				    Connection cc= DriverManager.getConnection("jdbc:mysql://localhost/userlogin?useSSL=false","root","Vishnuk12");
					Statement stm = cc.createStatement();
					//ResultSet rs1 = stm.executeQuery("select * from courses");
					String pe=ctype.getSelectedItem();
					System.out.println("The value is"+pe);
					    
					PreparedStatement ps  = cc.prepareStatement("insert into"+'\u0020'+pe+" values(?,?,?)");
					if((name.getText()).length()!=0)
					ps.setString(1,name.getText());
					else
					ps.setString(1,"");
					if((name1.getText()).length()!=0)
					ps.setString(2,name1.getText());	
					else
					ps.setString(2,"");	
					if((name2.getText()).length()!=0)
					ps.setString(3,name2.getText());
				    //else
					//ps.setString(4,"");
					ps.executeUpdate();
					jp.showMessageDialog(this,"Register Courses Successfully","SUCCESS",jp.INFORMATION_MESSAGE);
						
		 
		        } 
		     
		        catch(SQLException sql)
				{
					jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);
				}
			 
		}
		
		 if(source==exit)
	      {
		   System.exit(0);
	      }
	}

		
	public void n2()//public static void main(String arg[])
 	{
 		
		Student u=new Student();
		//u.setResizable(false);
		u.setBounds(0,0,400,400);
		u.show();
	 }
}
