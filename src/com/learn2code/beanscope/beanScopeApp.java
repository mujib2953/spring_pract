package com.learn2code.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeApp {
    public static void main(String... args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Gamer videoGamer = context.getBean("videoGamerBean", Gamer.class);

        System.out.println(videoGamer.subscribeToGame());
        System.out.println(videoGamer.printGamingCommunity());
        context.close();
    }
}
