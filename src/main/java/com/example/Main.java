package com.example;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.mostrarDetalles();
        System.out.println();
        Libro libro2 = new Libro("Satanas", "Mario Mendoza");
        libro2.mostrarDetalles();
        System.out.println();
        Libro libro3 = new Libro("De mi, Para mi", "Nacarid Portal", 473);
        libro3.mostrarDetalles();
       
    }
}