package org.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.entity.Employee;

/**
 * 
 * @author Amir Ansari
 * created at 21-12-2019
 *  Insert Data to Employee
 *
 */

public class TestEmployeeXml1 {
	
	public static void main(String args[]) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		 SessionFactory factory = meta.getSessionFactoryBuilder().build();
		 Session mSession = factory.openSession();
		 Transaction t = mSession.beginTransaction();
		 
		 Employee emp = new Employee();
		 emp.setId(3);
		 emp.setFirstName("Azmi");
		 emp.setLastName("Ansari");
		 
		 mSession.save(emp);
		 t.commit();
		 System.out.println("successfully saved");    
		 factory.close();
		 mSession.close();
		 
		
	}

}
