package sample;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerThread extends Thread {

    public Controller controller;

    @Override
    public void run() {
        System.out.println("Starting Server");


        try {
            // creating socket
            DatagramSocket socket = new DatagramSocket(8000);

            while (true){


                // prepare packet
                byte [] bytes =new byte[256];
                DatagramPacket packet = new DatagramPacket(bytes, 256);

                // receive message
                // this is a blocking command - this is why we need a thread
                socket.receive(packet);

                // get message from packet
                String message = new String(packet.getData());
                System.out.println(message);

                if (message.contains("UP")){
                    controller.y = controller.y -10;
                    controller.moveCircle(controller.circle);
                    }

                if (message.contains("DOWN")){
                    controller.y = controller.y +10;
                    controller.moveCircle(controller.circle);
                }

                if (message.contains("LEFT")){
                    controller.x = controller.x -10;
                    controller.moveCircle(controller.circle);
                }

                if (message.contains("RIGHT")){
                    controller.x = controller.x + 10;
                    controller.moveCircle(controller.circle);
                }
            }

        } catch (SocketException e) {
            System.out.println("SORRY COULD NOT CREATE SOCKET");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
      }
    }

