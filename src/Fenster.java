import processing.core.PApplet;
import processing.event.MouseEvent;

public class Fenster extends PApplet {

    RoundDrawableObject[] drawableObjects = new RoundDrawableObject[7];
    int Punkte;

    @Override
    public void settings() {
        size(800, 800);
        drawableObjects[0] = new Seifenblase(this, 400, 400, 50, 3, 0, 255);
        for (int x = 1; x < drawableObjects.length; x++) {
            drawableObjects[x] = new Dornenball(this, random(50, 750), random(50, 750), 50, 0, 0, 0);
        }
    }

    @Override
    public void draw() {
        background(100);
        drawableObjects[0].male();
        drawableObjects[0].move(0.5f);
        for (int x = 0; x < drawableObjects.length; x++) {
            drawableObjects[x].male();
            for (int y = 0; y < drawableObjects.length; y++) {
                drawableObjects[x].collision(drawableObjects[y]);
            }
        }
        Punkte = Punkte + drawableObjects[0].move(0.5f);
        textSize(25);
        text("Punkte: " + Punkte, 10, 30);
    }

    @Override
    public void mousePressed(MouseEvent event) {
        for (int i = 0; i < drawableObjects.length; i++) {
            if (drawableObjects[i] instanceof Seifenblase)
                ((Seifenblase) drawableObjects[i]).pusten(event.getX(), event.getY());
        }
    }
}
