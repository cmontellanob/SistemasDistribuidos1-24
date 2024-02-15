/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericio1limpio;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ejericio1Limpio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Operacion operacion=null;
        int opcion = 0;
        int numero = 0;

        while (opcion != 4) {
            System.out.println("*********************");
            System.out.println("1. Introducir n");
            System.out.println("2. Calcular el Fibonacci");
            System.out.println("3. Calcular el factorial");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca un numero");
                    numero = sc.nextInt();
                    operacion=new Operacion(numero);
                    break;
                case 2:
                    System.out.print("el fibonacci es " + operacion.Fibonacci());
                    break;
                case 3:
                    System.out.print("el Factorial es " + operacion.Factorial());
                    break;
            }
        }

    }
    
}
