package sample;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;



public class Controller {


    public int x = 200;
    public int y = 200;
    public Pane pane;
    Circle circle;    public void initialize() {
        //Drawing a Circle
        circle = new Circle();


        //Setting the properties of the circle
        moveCircle(circle);
        circle.setRadius(20);


        pane.getChildren().add(circle);
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
