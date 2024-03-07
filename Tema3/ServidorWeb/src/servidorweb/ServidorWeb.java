/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servidorweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Carlos
 */
public class ServidorWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int port = 80;
       
            try {
                ServerSocket server = new ServerSocket(port);
                System.out.println("Se inicio el servidor");
                Socket client;
                PrintStream toClient;
                client = server.accept(); //conexion
                BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
                System.out.println("Cliente se conecto");
                String a=fromClient.readLine();
                while (a.length()>0)
                {
                System.out.println(a);
                a=fromClient.readLine();
                }
                toClient = new PrintStream(client.getOutputStream());
                toClient.println("HTTP-Version 1.1");
                toClient.println("Codigo");
                
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
    }
    
}
