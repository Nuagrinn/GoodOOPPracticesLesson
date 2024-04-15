package ru.keller.smartphone.cohesion;

public class SmartphoneLowCohesion {

    private String manufacturer;
    private String model;

    public SmartphoneLowCohesion(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void makeCall() {
        // Implementation for making a call
    }

    public void sendText() {
        // Implementation for sending a text message
    }

    public void playMusic() {
        // Implementation for playing music
    }

    public void takePhoto() {
        // Implementation for taking a photo
    }
}



