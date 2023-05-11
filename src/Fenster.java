import processing.core.PApplet;

public class Fenster extends PApplet {

    RoundDrawableObject[] drawableObjects = new RoundDrawableObject[5];

    @Override
    public void settings() {
        size(800, 800);
        //drawableObjects[0] = new Seifenblase(this, 400, 400, 50, 3, 1, 255);
        for (int x = 0; x < drawableObjects.length; x++) {
            drawableObjects[x] = new Dornenball(this, random(100, 700), random(100, 700), 50, 0, 0, 0);
        }
    }

    @Override
    public void draw() {
        background(100);
        drawableObjects[0].male();
        drawableObjects[0].move(0.5f);
        for (int x = 0; x < drawableObjects.length; x++) {
            drawableObjects[x].male();
            System.out.println(drawableObjects[x]);
        }
    }

    @Override
    public void mousePressed() {

    }
}
