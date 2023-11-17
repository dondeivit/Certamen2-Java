/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

/**
 *
 * @author Estudiante
 */
public class Novela extends Libro {
    private String tipo;

    public Novela(String tipo, int id, String titulo, String autor, int precio) {
        super(id, titulo, autor, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //Sobrescritura
    @Override
    public void mostrar()
    {
        super.mostrar();
        System.out.println("Tipo: " + this.tipo);
    }
    
}
