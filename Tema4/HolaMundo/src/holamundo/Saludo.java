/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Carlos
 */
public class Saludo extends UnicastRemoteObject implements ISaludo  {
  
    public Saludo() throws RemoteException
    {
        super();
    }
    
    @Override
    public String HolaMundo() throws RemoteException {
        return "Hola Mundo en SIS258 con RMI";
    }

  
    
}
