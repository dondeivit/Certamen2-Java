/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

/**
 *
 * @author Estudiante
 */
public class LibroPUCV extends Libro{
    private String escuela;

    public LibroPUCV(String escuela, int id, String titulo, String autor, int precio) {
        super(id, titulo, autor, precio);
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    
    //Sobrescritura
    @Override
    public void mostrar()
    {
        super.mostrar();
        System.out.println("Escuela:" + this.escuela);
    }
}
