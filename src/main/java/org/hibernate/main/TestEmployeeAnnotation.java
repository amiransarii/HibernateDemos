package org.hibernate.main;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
import org.hibernate.entity.EmployeeAnnotation;

/**
 * 
 * @author Amir Ansari
 * created at 21-12-2019
 * store data in database using annotation
 *
 */
public class TestEmployeeAnnotation {
	public static void main(String args[]) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		EmployeeAnnotation emp = new EmployeeAnnotation();
		 emp.setId(2);
		 emp.setFirstName("Akil");
		 emp.setLastName("Ansari");
		 
		 session.save(emp);
		 t.commit();
		 System.out.println("successfully saved");
		 factory.close();
		 session.close();
	}

}
