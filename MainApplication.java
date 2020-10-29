package main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hcl.day40.Address;
import com.hcl.day40.Employee;

/**
 * @author chint.jhansilakshmi4
 *
 */
public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Employee emp1 = new Employee();
		emp1.setEmpId(11);
		emp1.setEmpName("K");
		Address add1 = new Address();
		add1.setType("Home");
		add1.setCity("LA");
		add1.setCountry("USA");
		Address add2 = new Address();
		add2.setType("Communcation");
		add2.setCity("Banglore");
		add2.setCountry("India");
		List<Address> addList = new ArrayList<>();
		addList.add(add1);
		addList.add(add2);
		emp1.setAddresses(addList);
		session.save(emp1);
		t.commit();
		System.out.println("Successfully saved");
		factory.close();
		session.close();
	}
}