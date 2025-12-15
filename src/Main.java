import processing.core.PApplet;

public class Main extends PApplet {

    float[] r = new float[10];
    float[] x = new float[10];
    float[] y = new float[10];
    float[] angle = new float[10];
    float[] dAngle = new float[10];

    /// 1
    @Override
    public void settings() {
        size(800, 800);
    }

    /// 2
    @Override
    public void setup() {
        for (int i = 0; i < 10; i++) {
            r[i] = random(10, 40);
            x[i] = random(width);
            y[i] = random(-height,0);
            angle[i] = random(2 * PI);
            dAngle[i] = random(-PI / 16, PI / 16);
        }
    }

    /// 3
    @Override
    public void draw() {
        background(0, 0, 0);
        for (int i = 0; i < 10; i++) {
            drawSnowflake(x[i], y[i], angle[i], r[i]);
            y[i] += random(10);

            angle[i] += dAngle[i];
            if (y[i] > height) {
                y[i] = 0;
                x[i] = random(width);
            }
        }

    }

    public void drawSnowflake(float x, float y, float angle, float r) {
        pushMatrix();
        translate(x, y);
        rotate(angle);
        stroke(r*r);
        strokeWeight(10);
        line(-75,0,75,0);
        line(0, -75, 0, 75);
        line(-45, -45, 45, 45);
        line(-45, 45, 45, -45);
        popMatrix();

    }


    public static void main(String[] args) {
        PApplet.main("Main");
    }
}