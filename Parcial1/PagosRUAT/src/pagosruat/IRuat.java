/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pagosruat;

/**
 *
 * @author Claudia
 */

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;



public interface IRuat extends Remote { //se extiende de remote
    ArrayList<Deuda> buscarDeudas(String ci) throws RemoteException; //Tiene los metodos que vamos a implemnetar
    boolean pagarDeuda(Deuda deuda) throws RemoteException;
}

