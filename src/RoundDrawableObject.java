import processing.core.PApplet;

public abstract class RoundDrawableObject extends PApplet {

    private PApplet window;
    private float xPos;
    private float yPos;
    private float diameter;
    private float speed;
    private float speed_2;
    private int color;
    private float accel;

    RoundDrawableObject(PApplet iWindow, float inputPositionX, float inputPositionY, float iDiameter, float iSpeed, float iSpeed_2, int iColor) {
        iWindow = window;
        inputPositionX = xPos;
        inputPositionY = yPos;
        iDiameter = diameter;
        iSpeed = speed;
        iSpeed_2 = speed_2;
        iColor = color;
    }

    abstract void collision();

    abstract int move(float t);

    abstract void male();
}
