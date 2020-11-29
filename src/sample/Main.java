package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.*;
import javafx.scene.shape.circle.*;



public class Main extends Application {
    private Object KeyCode;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Drawing a Circle
        //Circle circle = new Circle ();

        //Setting the properties of the circle
        Circle.setCenterX (300);
        Circle.setCenterY(135);
        Circle.setRadius(100);

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setScene(scene);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == javafx.scene.input.KeyCode.W){
                    try {
                        DatagramSocket socket = new DatagramSocket();
                        String mesasge = "UP";
                        DatagramPacket packet = new DatagramPacket(mesasge.getBytes(), mesasge.length(), InetAddress.getByName("127.0.0.1"), 8000);
                        socket.send(packet);

                    } catch (SocketException e) {
                        e.printStackTrace();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("UP");
                }

                if (event.getCode() == javafx.scene.input.KeyCode.S){
                    try {
                        DatagramSocket socket = new DatagramSocket();
                        String mesasge = "DOWN";
                        DatagramPacket packet = new DatagramPacket(mesasge.getBytes(), mesasge.length(), InetAddress.getByName("127.0.0.1"), 8000);
                        socket.send(packet);

                    } catch (SocketException e) {
                        e.printStackTrace();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("DOWN");
                }
                if (event.getCode() == javafx.scene.input.KeyCode.A){
                    try {
                        DatagramSocket socket = new DatagramSocket();
                        String mesasge = "LEFT";
                        DatagramPacket packet = new DatagramPacket(mesasge.getBytes(), mesasge.length(), InetAddress.getByName("127.0.0.1"), 8000);
                        socket.send(packet);

                    } catch (SocketException e) {
                        e.printStackTrace();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("LEFT");
                }
                if (event.getCode() == javafx.scene.input.KeyCode.D){
                    try {
                        DatagramSocket socket = new DatagramSocket();
                        String mesasge = "RIGHT";
                        DatagramPacket packet = new DatagramPacket(mesasge.getBytes(), mesasge.length(), InetAddress.getByName("127.0.0.1"), 8000);
                        socket.send(packet);

                    } catch (SocketException e) {
                        e.printStackTrace();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("RIGHT");
                }
            }
        });

        primaryStage.show();
    }


    public static void main(String[] args) {
        new ServerThread().start();

        launch(args);
    }
}
