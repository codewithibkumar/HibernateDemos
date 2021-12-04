package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SearchMain {

	public static void main(String[] args) {
		//Get Session factory
				SessionFactory sessionFactory = new Configuration()
						.configure().buildSessionFactory();
				//Open session
				Session session = sessionFactory.openSession();
				
				session.beginTransaction();
				
				//search
				Employee emp =	session.get(Employee.class, 2);
				//System.out.println(emp);
				System.out.println(emp.getEmpId());
				System.out.println(emp.getName());
				System.out.println(emp.getSalary());
				System.out.println(emp.getDescription());
				System.out.println(emp.getAddress().getCorr_address());
				System.out.println(emp.getAddress().getPermanent_address());
			

	}

}
