package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateManager {
	private Session session;

	public void connect()
	{
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //connects to cfg
		ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());       		   
		session =sessionFactory.openSession();	
		System.out.println("Connected");
	}
	
	public void insert(Student e)
	{
		Transaction tran = session.beginTransaction();
		session.save(e);
		tran.commit();
		System.out.println("Object saved");
	}
}
