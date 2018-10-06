package com;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.jdbc.ResultSetMetaData;

public class Admin extends JFrame implements ActionListener
{
	JTextField name,id,name1,name2;
	JPasswordField pass;
	Container c;
	JButton enter,exit,enter1;
	JLabel luname,lpass,ltype,lid,ltitle;
	JOptionPane jp = new JOptionPane();
	Choice ctype;
	String tu,p,pe;
	public Admin()
	{
		super("Course Enrollment             ::Glosys System::");
		c = getContentPane(); c.setBackground(new Color(24, 241, 178  ));
		c.setLayout(null); 
		setBounds(0,0,400,400);
		
		ltype= new JLabel("CourseID:"); 
		ltype.setForeground(Color.black);
		ltype.setBounds(80,100,220,20);
		c.add(ltype);
	    JLabel luname = new JLabel("CourseName :"); 
		luname.setForeground(Color.black);
		luname.setBounds(80,150,220,20);
		c.add(luname);
		JLabel lpass = new JLabel("FacultyName:"); 
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
		
		
		enter = new JButton("Register"); 
		enter.setForeground(Color.white); 
		enter.setBackground(new Color(128,0,0));
		enter.setToolTipText("Login in to Project");
		enter.setBounds(130,300,100,30);
		enter.addActionListener(this);
		c.add(enter);
		
		enter1 = new JButton("FacultyDetails"); 
		enter1.setForeground(Color.white); 
		enter1.setBackground(new Color(128,0,0));
		enter1.setToolTipText("Login in to Project");
		enter1.setBounds(10,300,100,30);
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
		            String sql = "create table"+'\u0020'+s1+"(Name varchar(25),Stuname varchar(25),Mobileno varchar(25))";
		            stm.executeUpdate(sql);
		            //System.out.println("CreateTable sucessfully");
		            
		            PreparedStatement ps  = cc.prepareStatement("insert into courses values(?,?,?)");
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
					jp.showMessageDialog(this,"Record Inserted Successfully","SUCCESS",jp.INFORMATION_MESSAGE);
						
		 
		        } 
			    catch(SQLException sql)
							{
								jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);
							}
					}
		     if(source==enter1)
				{
					//String s1=name1.getText();
				   //Connection c=null;
					 try {
				            
						    Connection cc= DriverManager.getConnection("jdbc:mysql://localhost/userlogin?useSSL=false","root","Vishnuk12");
							Statement stm = cc.createStatement();
							ResultSet rs = stm.executeQuery("select * from Courses");
							
							  System.out.println("id  name    course");
						         
						         while (rs.next()) {
						            int id = rs.getInt("CourseID");
						            String name = rs.getString("CourseName");
						            String course = rs.getString("FacultyName");
						            System.out.println(id+"   "+name+"    "+course);
						         }
							
							
							jp.showMessageDialog(this,"Please find details","SUCCESS",jp.INFORMATION_MESSAGE);
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

	public void n1()//public static void main(String arg[])
 	{
 		
		Admin u=new Admin();
		//u.setResizable(false);
		u.setBounds(0,0,400,400);
		u.show();
	 }
}