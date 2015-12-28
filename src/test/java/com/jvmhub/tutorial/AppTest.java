package com.jvmhub.tutorial;
 
import junit.framework.TestCase;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
import com.jvmhub.tutorial.entity.Car;
 
/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
 
	public void testApp() {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
 
		Car user = new Car("durango");
                user.setCode(4);
		session.save(user);
 
		session.getTransaction().commit();
		session.close();
	}
}
