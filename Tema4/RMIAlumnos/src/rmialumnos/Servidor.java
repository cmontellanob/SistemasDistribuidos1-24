/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmialumnos;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;



/**
 *
 * @author Carlos
 */
public class Servidor {
    
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException {
    
    RegistroAlumnos registro=new RegistroAlumnos();
    LocateRegistry.createRegistry(1099); //levantar el servidor de registro;
    Naming.bind("RegistroAlumnos",registro);
            
       
        
    }
    
    
}
