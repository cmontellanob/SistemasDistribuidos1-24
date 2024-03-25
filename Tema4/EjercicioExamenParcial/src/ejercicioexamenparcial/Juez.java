/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioexamenparcial;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class Juez {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        IAsfi asfi;
        ArrayList<Cuenta> lista = null;
        String ci = "";
        String nombres = "";
        String apellidos = "";
        try {
            asfi = (IAsfi) Naming.lookup("rmi://localhost/ASFI"); // instanciar un objeto remoto

            int op = 0;
            while (op != 3) {
                System.out.println("1.- Consultar Cuentas");
                System.out.println("2.- Retener Monto ");
                System.out.println("3.- Salir ");
                System.out.println("Elija opcion ");
                op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Introduzca ci");
                        ci = sc.nextLine();
                        System.out.println("Introduzca nombres");
                        nombres = sc.nextLine();
                        System.out.println("Introduzca apellidos");
                        apellidos = sc.nextLine();
                        lista = asfi.ConsultarCuentas(ci, nombres, apellidos);
                        break;
                    case 2:
                        if (lista != null) {
                            int i = 1;
                            for (Cuenta c : lista) {
                                System.out.println(i+".- Banco: " + c.getBanco().toString() +" cuenta: "+ c.getNrocuenta()+" "+c.getSaldo());
                                i++;
                            }
                            System.out.println("Introduzca el numero de cuenta que quiere retener");
                            int op_retener = sc.nextInt();
                            Cuenta cuenta = lista.get(op_retener-1);
                            System.out.println("Introduzca el monto a retener");
                            double monto_retener = sc.nextDouble();
                            System.out.println("Introduzca la glosa explicando el motivo de la retención");
                            String glosa_retener = sc.nextLine();

                            if (asfi.RetenerMonto(cuenta, monto_retener, glosa_retener)) {
                                System.out.println("se Retuvo el monto con exito");
                            } else {
                                System.out.println("NO es posible retener el monto con exito");
                            }

                        }
                        break;
                }

            }

        } catch (NotBoundException ex) {
            Logger.getLogger(Juez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Juez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Juez.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
