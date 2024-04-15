package ru.keller.smartphone.abstraction;

public class Battery {
    private int capacity;
    private boolean isCharging;

    public Battery(int capacity) {
        this.capacity = capacity;
        this.isCharging = false;
    }

    public void charge() {
        isCharging = true;
        System.out.println("Battery is charging.");
    }

    public void discharge() {
        isCharging = false;
        System.out.println("Battery is discharging.");
    }

    // Getters and setters
    public int getCapacity() { return capacity; }
    public boolean isCharging() { return isCharging; }
}
