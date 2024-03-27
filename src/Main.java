package LCD;

public class Main {
    
    public static void main(String[] args) {

        LCD lcd = new LCD();
        lcd.turnOff();
        lcd.turnOn();
        lcd.Freeze();
        lcd.setVolume(10);
        lcd.volumeUp();
        lcd.setBrightness(10);
        lcd.brightnessDown();
        lcd.setCable(1);

        lcd.displayMessage();
    }
}