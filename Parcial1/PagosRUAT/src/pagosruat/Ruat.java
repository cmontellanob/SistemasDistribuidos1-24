/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagosruat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Claudia
 */
public class Ruat extends UnicastRemoteObject implements IRuat {//implementa la interfaz con los metodos remotos

    public Ruat() throws RemoteException {
        super();
    }

    @Override
    public ArrayList<Deuda> buscarDeudas(String ci) throws RemoteException { //metoodo remoto

        ArrayList<Deuda> deudas = new ArrayList<>();

        if (ci.equals("1234567")) {
            deudas.add(new Deuda("1234567", 2022, Impuesto.VEHICULO, 2451.0));
            deudas.add(new Deuda("1234567", 2022, Impuesto.INMUEBLE, 2500.0));
        }
        if (ci.equals("5555587")) {
            deudas.add(new Deuda("5555587", 2021, Impuesto.VEHICULO, 5000.0));
        }
        if (ci.equals("333357")) {
            deudas.add(new Deuda("333357", 2023, Impuesto.INMUEBLE, 24547));
        }

        return deudas;
    }

    @Override
    public boolean pagarDeuda(Deuda deuda) throws RemoteException {
        int puerto = 6789;

        String dato = "consulta:" + deuda.getCI();
        String ip = "localhost";
        DatagramSocket socketUDP;
        try {
            socketUDP = new DatagramSocket();
     
        byte[] mensaje = dato.getBytes();
        InetAddress hostServidor = InetAddress.getByName(ip);

        // Construimos un datagrama para enviar el mensaje al servidor
        DatagramPacket peticion
                = new DatagramPacket(mensaje, dato.length(), hostServidor,
                        puerto);

        // Enviamos el datagrama
        socketUDP.send(peticion);

        // Construimos el DatagramPacket que contendrá la respuesta
        byte[] bufer = new byte[1000];
        DatagramPacket respuesta
                = new DatagramPacket(bufer, bufer.length);
        socketUDP.receive(respuesta);

        String res = new String(respuesta.getData());
        String[] comando2 = res.split(":");

        // Cerramos el socket
        socketUDP.close();
        if (comando2[1].equals("true")) {
            return true;
        } else {
            return false;
        }
           } catch (SocketException ex) {
            Logger.getLogger(Ruat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ruat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
