package sample;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;

import static javafx.scene.paint.Color.YELLOW;

public class Face {
    GraphicsContext gc;
    Integer startx;
    Integer starty;


    public Face(GraphicsContext gc,
                Integer startx,
                Integer starty

                ) {
        this.gc = gc;
        this.startx = startx;
        this.starty = starty;
    }



    public void draw() {
        this.gc.setFill(Color.rgb(234,192,134, 1));
        this.gc.fillOval(this.startx , this.starty + 120, 30, 30);
        this.gc.setFill(Color.GRAY);

        this.gc.strokeOval(this.startx , this.starty + 120, 30, 30);
        this.gc.fillOval(this.startx + 5, this.starty + 125, 5, 5);
        this.gc.fillOval(this.startx + 20, this.starty + 125, 5, 5);
        if(Math.random() <  0.6) {
            this.gc.strokeArc(this.startx + 5, this.starty + 125, 20, 20, 180, 180 ,ArcType.OPEN);
        } else {
            this.gc.strokeArc(this.startx + 5, this.starty + 130, 20, 20, -180, -180 ,ArcType.OPEN);
        }





    }
}
