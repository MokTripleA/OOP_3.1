import processing.core.PApplet;

public class Seifenblase extends RoundDrawableObject {

    boolean platzen = false;

    Seifenblase(PApplet iWindow, float inputPositionX, float inputPositionY, float iDiameter, float iSpeed, float iSpeed_2, int iColor) {
        super(iWindow, inputPositionX, inputPositionY, iDiameter, iSpeed, iSpeed_2, iColor);
    }

    @Override
    void collision() {
    }

    @Override
    int move(float t) {
        speed = speed + accel * t;
        yPos = yPos + speed * t;
        xPos = xPos + speed_2;
        if (platzen == true) {
            return 0;
        } else {
            return 1;
        }
    }


    @Override
    void male() {
        if (platzen == false) {
            window.fill(color);
            window.ellipse(xPos, yPos, diameter, diameter);
        } else {
        }
    }
}
