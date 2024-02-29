/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatclienteservidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class ServerChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int port = 5004;
        ServerSocket server;
        Scanner sc = new Scanner(System.in);
        try {

            server = new ServerSocket(port);
            System.out.println("Se inicio el servidor con éxito");
            while (true) {
                Socket client;
                PrintStream toClient;
                client = server.accept(); //conexion entre cliente y servidor para comunicacion bidireccional
                BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
                System.out.println("Cliente se conecto");
                String recibido = fromClient.readLine();
                while (!recibido.contentEquals("Salir")) {
                    System.out.println("Cliente:"+recibido);
                    toClient = new PrintStream(client.getOutputStream());
                    System.out.print("Servidor:");
                    String respuesta = sc.nextLine();
                    toClient.println(respuesta);
                    recibido = fromClient.readLine();
                }
                //toClient.println("Salir");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
