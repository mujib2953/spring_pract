package com.learn2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Activity2App {

    public static void main(String... args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach trackCoach = context.getBean("myCoach", Coach.class);

        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());

        context.close();
    }
}
