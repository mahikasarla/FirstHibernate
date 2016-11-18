package org.mahi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DataSource {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		Employee e= new Employee();
		e.setFirstName("Mahender");
		e.setLastName("Kasarla");
		e.setId(1);
		e.setMailId("mahi.kasarla09@gmail.com");
		e.setPhoneNo(967637803);
		Employee e1= new Employee();
		e1.setFirstName("Naveen");
		e1.setLastName("Matta");
		e1.setId(2);
		e1.setMailId("matta09@gmail.com");
		e1.setPhoneNo(603227803);
		// persist data
		session.persist(e);
		//session.save(e1);
		session.persist(e1);
		t.commit();
		session.close();
		System.out.println("Database Updated succesfully");
	}

}
