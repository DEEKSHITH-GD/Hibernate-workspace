package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class StudentApp 
{

	private static Session session;

	public static void main(String[] args) 
	{
		
		Student s1 = new Student();
		s1.setName("Joy");
		s1.setRoll("2");
		
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //connects to cfg
		ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());       		   
		session =sessionFactory.openSession();	
		System.out.println("Connected to Pf....");
		
		Transaction tran = session.beginTransaction();
		session.save(s1);
		tran.commit();
		System.out.println("Object saved");
		
	}
}
