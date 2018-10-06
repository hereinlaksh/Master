
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.zip.*;
public class Home extends JFrame implements ActionListener
{
	
	JMenuBar menuBar;
	JMenu st,bill,rep,oth;
	JOptionPane jp = new JOptionPane();
	JMenuItem adi,ade,edi,ede,gbil,cbil,bpay,days,bals,dds,nils,empa,cp,per,emae;
	Container c;
	String pe;
	public void nn()
	{
		//super("Billing Projects             ::SRI VALLI INDUSTRIES::");
		c = getContentPane(); 
		c.setBackground(new Color(255,179,179));
		c.setLayout(null); 
		setBounds(0,0,850,590);
		
		JLabel ltitle = new JLabel("WELCOME TO SRI VALLI INDUSTRIES"); 
		ltitle.setForeground(Color.blue);
		ltitle.setBounds(200,150,250,30);
		c.add(ltitle);
		
		menuBar = new JMenuBar(); 	
		st = new JMenu("Stock");
		st.setBackground(Color.white);
		st.setMnemonic('S');	
		bill = new JMenu("Bill");	
		bill.setBackground(Color.white);
		bill.setMnemonic('B');
		rep = new JMenu("Reports"); 	
		rep.setMnemonic('R');	
		rep.setBackground(Color.white);
		oth = new JMenu("Other"); 	
		oth.setMnemonic('O');	
		oth.setBackground(Color.white);
			adi = new JMenuItem("Add Item"); 
			adi.setBackground(Color.white);
			adi.setMnemonic('A');
			adi.addActionListener(this);
			st.add(adi);
			edi = new JMenuItem("Edit Item"); 
			edi.setBackground(Color.white);
			edi.setMnemonic('E');
			edi.addActionListener(this);
			st.add(edi);
			
			gbil = new JMenuItem("Generate Bill"); 
			gbil.setBackground(Color.white);
			gbil.setMnemonic('G');
			gbil.addActionListener(this);
			bill.add(gbil);
			cbil = new JMenuItem("Cancel Bill"); 
			cbil.setBackground(Color.white);
			cbil.setMnemonic('C');
			cbil.addActionListener(this);
			bill.add(cbil);
			bpay = new JMenuItem("Bill Payment"); 
			bpay.setBackground(Color.white);
			bpay.setMnemonic('B');
			bpay.addActionListener(this);
			bill.add(bpay);
			days = new JMenuItem("Day Wise Sale"); 
			days.setBackground(Color.white);
			days.setMnemonic('D');
			days.addActionListener(this);
			rep.add(days);
			bals = new JMenuItem("Balence Stock"); 
			bals.setBackground(Color.white);
			bals.setMnemonic('B');
			bals.addActionListener(this);
			rep.add(bals);
			dds = new JMenuItem("Day To Day Sale"); 
			dds.setBackground(Color.white);
			dds.setMnemonic('T');
			dds.addActionListener(this);
			rep.add(dds);
			nils = new JMenuItem("Nil Stock"); 
			nils.setBackground(Color.white);
			nils.setMnemonic('N');
			nils.addActionListener(this);
			rep.add(nils);
	    setJMenuBar(menuBar);
		menuBar.add(st);
		menuBar.add(bill);
		menuBar.add(rep);
		menuBar.add(oth);
		c.add(menuBar);
		//}
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		String str1=(String)ae.getActionCommand();
		Object source = ae.getSource();
		
		if(source==adi)
		{
			this.dispose();
			aitem u1=new aitem();
			u1.n1();
		}
		if(source==edi)
		{
			this.dispose();
			eitem u2=new eitem();
			u2.n2();
		}
		if(source==gbil)
		{	this.dispose();
			gen u5=new gen();
			u5.n5();
			
 		}
		
	}
}
	