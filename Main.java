package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

import org.hibernate.Query;

import com.hcl.day40.Address;
import com.hcl.day40.Employee;

/**
 * @author dharini shree.k
 *
 */
public class Main {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Query query = session.createQuery("from Employee e ");
		List<Employee> employeelist = query.list();
		int count = 0;
		for (Employee e : employeelist) {
			for (Address a : e.getAddresses()) {
				System.out.println(e);
				if(a.getCountry().equals("India") && a.getType().equals("Work")) {
					
					count = count + 1;
				}
				System.out.println("No. of employees working in India: " + count);
				}
			
		}
	}
}
		


		/*
		 * factory.close(); session.close();
		 */

