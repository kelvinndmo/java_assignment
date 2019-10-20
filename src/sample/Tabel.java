package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tabel {
    String name;
    Integer total;
    GraphicsContext gc;
    Integer startx;
    Integer starty;
    Integer count;
    Integer padding = 120;
    Integer width;
    Integer height = 100;

    public Tabel(GraphicsContext gc,
                 Integer startx,
                 Integer starty,
                 Integer count,
                 Integer width,
                 Integer height
                 ) {
        this.gc = gc;
        this.startx = startx;
        this.starty = starty;
        this.count = count;
        this.width = width;
        this.height = height;
    }

    public void draw() {
        this.gc.fillRoundRect(this.startx, this.starty, this.width, this.height, 10, 10);
        for (int i = 1; i < this.count + 1; i++) {
            gc.clearRect((this.startx) + (i * 50), (this.starty + (this.height / 2) - 5), 20, 20);
            new Face(gc, this.startx +  (i * 50), (this.starty - 120) + (this.height ) + 15 ).draw();
        }
    }

}
