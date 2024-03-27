package LCD;

public class LCD {
    private String status;
    private int volume;
    private int brightness;
    private String[] cables = {"VGA", "DVI", "HDMI", "DisplayPort"};
    private int cable;

    public LCD() {
        this.status = "Off";
        this.volume = 0;
        this.brightness = 0;
        this.cable = 0;
    }

    public void turnOff() {
        this.status = "Off";
    }

    public void turnOn() {
        this.status = "On";
    }

    public void Freeze() {
        this.status = "Freeze";
    }

    public void volumeUp() {
        if (this.volume < 100) {
            this.volume++;
        }
    }

    public void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public void brightnessUp() {
        if (this.brightness < 100) {
            this.brightness++;
        }
    }

    public void brightnessDown() {
        if (this.brightness > 0) {
            this.brightness--;
        }
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        }
    }

    public void setCable(int pilihan) {
        if (pilihan >= 0 && --pilihan < this.cables.length) {
            this.cable = pilihan ;
        }
    }

    public void displayMessage() {
        System.out.println("LCD Status: " + this.status);
        System.out.println("Volume: " + this.volume);
        System.out.println("Brightness: " + this.brightness);
        System.out.println("Cable: " + this.cables[this.cable]);
    }
}
