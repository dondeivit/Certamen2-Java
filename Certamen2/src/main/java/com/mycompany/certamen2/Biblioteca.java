/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Biblioteca {
    private ArrayList<Libro> libros;
    

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    
    public Libro buscarLibro(int id)
    {
        for(int i= 0; i < this.libros.size(); i++)
        {
            if(id == this.libros.get(i).getId())
                return libros.get(i);
        }
       return null;
    }
    
    public void agregarNovela(String tipo,int id, String titulo, String autor, int precio)
    {
        Novela novela = new Novela(tipo,id,titulo,autor,precio);
        libros.add(novela);
    }
    
    public void agregarPUCV(String escuela, int id, String titulo, String autor, int precio)
    {
        LibroPUCV libro = new LibroPUCV(escuela,id,titulo,autor,precio);
        libros.add(libro);
    }
    
    public void listarArray()
    {
        for(Libro lib : libros)
        {
            lib.mostrar();
            System.out.println("-----------------------------------------");
        }
    }
}
