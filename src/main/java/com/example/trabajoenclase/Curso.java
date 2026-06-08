package com.example.trabajoenclase;

import java.util.Random;

public  final class Curso {

    private final String nombre;
    private final int maxalumnos;
    private final int inscritos;
    public Curso(String nombre, int inscritos) {
        this.nombre = nombre;

        Random random = new Random();
        int capacidad = random.nextInt(16)+20;
        this.maxalumnos=capacidad;
        if (inscritos>capacidad) {
            System.out.println("Los Alumnos inscritos superan la capacidad maxima");
            this.inscritos=capacidad;
        }else{
            this.inscritos=inscritos;
        }
    }
    public String getNombre() {
        return nombre;
    }
    public int getMaxalumnos() {
        return maxalumnos;
    }
    public int getInscritos() {
        return inscritos;
    }
    @Override
    public String toString() {
        return "Curso: Nombre= " + nombre + ", Inscritos= " + inscritos + ", Capacidad Maxima= " + maxalumnos + "";
    }

    
}
