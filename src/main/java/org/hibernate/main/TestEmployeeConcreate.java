package org.hibernate.main;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
import org.hibernate.entity.Contract_Employee;
import org.hibernate.entity.Employee;
import org.hibernate.entity.Regular_Employee;

/**
 * 
 * @author Amir Ansari
 * created at 22-12-2019
 * In case of Table Per Concrete class, there will be three tables 
 * in the database having no relations to each other. There are two ways to map the 
 * table with table per concrete class strategy.
   By union-subclass element
   By self creating the table for each class
 *
 */
public class TestEmployeeConcreate {
	public static void main(String args[]) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	 /*   Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();  
		
		Employee e1 = new Employee();
		 e1.setFirstName("Gaurav");
		 e1.setLastName("Chawla");
	        
		    Regular_Employee e2=new Regular_Employee();    
		    e2.setFirstName("Vivek");    
		    e2.setLastName("Kumar");
		    e2.setSalary(50000);    
		    e2.setBonous(5);    
		        
		    Contract_Employee e3=new Contract_Employee();    
		    e3.setFirstName("Arjun");
		    e3.setLastName("Kumar");
		    e3.setPay_per_hour(1000);    
		    e3.setContract_duration("15 hours");    
		        
		    session.persist(e1);    
		    session.persist(e2);    
		    session.persist(e3);    
		    
		    t.commit();
		    session.close();
		    System.out.println("successfully stored");     */
		
	}

}
