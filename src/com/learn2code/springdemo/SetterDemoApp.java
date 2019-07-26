package com.learn2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String... args) {

        // --- loads the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // --- retrieve bean from spring container
        TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);

        // --- call methods of bean
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println("Regards from Tennis Coach : " + tennisCoach.getDailyFortune());

        // --- close the context
        context.close();
    }
}
