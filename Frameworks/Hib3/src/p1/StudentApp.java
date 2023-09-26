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
		
		
		HibernateManager hm = new HibernateManager();
		//hm.saveObj(s1);
		//hm.readAll();
		hm.readSpecific("2");
		
	}
}
