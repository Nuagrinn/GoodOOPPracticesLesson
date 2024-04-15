package ru.keller.smartphone.abstraction;

public class AndroidPhone extends Smartphone {
    public AndroidPhone(String manufacturer, String model, Battery battery) {
        super(manufacturer, model, battery);
    }

    @Override
    public void makeCall() {
        System.out.println("Making a call using the Android dialer.");
    }

    @Override
    public void sendText() {
        System.out.println("Sending a text message using the Android messaging app.");
    }
}
