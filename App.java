package com.data.HibernateCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import HibernateCRUD.entities.User;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	User user1 = new User();
    	user1.setName("abc");
    	user1.setPassword("abc123");
    	
        Configuration cfg=new Configuration();
        cfg.configure("/HibernateCRUD/config/Hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        //Insert Query
       /* 
        try
        {
        	session.save(user1);
        	transaction.commit();
        	System.out.println("user details added successfully");
        }
        catch(Exception e)
        {
        	transaction.rollback();
        	e.printStackTrace();
        	System.out.println("user details not added due to some error");
        }*/
        
        
        // Select Query 
        
     /*   try
        {
        	User user = session.get(User.class, 1L);
        	if(user != null)
        	{
        		System.out.println(user.getId());
        		System.out.println(user.getName());
        		System.out.println(user.getPassword());
        	}
        	else
        	{
        		System.out.println("user not found");
        	}
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	
        } */
        
        //    UPDATE
        
      /*  try
        {
        	User user = session.get(User.class, 1L);
        	user.setName("pavan");
        	session.saveOrUpdate(user);
        	transaction.commit();
        	System.out.println("user details updated successfully");
        }
        catch(Exception e)
        {
        	transaction.rollback();
        	e.printStackTrace();
        	System.out.println("user details not updated because of error ");
        } */
        
        //DELETE
        
        
        try
        {
        	User user=new User();
        	user.setId(1L);
        	
        	session.delete(user);
        	transaction.commit();
        	
        	System.out.println("user details deleted");
        }
        
        catch(Exception e)
        {
        	transaction.rollback();
        	e.printStackTrace();
        	System.out.println("user details not deleted");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
