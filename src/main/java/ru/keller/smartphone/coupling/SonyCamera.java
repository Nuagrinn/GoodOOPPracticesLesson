package ru.keller.smartphone.coupling;

public class SonyCamera implements Camera {
    @Override
    public void captureImage() {
        System.out.println("Capturing image with Sony Camera.");
    }
}
