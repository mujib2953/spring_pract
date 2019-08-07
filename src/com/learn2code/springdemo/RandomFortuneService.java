package com.learn2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String[] allFortune = {
            "The fortune you seek is in another cookie.",
            "A closed mouth gathers no feet.",
            "A conclusion is simply the place where you got tired of thinking.",
            "A cynic is only a frustrated optimist.",
            "A foolish man listens to his heart. A wise man listens to cookies."
    };

    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(allFortune.length);
        System.out.println(index);
        return allFortune[index];
    }
}
