import processing.core.PApplet;

public class Dornenball extends RoundDrawableObject {

    float innerDiameter = 100;
    int anzahlDornen = 50;

    Dornenball(PApplet iWindow, float inputPositionX, float inputPositionY, float iDiameter, float iSpeed, float iSpeed_2, int iColor) {
        super(iWindow, inputPositionX, inputPositionY, iDiameter, iSpeed, iSpeed_2, iColor);
    }



    @Override
    void collision(RoundDrawableObject other) {

    }

    @Override
    int move(float t) {
        return 0;
    }

    @Override
    void male() {
        window.fill(0, 255);
        window.stroke(0);
        window.beginShape();
        for (int i = 0; i <= anzahlDornen; i++) {
            window.vertex((float) ((Math.sin(i * 2 * Math.PI / anzahlDornen) * diameter /
                    2) + xPos), (float) ((Math.cos(i * 2 * Math.PI / anzahlDornen) * diameter / 2) +
                    yPos));
            window.vertex((float) ((Math.sin((i + .5) * 2 * Math.PI / anzahlDornen) *
                    innerDiameter / 2) + xPos), (float) ((Math.cos((i + .5) * 2 * Math.PI / anzahlDornen)
                    * innerDiameter / 2) + yPos));
        }
        window.endShape();
    }
}

