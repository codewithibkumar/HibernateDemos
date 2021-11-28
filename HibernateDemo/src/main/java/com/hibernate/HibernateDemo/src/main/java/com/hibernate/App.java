package com.hibernate;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter roll: "); int
		 * roll = sc.nextInt();
		 * 
		 * System.out.println("Enter name: "); String name = sc.next();
		 * 
		 * 
		 * System.out.println("Enter Dob: "); System.out.println("Enter year: "); int
		 * year = sc.nextInt();
		 * 
		 * System.out.println("Enter month: "); int month = sc.nextInt();
		 * 
		 * System.out.println("Enter day: "); int day = sc.nextInt();
		 * 
		 * System.out.println("Enter age: "); int age = sc.nextInt();
		 * 
		 * System.out.println("Enter mobile: "); long mobile = sc.nextLong();
		 */ 			
    	
        //SessionFactory
    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
    	//Get the session from SessionFactory
    	Session session = sf.openSession();
    	// start a transaction
    	session.beginTransaction();
    	
    	// give object to session
    	//Student s1 = new Student(5,"Rita",
    	//		LocalDate.of(1996, 01, 10), 26,8899443322L);
    	//Student student = new Student(roll,name,LocalDate.of(year,month,day),age,mobile);
    	Student s2 = new Student();
    	s2.setName("Prachi");
    	s2.setDob(LocalDate.of(1998, 10, 10));
    	//s2.setDob(new Date("1998-10-11"));
    	//s2.setAge(22);
    	s2.setAge(s2.getAge());
    	s2.setMobile(9944334433L);
    	
    	//System.out.println(s2.getAge());
    	
    	session.save(s2);
    	session.getTransaction().commit();
    	    	
    	// session close
    	session.close();
    	System.out.println("Record saved");
    }
}
