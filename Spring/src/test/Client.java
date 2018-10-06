package test;

import javax.annotation.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import beans.Test;
public class Client {
	
	public static void main(String arg[])
		{
		Resource r= (Resource) new ClassPathResource("C:\\Users\\vishnu\\workspace\\Spring\\src\\resources\\spring.xml");  
		BeanFactory factory = new XmlBeanFactory((org.springframework.core.io.Resource) r); 
		Object O=factory.getBean("t");  
		Test t = (Test)O;   
		t.hello();  
		}
		}



