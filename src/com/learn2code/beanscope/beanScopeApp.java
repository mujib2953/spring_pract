package com.learn2code.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeApp {
    public static void main(String... args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Gamer videoGamer = context.getBean("videoGamerBean", Gamer.class);

        Gamer anotherVideoGamer = context.getBean("videoGamerBean", Gamer.class);

        System.out.println(videoGamer.subscribeToGame());
        System.out.println(videoGamer.printGamingCommunity());

        // --- Checking if both beans are same i.e their scope is singletone
        boolean result = (videoGamer == anotherVideoGamer);

        System.out.println("\n Pointing to same object :: " + result);
        System.out.println("\n Memory location for videoGamer :: " + videoGamer);
        System.out.println("\n Memory location for anotherVideoGamer :: " + anotherVideoGamer);

        context.close();
    }
}
