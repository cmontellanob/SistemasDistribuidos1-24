/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagosruat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Claudia
 */


public class ClienteBanco {
    public static void main(String[] args) {
        
        final String SERVER_HOST = "localhost";
       
        final int SERVER_PORT = 65000; // puerto
        
        try {
         
            try (Socket socket = new Socket(SERVER_HOST, SERVER_PORT)) {   //establece la conexión con el servidor.
              
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true); //enviar mensajes al servidor.
        
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//recibir mensajes del servidor.
                
  
                out.println("Deuda:1234567"); //comando al servidor para consultar las deudas CI específico.
             
                String response = in.readLine();
               
                System.out.println("Respuesta del servidor: " + response);
                
                out.println("Pagar:1234567,2022,Vehículo,1000");//Se envía un comando al servidor para pagar
                
                response = in.readLine();
            
                System.out.println("Respuesta del servidor: " + response);//mostar respuesta recibida servidor.
            }
        } catch (IOException e) {
        }
    }
}


