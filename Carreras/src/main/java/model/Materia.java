package co.edu.uniquindio.poo.Java.Java.Java.Java.java.model.Carrera;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    private String codigo;
    private String horasSemana;
    private int creditos;
    private String semestre;
    private ArrayList <Profesor> listaProfesores;

    public Materia(String nombre, String codigo, String horasSemana, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.horasSemana = horasSemana;
        this.creditos = creditos;
        this.listaProfesores = new ArrayList();
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(String horasSemana) {
        this.horasSemana = horasSemana;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(ArrayList<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", horasSemana='" + horasSemana + '\'' +
                ", creditos=" + creditos +
                ", semestre='" + semestre + '\'' +
                ", listaProfesores=" + listaProfesores +
                '}';
    }
}
