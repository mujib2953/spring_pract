package com.learn2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String... args) {
        // --- loads the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // --- retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // --- call the methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        // --- new DI method from Fortune Service
        System.out.println(theCoach.getDailyFortune());

        // --- close the context
        context.close();

    }
}
