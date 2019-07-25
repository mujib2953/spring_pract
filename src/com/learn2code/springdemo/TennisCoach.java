package com.learn2code.springdemo;

public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Fast serve 10 time.";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
