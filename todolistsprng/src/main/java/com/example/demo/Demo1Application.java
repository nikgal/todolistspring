package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.galov.organizer.beans.User;
import by.galov.organizer.dao.AdminCreator;
import by.galov.organizer.impls.UserPool;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	    Object obj = context.getBean("userfile");
//	    if(obj instanceof UserFile){
//	        UserFile uf = (UserFile)obj;
//	        System.out.println(uf);
//	    }
//	    Object obj1 = context.getBean("userfile");
//        if(obj instanceof UserFile){
//            UserFile uf = (UserFile)obj1;
//            System.out.println(uf);
//        }
        
        Object obj3 = context.getBean("userPool");
        if(obj3 instanceof UserPool){
            UserPool uf = (UserPool)obj3;
            System.out.println(uf);
        }else{
            System.out.println("fuck");
        }
        
        Object obj4 = context.getBean("adminCreator");
      if(obj4 instanceof AdminCreator){
          AdminCreator uf = (AdminCreator)obj4;
          User u1 = uf.createUser();
          User u2 = uf.createUser();
          System.out.println(u1 + "----" + u2);
      }
	}
}
