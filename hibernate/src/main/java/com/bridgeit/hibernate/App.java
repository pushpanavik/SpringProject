package com.bridgeit.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
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
      LaptopInfo laptopInfo=new LaptopInfo();
      laptopInfo.setCompanyName("hp");
      System.out.println(1);
      
      laptopInfo.setModelNo("eb12dhf5");
      System.out.println(2);
      
      laptopInfo.setColor("red");
      System.out.println(3);
      
      laptopInfo.setProcessor("dual core");
      System.out.println(4);
      
      laptopInfo.setRam("4GB");
      System.out.println(5);
      
      
      Configuration configuration=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(LaptopInfo.class);
      System.out.println(6);
      
      StandardServiceRegistryBuilder serviceRegistryBuilder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
      
      
      SessionFactory factory=configuration.buildSessionFactory(serviceRegistryBuilder.build());
      System.out.println("hibernate registsry created");
      System.out.println(7);
      
      Session session=factory.openSession();
      System.out.println(8);
      
      
      session.save(laptopInfo);
      Transaction transaction=session.beginTransaction();
      System.out.println(9);
      
      /*session.persist(laptopInfo);
      System.out.println(10);*/
      
      transaction.commit();
      System.out.println("commited");
      
     
      System.out.println("close session");
      
      System.out.println("successfully saved ");
      
    /*  session.close();*/
    }
}
