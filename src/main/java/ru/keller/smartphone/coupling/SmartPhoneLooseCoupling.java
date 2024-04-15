package ru.keller.smartphone.coupling;

public class SmartPhoneLooseCoupling {
    private final Camera camera;

    public SmartPhoneLooseCoupling(Camera camera) {
        this.camera = camera;
    }

    public void takePhoto() {
        camera.captureImage();
    }
}

