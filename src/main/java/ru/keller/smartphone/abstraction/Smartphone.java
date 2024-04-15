package ru.keller.smartphone.abstraction;

public abstract class Smartphone {
    private String manufacturer;
    private String model;
    private Battery battery;

    public Smartphone(String manufacturer, String model, Battery battery) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.battery = battery;
    }

    public abstract void makeCall();
    public abstract void sendText();

    public void chargeBattery() {
        battery.charge();
    }

    // Getters and setters
    public String getManufacturer() { return manufacturer; }
    public String getModel() { return model; }
    public Battery getBattery() { return battery; }
}

