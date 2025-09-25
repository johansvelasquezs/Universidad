package model;

import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private int numeroEstudiantes;
    private Arraylist <Materia> listaMaterias;

    public Carrera(String nombre, int numeroEstudiantes) {
        this.nombre = nombre;
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }
    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", numeroEstudiantes=" + numeroEstudiantes +
                '}';
    }
}
