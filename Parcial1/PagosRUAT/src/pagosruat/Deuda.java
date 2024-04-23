/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagosruat;

import java.io.Serializable;

/**
 *
 * @author Claudia
 */
public class Deuda implements Serializable {//clase cuenta
    private String CI;
    private int Anio;
    private Impuesto Impuesto;
    private double Monto;

    public Deuda(String CI, int Anio, Impuesto Impuesto, double Monto) {//constructor con parametros
        this.CI = CI;
        this.Anio = Anio;
        this.Impuesto = Impuesto;
        this.Monto = Monto;
    }

    public String getCI() {//getters
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

    public Impuesto getImpuesto() {
        return Impuesto;
    }

    public void setImpuesto(Impuesto Impuesto) { //setters
        this.Impuesto = Impuesto;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    @Override
    public String toString() {//toString
        return "Deuda{" +
                "CI='" + CI + '\'' +
                ", Anio=" + Anio +
                ", Impuesto=" + Impuesto +
                ", Monto=" + Monto +
                '}';
    }
}
