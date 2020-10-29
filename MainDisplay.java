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
public class MainDisplay {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Query query = session.createQuery("from Employee e ");
		List<Employee> employeelist = query.list();
		// int count = 0;
		for (Employee e : employeelist) {
			for (Address a : e.getAddresses()) {
				System.out.println(e);
				if (a.getCountry().equals("India")) {
					System.out.println("Country : " + a.getCountry());
					switch (a.getType()) {
					case "Work":
						System.out.println("Work : " + e.getEmpName());
						break;
					case "Home":
						System.out.println("Home: " + e.getEmpName());
						break;
					case "Training":
						System.out.println("Training: " + e.getEmpName());
						break;
					default:
						System.out.println("Not Available");

					}

				}

			}
		}
	}
}

/*
 * factory.close(); session.close();
 */
