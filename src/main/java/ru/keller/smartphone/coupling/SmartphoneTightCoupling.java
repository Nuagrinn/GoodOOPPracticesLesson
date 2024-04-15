package ru.keller.smartphone.coupling;

public class SmartphoneTightCoupling {
    private final Camera camera;

    public SmartphoneTightCoupling() {
        camera = new SonyCamera();
    }

    public void takePhoto() {
        camera.captureImage();
    }
}



