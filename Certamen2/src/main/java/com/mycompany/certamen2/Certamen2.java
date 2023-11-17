/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.certamen2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Certamen2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        Biblioteca biblioteca = new Biblioteca();
        
        while (opcion != 0) {
            System.out.println("Menu Principal");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Mostrar");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opcion: ");

            try {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 ->{
                        System.out.println("Si desea agregar un libro tipo novela ingrese 1.");
                        System.out.println("Si desea agregar un libro tipo PUCV ingrese 2.");
                        int aux = scanner.nextInt();
                        scanner.nextLine(); 

                        System.out.println("Id:");
                        int id = scanner.nextInt();
                        scanner.nextLine(); 

                        System.out.println("Titulo:");
                        String titulo = scanner.nextLine();

                        System.out.println("Autor:");
                        String autor = scanner.nextLine();

                        System.out.println("Precio:");
                        int precio = scanner.nextInt();
                        scanner.nextLine(); 

                        if (aux == 1) {
                            System.out.println("Tipo de novela:");
                            String tipo = scanner.nextLine();
                            biblioteca.agregarNovela(tipo, id, titulo, autor, precio);
                            System.out.println("Novela agregada con éxito.");
                        } else if (aux == 2) {
                            System.out.println("Escuela:");
                            String escuela = scanner.nextLine();
                            biblioteca.agregarPUCV(escuela, id, titulo, autor, precio);
                            System.out.println("Libro PUCV agregado con éxito.");
                        } else {
                            System.out.println("Opción no válida.");
                        }
                    }
                    
                    case 2 ->{
                        System.out.println("Ingrese id del libro:");
                        int id = scanner.nextInt();
                        Libro buscado = biblioteca.buscarLibro(id);
                        if(buscado != null)buscado.mostrar();
                        else System.out.println("Libro no encontrado");
                    }
                    
                    case 3 ->{
                        biblioteca.listarArray();
                    } 
                    case 0 ->{
                        System.out.println("Saliendo del sistema.........................................................");
                    }
                    default -> {
                        System.out.println("Opcion invalida");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor ingrese un número entero.");
                scanner.next(); 
            }
        }
        scanner.close();
    }
}
