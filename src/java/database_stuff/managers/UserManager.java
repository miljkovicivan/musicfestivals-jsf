/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_stuff.managers;

import database_stuff.HibernateUtil;
import database_stuff.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author ivan
 */
public class UserManager {
	SessionFactory factory;
	
	public UserManager() {
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		factory = configuration.buildSessionFactory(builder.build());
	}
	
	
	public User getById(int id) {
		User user = null;
		try{
			Session session = factory.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			Query q = session.createQuery("from User where id = " + id);
			user = (User) q.uniqueResult();
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	
	public User getByUsername(String userName) {
	    User user = null;
	    try{
		    Session session = factory.openSession();
		    org.hibernate.Transaction tx = session.beginTransaction();
		    Query q = session.createQuery("from User where UserName=\""+userName+"\"");
		    user = (User) q.uniqueResult();
		    //session.save(object);
		    tx.commit();
		    session.close();
	    } catch(Exception e) {
		    e.printStackTrace();
	    }
	    return user;
	}

	public User getByEmail(String email) {
	    User user = null;
	    try{
		    Session session = factory.openSession();
		    org.hibernate.Transaction tx = session.beginTransaction();
		    Query q = session.createQuery("from User where Email=\""+email+"\"");
		    user = (User) q.uniqueResult();
		    //session.save(object);
		    tx.commit();
		    session.close();
	    } catch(Exception e) {
		    e.printStackTrace();
	    }
	    return user;
	}
	
	public void update(User user) {
		try{
			Session session = factory.openSession();
			session.beginTransaction();
			session.update(user);
			session.getTransaction().commit();
			session.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void save(User user) {
		try{
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			session.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
