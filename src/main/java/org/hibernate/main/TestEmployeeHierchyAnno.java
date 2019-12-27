package org.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.entity.Contract_EmployeeHierarchy;
import org.hibernate.entity.Employee;
import org.hibernate.entity.EmployeeHierarchy;
import org.hibernate.entity.Regular_EmployeeHierarchy;

public class TestEmployeeHierchyAnno {
	
	public static void main(String args[]) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		
		 Transaction t = session.beginTransaction();
		 EmployeeHierarchy e1 = new EmployeeHierarchy();
		 e1.setName("Gaurav Chawla");    
         
		 Regular_EmployeeHierarchy e2=new Regular_EmployeeHierarchy();    
         e2.setName("Vivek Kumar");    
         e2.setSalary(50000);    
         e2.setBonous(5);   
             
         Contract_EmployeeHierarchy e3=new Contract_EmployeeHierarchy();    
         e3.setName("Arjun Kumar");    
         e3.setPay_per_hour(1000);    
         e3.setContract_duration("15 hours");    
             
         session.persist(e1);    
         session.persist(e2);    
         session.persist(e3);    
             
         t.commit();    
         session.close();    
         System.out.println("success Store Data");    
		 
		
	}

}
