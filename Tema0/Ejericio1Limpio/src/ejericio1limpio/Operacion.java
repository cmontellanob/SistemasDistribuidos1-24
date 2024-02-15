/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericio1limpio;

/**
 *
 * @author Carlos
 */
public class Operacion {
    private int n;
    public Operacion(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public int Fibonacci() {
        return calcularFibonacci(getN());
    }
    public int Factorial() {
        return calcularFactorial(getN());

    }
    private int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
    private int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}
