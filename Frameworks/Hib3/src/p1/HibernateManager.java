package p1;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateManager 
{
	private Session session;

	public HibernateManager()
	{
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //connects to cfg
		ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());       		   
		session =sessionFactory.openSession();	
		System.out.println("Connected to Pf....");
	}
		
	public void readSpecific(String roll)
	{
		session.beginTransaction();
		Student s = (Student) session.get(Student.class, roll);
		System.out.println(s.getName()+" "+s.getRoll());
	}
}
