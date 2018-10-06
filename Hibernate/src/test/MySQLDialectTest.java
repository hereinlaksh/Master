package test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySQLDialectTest {

	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure("resources/mysql.cfg.xml");
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
	}
	
	
}
