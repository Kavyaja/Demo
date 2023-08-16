package com.hibernate.DemoHib;


//import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	HibPractice hp = new HibPractice();
    	hp.setId(101);
    	hp.setName("kj");
    	hp.setColor("black");
    	
    	Configuration con =  new Configuration().configure().addAnnotatedClass(HibPractice.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession(); 
    	Transaction tx = session.beginTransaction();
    	session.save(hp);
    	tx.commit();
    }
}
