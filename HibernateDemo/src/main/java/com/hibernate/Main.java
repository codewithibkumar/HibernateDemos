package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		//Get Session factory
		SessionFactory sessionFactory = new Configuration()
				.configure().buildSessionFactory();
		//Open session
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		//Employee emp1 = new Employee("Raj",50000, "Raj is an indian belong to Delhi");
		Address addr1 = new Address();
		addr1.setCorr_address("A-55 Lajpat Nagar");
		addr1.setPermanent_address("B-98 South Ext");
		
		Employee e1 = new Employee();
		e1.setName("Raj");
		e1.setSalary(60000);
		e1.setDescription("Raj is good guy");
		e1.setAddress(addr1);
		
		Employee e2 = new Employee();
		e2.setName("Ravi");
		e2.setSalary(50000);
		e2.setDescription("Ravi is good guy");
		e2.setAddress(addr1);
		
		session.save(e1);
		session.save(e2);
		//System.out.println(emp1);
		
		session.beginTransaction().commit();
		
		session.close();
		System.out.println("Data saved");
		

	}

}
