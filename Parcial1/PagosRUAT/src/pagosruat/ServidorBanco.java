/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagosruat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Claudia
 */
public class ServidorBanco {

    public static void main(String[] args) {

        final int SERVER_PORT = 65000; //puerto

        iniciarServidorTCP(SERVER_PORT); //tcp

    }

    private static void iniciarServidorTCP(int port) {//funcionara como servidor tcp

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Servidor del Banco esperando conexiones TCP en el puerto " + port + "...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    //   System.out.println("Cliente TCP conectado: " + clientSocket.getInetAddress().getHostAddress());

                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                    // leer el comando del cliente
                    String commando = in.readLine();
                    //System.out.println("Comando TCP recibido: " + command);

                    // procesar el comando y enviar una respuesta
                    String response = procesarComando(commando);
                    out.println(response);
                }
            }
        } catch (IOException e) {
        }

    }

    private static String pagarDeuda(Deuda deuda) {

        return "Transacción:true";
    }

    private static String procesarComando(String comando) {
        String respuesta = "";
        String comandos[] = comando.split(":");
        IRuat ruat;
        try {
            ruat = (IRuat) Naming.lookup("rmi://localhost/Ruat");

            if (comandos[0].equals("Deuda")) {
                ArrayList<Deuda> deudas = ruat.buscarDeudas(comandos[1]);
                for (Deuda deuda : deudas) {
                    respuesta += deuda.getAnio() + "," + deuda.getImpuesto().toString() + "," + deuda.getMonto() + ";";

                }
                respuesta = respuesta.substring(0, respuesta.length() - 1);
                return "deudas:"+respuesta;
            }
            if (comandos[0].equals("Pagar")) {
                String[] valores=comandos[1].split(",");
                Deuda deuda=new Deuda(valores[0],Integer.valueOf(valores[1]),Impuesto.valueOf(valores[2]),Double.valueOf(valores[3]));
                if (ruat.pagarDeuda(deuda)) {
                    return "resultado:true";
                }
                else {
                    return "resultado:false";
                }
                
            }
            
        } catch (NotBoundException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "";
    }
}
