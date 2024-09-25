package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "--------------------Welcome to our Book Store--------------------!" );
        System.out.println( "--------------------May you have a good day--------------------!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        User user1 = context.getBean("user", User.class);
        user1.user();
        
    }
}
