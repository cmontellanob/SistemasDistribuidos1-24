/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericio2;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Armario {
   TipoArmario tipoArmario;
   String codigo;
   ArrayList<Libro>listaLibros;

    public Armario(TipoArmario tipoArmario, String codigo, ArrayList<Libro> listaLibros) {
        this.tipoArmario = tipoArmario;
        this.codigo = codigo;
        this.listaLibros = listaLibros;
    }

    public TipoArmario getTipoArmario() {
        return tipoArmario;
    }

    public void setTipoArmario(TipoArmario tipoArmario) {
        this.tipoArmario = tipoArmario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    @Override
    public String toString() {
        return "Armario{" + "tipoArmario=" + tipoArmario + ", codigo=" + codigo + ", listaLibros=" + listaLibros + '}';
    }
    public void addLibro(Libro libro)
    {
        this.listaLibros.add(libro);
    }
}
