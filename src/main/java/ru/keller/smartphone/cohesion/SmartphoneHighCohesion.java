package ru.keller.smartphone.cohesion;

public class SmartphoneHighCohesion {

    private String manufacturer;
    private String model;
    private CallService callService;
    private MessagingService messagingService;
    private MediaPlayer mediaPlayer;
    private Camera camera;

    public SmartphoneHighCohesion(String manufacturer, String model, CallService callService, MessagingService messagingService,
                      MediaPlayer mediaPlayer, Camera camera) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.callService = callService;
        this.messagingService = messagingService;
        this.mediaPlayer = mediaPlayer;
        this.camera = camera;
    }

    public void makeCall() {
        callService.makeCall();
    }

    public void sendText() {
        messagingService.sendText();
    }

    public void playMusic() {
        mediaPlayer.playMusic();
    }

    public void takePhoto() {
        camera.captureImage();
    }

}



