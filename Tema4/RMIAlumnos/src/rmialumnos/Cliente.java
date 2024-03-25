/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmialumnos;

/**
 *
 * @author Carlos
 */

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Cliente {

public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException, NotBoundException {
    
    Scanner sc=new Scanner(System.in);
    IRegistroAlumnos registro;
    registro = (IRegistroAlumnos)Naming.lookup("rmi://localhost/RegistroAlumnos"); // instanciar un objeto remoto
    int opcion=0;
    while (opcion !=3)
    {
        System.out.println("1. Crear Alumno");
        System.out.println("2. Listar Alumnos");
        System.out.println("3. Salir");
        System.out.println("---------------------------");
        System.out.println("introduzca opcion");
        opcion=sc.nextInt();
        
        System.out.println("nombre:");
        
        
        String nombre=sc.nextLine();
    }
      }
}
