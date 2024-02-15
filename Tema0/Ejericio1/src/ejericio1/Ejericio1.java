/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericio1;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ejericio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
                    break;
                case 2:
                    System.out.print("el fibonacci es " + Fibonacci(numero));
                    break;
                case 3:
                    System.out.print("el Factorial es " + Factorial(numero));
                    break;
            }
        }

        //011235
        // TODO code application logic here
    }

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int f = 1;

            int f0 = 0;
            int f1 = 1;
            for (int i = 2; i <= n; i++) {
                f = f0 + f1;
                f0 = f1;
                f1 = f;
            }
            return f;
        }
    }

    public static int Factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
}
