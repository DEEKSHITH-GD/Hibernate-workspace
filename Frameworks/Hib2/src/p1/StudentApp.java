package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class StudentApp 
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setName("Salman");
		s1.setRoll("5");
		HibernateManager hm = new HibernateManager();
		hm.saveObj(s1);
		hm.readAll();
	}
}
