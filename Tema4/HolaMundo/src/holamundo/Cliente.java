/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

/**
 *
 * @author Carlos
 */

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Cliente {

public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException, NotBoundException {
    
    ISaludo saludo;
    saludo = (ISaludo)Naming.lookup("rmi://localhost/Saludo"); // instanciar un objeto remoto
    System.out.println (saludo.HolaMundo());
      }
}
