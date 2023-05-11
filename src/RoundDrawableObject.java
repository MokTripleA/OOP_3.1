import processing.core.PApplet;

public abstract class RoundDrawableObject extends PApplet {

    protected PApplet window;
    protected float xPos;
    protected float yPos;
    protected float diameter;
    protected float speed;
    protected float speed_2;
    protected int color;
    protected float accel;

    RoundDrawableObject(PApplet iWindow, float inputPositionX, float inputPositionY, float iDiameter, float iSpeed, float iSpeed_2, int iColor) {
        window = iWindow;
        xPos = inputPositionX;
        yPos = inputPositionX;
        diameter = iDiameter;
        speed = iSpeed;
        speed_2 = iSpeed_2;
        color = iColor;
    }

    abstract void collision();

    abstract int move(float t);

    abstract void male();
}
