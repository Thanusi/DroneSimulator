package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.*;
//import javafx.scene.Group;
//import javafx.scene.paint.Color;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Drone Simulator");
        Scene scene = new Scene(root, 600, 675);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == javafx.scene.input.KeyCode.W){
                    try {
                        DatagramSocket socket = new DatagramSocket();
                        String mesasge = "UP";
                        DatagramPacket packet = new DatagramPacket(mesasge.getBytes(), mesasge.length(), InetAddress.getByName("127.0.0.1"), 4000);
                        socket.send(packet);

                    } catch (SocketException e) {
                        e.printStackTrace();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    //System.out.println("UP");
                }

                if (event.getCode() == javafx.scene.input.KeyCode.S){
                    try {
                        DatagramSocket socket = new DatagramSocket();
                        String mesasge = "DOWN";
                        DatagramPacket packet = new DatagramPacket(mesasge.getBytes(), mesasge.length(), InetAddress.getByName("127.0.0.1"), 4000);
                        socket.send(packet);

                    } catch (SocketException e) {
                        e.printStackTrace();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    //System.out.println("DOWN");
                }
                if (event.getCode() == javafx.scene.input.KeyCode.A){
                    try {
                        DatagramSocket socket = new DatagramSocket();
                        String mesasge = "LEFT";
                        DatagramPacket packet = new DatagramPacket(mesasge.getBytes(), mesasge.length(), InetAddress.getByName("127.0.0.1"), 4000);
                        socket.send(packet);

                    } catch (SocketException e) {
                        e.printStackTrace();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    //System.out.println("LEFT");
                }
                if (event.getCode() == javafx.scene.input.KeyCode.D){
                    try {
                        DatagramSocket socket = new DatagramSocket();
                        String mesasge = "RIGHT";
                        DatagramPacket packet = new DatagramPacket(mesasge.getBytes(), mesasge.length(), InetAddress.getByName("127.0.0.1"), 4000);
                        socket.send(packet);

                    } catch (SocketException e) {
                        e.printStackTrace();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    //System.out.println("RIGHT");
                }
            }
        });

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
     }
    }


