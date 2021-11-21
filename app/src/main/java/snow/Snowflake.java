package snow;

import javafx.scene.paint.Color;

public class Snowflake {
    double x;
    double y;
    double speed;
    double size;
    double counter;
    Color color;
    
    public Snowflake(double x, double y) {
        this.x = x;
        this.y = y;
        this.speed = 0.1 + Math.random()*0.1;
        this.size = Math.random() * 5.0;
        this.counter = Math.random() * 10;
        this.color = Color.gray(0.75 + Math.random()*0.25);
    }

    public void update() {
        counter += 6.28/600.0;
        x += 0.1 * Math.sin(counter+speed);
        y += speed;
    }
}
