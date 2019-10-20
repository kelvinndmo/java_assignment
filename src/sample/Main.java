package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
    Canvas canvas = new Canvas(1280, 800);
    GraphicsContext gc = canvas.getGraphicsContext2D();


    private void drawTable(Integer x, Integer y,  Integer count, Integer w, Integer h) {
        Tabel table = new Tabel(this.gc, x, y, count, w, h);
        table.draw();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setFullScreen(true);
        Pane root = new Pane();

        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");
        this.gc.setFill(Color.GRAY);

        this.drawTable(50, 50, 4, 300, 50);
        this.drawTable(50, 150, 4, 300, 50);
        this.drawTable(50, 250, 4, 300, 50);
        this.drawTable(50, 350, 4, 300, 50);
        this.drawTable(400, 150, 2, 200, 50);
        this.drawTable(400, 50, 3, 200, 50);
        this.drawTable(800, 150, 2, 200, 50);
        this.drawTable(800, 50, 3, 200, 50);
        this.drawTable(800, 250, 2, 200, 50);
        this.drawTable(1100, 50, 2, 150, 50);
        this.drawTable(1100, 150, 2, 150, 50);
        this.drawTable(1100, 250, 2, 150, 50);
        this.drawTable(1100, 350, 2, 150, 50);



//        this.drawTable(50, 300, 2, 200, 50);
        this.drawTable(400, 250, 2, 200, 50);
        this.drawTable(400, 350, 10, 600, 50);
        this.drawTable(10, 10, 0, 1000, 20);
        this.drawTable(1100, 10, 0, 100, 20);

        this.drawTable(50, 600, 0, 20, 100);
        this.drawTable(50, 750, 0, 500, 20);
        this.drawTable(600, 750, 0, 400, 20);


        root.getChildren().add(canvas);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);


        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
