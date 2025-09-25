package co.edu.uniquindio.poo.Java.Java.Java.Java.java.model.Carrera;

public class Posgrado extends Estudiante {
    private enum tipoCurso;
    private String temaInvestigacion;
    public Posgrado(enum tipoCurso, String temaInvestigacion) {
        this.curso = curso;
        this.temaInvestigacion = temaInvestigacion;
    }
    public Enum getCurso() {
        return curso;
    }
    public void setCurso(Enum curso) {
        this.curso = curso;
    }
    public String getTemaInvestigacion() {
        return temaInvestigacion;
    }
    public void setTemaInvestigacion(String temaInvestigacion) {
        this.temaInvestigacion = temaInvestigacion;
    }
    @Override
    public String toString(){
        return "Posgrado [curso=" + curso + ", temaInvestigacion=" + temaInvestigacion + "]";
    }

}
