/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexamenparcial;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author Carlos
 */
public class ServerMercantil {

    public static void main(String args[]) {
        int port = 6789;
        try {

            DatagramSocket socketUDP = new DatagramSocket(port);
            byte[] bufer = new byte[1000];

            while (true) {
                // Construimos el DatagramPacket para recibir peticiones
                DatagramPacket peticion
                        = new DatagramPacket(bufer, bufer.length);

                // Leemos una petición del DatagramSocket
                socketUDP.receive(peticion);
                // lo recibido
                String cadena = new String(peticion.getData());

                String cuentas = buscarCuentas(cadena);
                String response = cuentas;
                byte[] mensaje = response.getBytes();

                DatagramPacket respuesta
                        = new DatagramPacket(mensaje, response.length(),
                                peticion.getAddress(), peticion.getPort());

                // Enviamos la respuesta, que es un eco
                socketUDP.send(respuesta);
            }

        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }

    public static String buscarCuentas(String solicitud) {
        String cuentas = "";
       
        String[] comandos = solicitud.split(":");
        String[] datos = comandos[1].split("-");

        if (datos[0].equals("7687682") && datos[1].equals("Juan") && datos[2].equals("Segobia")) {
            cuentas = "1112450-5000";
            return cuentas;
        }
        if (datos[0].equals("54654") && datos[1].equals("Maria") && datos[2].equals("Parra")) {
            cuentas = "1121454-300";
            return cuentas;
        }

        return "no:encontrado";
    }

}
