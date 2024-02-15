/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericio2;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ejericio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biblioteca biblioteca=new Biblioteca("Facultad de Tecnologia",220d);
        Scanner sc = new Scanner(System.in);

        int opcion = 0;


        while (opcion != 5) {
            System.out.println("*********************");
            System.out.println("1. Crear Armario");
            System.out.println("2. Añadir a la bibloteca");
            System.out.println("3. Crear libro");
            System.out.println("4. Cargar libro al armario");
            System.out.println("5. Salir");
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
                case 4:
                    System.out.print("el Factorial es " + Factorial(numero));
                    break;    
            }
        }
    }
    
}
