import processing.core.PApplet;

public class Seifenblase extends RoundDrawableObject {

    boolean platzen = false;

    Seifenblase(PApplet iWindow, float inputPositionX, float inputPositionY, float iDiameter, float iSpeed, float iSpeed_2, int iColor) {
        super(iWindow, inputPositionX, inputPositionY, iDiameter, iSpeed, iSpeed_2, iColor);
    }

    @Override
    void collision(RoundDrawableObject other) {
        if (xPos - diameter / 2 < 0 ||
                xPos + diameter / 2 > window.width ||
                yPos - diameter / 2 < 0 ||
                yPos + diameter / 2 > window.height
        ) {
            platzen = true;
        }
        if (other instanceof Dornenball && Math.sqrt(Math.pow(other.xPos - xPos, 2) + Math.pow(other.yPos - yPos, 2)) < (diameter + ((Dornenball) other).innerDiameter) / 2) {
            platzen = true;
        }
    }

    //(Math.sqrt(Math.pow(X - xPos, 2) + Math.pow(Y - yPos, 2))) <- Abstand Mauspunkt zum Seifenblasenmittelpunkt

    void pusten(float X, float Y) {
        if (Math.sqrt(Math.pow(X - xPos, 2) + Math.pow(Y - yPos, 2)) < diameter / 2) {
            diameter += 5;
        }
        if (Math.sqrt(Math.pow(X - xPos, 2) + Math.pow(Y - yPos, 2)) < 500 && Math.sqrt(Math.pow(X - xPos, 2) + Math.pow(Y - yPos, 2)) > diameter / 2) {
            if (X < xPos) {
                speed += 2;
            }
            if (Y < yPos) {
                speed_2 += 2;
            }
            if (X > xPos) {
                speed -= 2;
            }
            if (Y > yPos) {
                speed_2 -= 2;
            }
        }
    }

    @Override
    int move(float t) {
        speed = speed + accel * t;
        xPos = xPos + speed * t;
        yPos = yPos + speed_2;
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
