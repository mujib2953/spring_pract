package com.learn2code.springdemo;

public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("TennisCoach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TennisCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Fast serve 10 time.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
