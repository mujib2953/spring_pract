package com.learn2code.springdemo;

public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    private String email;
    private String team;

    public TennisCoach() {
        System.out.println("TennisCoach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TennisCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("TennisCoach: inside setter method - setEmail");
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("TennisCoach: inside setter method - setTeam");
        this.team = team;
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
