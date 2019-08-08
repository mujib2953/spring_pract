package com.learn2code.beanscope;

public class VideoGamer implements Gamer {

    private GammingService gammingService;

    public void setGammingService(GammingService gammingService) {
        this.gammingService = gammingService;
    }

    @Override
    public String subscribeToGame() {
        return "Hola!! Subscribed...";
    }

    @Override
    public String printGamingCommunity() {
        return gammingService.printGamingCommunity();
    }
}
