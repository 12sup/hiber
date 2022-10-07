package com.te.hibernate.d;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Student student = new Student();
		student.setRollNo(1);
		student.setName("Sangeeta");
		student.setMarks(94);

		Laptop laptop = new Laptop();
		laptop.setLaptopId(101);
		laptop.setLaptopName("Dell");
		laptop.setStudent(student);

		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

	//	Transaction transaction = session.beginTransaction();
		session.beginTransaction();
		session.save(student);
		session.save(laptop);
		session.getTransaction().commit();
		//transaction.commit();
		session.close();

	}

}