package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext  applicationContext=new ClassPathXmlApplicationContext("configuration.xml");
        applicationContext.registerShutdownHook();
        Employee employee=applicationContext.getBean("emp", Employee.class);
        System.out.println(employee);
    }
}
