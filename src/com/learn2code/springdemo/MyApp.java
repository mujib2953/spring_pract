package com.learn2code.springdemo;

public class MyApp {

    public static void main(String... args) {
        // --- create an object
        Coach newCoach = new TrackCoach();
        // -- use the object
        System.out.println(newCoach.getDailyWorkout());
    }
}
