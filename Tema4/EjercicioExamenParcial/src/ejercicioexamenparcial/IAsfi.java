/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicioexamenparcial;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public interface IAsfi extends Remote {
    public ArrayList<Cuenta> ConsultarCuentas (String ci,String nombres,String apellidos) throws RemoteException;
    public Boolean RetenerMonto(Cuenta cuenta,double montoBs,String glosa) throws RemoteException;

    
    
}
