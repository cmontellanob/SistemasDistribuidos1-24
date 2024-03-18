/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmialumnos;

import java.io.Serializable;



/**
 *
 * @author Carlos
 */
public class Alumno implements Serializable {
    String nombres;
    String apellidos;
    String cedulaIdentidad;
    String carnetUniversitario;

    public Alumno(String nombres, String apellidos, String cedulaIdentidad, String carnetUniversitario) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedulaIdentidad = cedulaIdentidad;
        this.carnetUniversitario = carnetUniversitario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedulaIdentidad() {
        return cedulaIdentidad;
    }

    public void setCedulaIdentidad(String cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }

    public String getCarnetUniversitario() {
        return carnetUniversitario;
    }

    public void setCarnetUniversitario(String carnetUniversitario) {
        this.carnetUniversitario = carnetUniversitario;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", cedulaIdentidad=" + cedulaIdentidad + ", carnetUniversitario=" + carnetUniversitario + '}';
    }

   

    
    
    
}
