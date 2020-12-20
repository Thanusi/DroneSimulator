package sample;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;



public class Controller {


    public int x = 200;
    public int y = 200;
    public Pane pane;
    Circle circle;

    public void initialize() {

        //Drawing circle
        Circle circle = new Circle();

        //Setting properties of the circle
        moveCircle(circle);
        circle.setRadius(20);
        pane.getChildren().addAll(circle);
    }

    public Controller() {
        ServerThread s = new ServerThread();
        s.controller = this;
        s.start();
    }

    public void moveCircle(Circle circle) {
        this.circle.setCenterX(x);
        this.circle.setCenterY(y);
        }
}
