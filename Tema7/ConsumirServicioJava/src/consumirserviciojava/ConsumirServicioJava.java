/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumirserviciojava;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class ConsumirServicioJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner (System.in);
        System.out.println("Introduzca a");
        int a=sc.nextInt();
        System.out.println("Introduzca b");
        int b=sc.nextInt();
        
        int c=sumar(a,b);
        System.out.println("La Suma es:"+c);
        c=restar(a,b);
        System.out.println("La Resta es:"+c);
        
        
    }

    private static int sumar(int a, int b) {
        consumirserviciojava.WebService service = new consumirserviciojava.WebService();
        consumirserviciojava.WebServiceSoap port = service.getWebServiceSoap12();
        return port.sumar(a, b);
    }

    private static int restar(int a, int b) {
        consumirserviciojava.WebService service = new consumirserviciojava.WebService();
        consumirserviciojava.WebServiceSoap port = service.getWebServiceSoap();
        return port.restar(a, b);
    }

    private static int multiplicar(int a, int b) {
        consumirserviciojava.WebService service = new consumirserviciojava.WebService();
        consumirserviciojava.WebServiceSoap port = service.getWebServiceSoap();
        return port.multiplicar(a, b);
    }

    private static int dividir(int a, int b) {
        consumirserviciojava.WebService service = new consumirserviciojava.WebService();
        consumirserviciojava.WebServiceSoap port = service.getWebServiceSoap();
        return port.dividir(a, b);
    }
    
    
}
