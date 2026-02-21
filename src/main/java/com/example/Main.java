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
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();
        CuentaBancaria cuenta1 = new CuentaBancaria("Maria", 500);
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo inicial: " + cuenta1.getSaldo());
        System.out.println();
        System.out.println("Depositando 500...");
        cuenta1.depositar(200);
        System.out.println(cuenta1.getSaldo());
        System.out.println();
        System.out.println("Retirando 200...");
        cuenta1.retirar(1000);
        System.out.println(cuenta1.getSaldo());
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();
        Estudiante estudiante1 = new Estudiante("Cristian", 10, 2.5);
        System.out.println();
        estudiante1.mostrarInfo();

    }
}