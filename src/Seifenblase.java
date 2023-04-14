import processing.core.PApplet;

public abstract class Seifenblase extends RoundDrawableObject {
    Seifenblase(PApplet iWindow, float inputPositionX, float inputPositionY, float iDiameter, float iSpeed, float iSpeed_2, int iColor) {
        super(iWindow, inputPositionX, inputPositionY, iDiameter, iSpeed, iSpeed_2, iColor);
    }

    int move(float t) {
        return 0;
    }
}
