package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.galov.organizer.beans.UserFile;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	    Object obj = context.getBean("userfile");
	    if(obj instanceof UserFile){
	        UserFile uf = (UserFile)obj;
	        System.out.println(uf.hashCode());
	    }
	    Object obj1 = context.getBean("userfile");
        if(obj instanceof UserFile){
            UserFile uf = (UserFile)obj1;
            System.out.println(uf.hashCode());
        }
	}
}
