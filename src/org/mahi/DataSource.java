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
		
		e.setFirstName("Naveen");
		e.setLastName("Matta");
		e.setId(2);
		e.setMailId("matta09@gmail.com");
		e.setPhoneNo(603227803);
		
		session.persist(e);
		t.commit();
		session.close();
		System.out.println("Database Updated succesfully");
	}

}
