
package grupo12tp4;

import java.util.HashSet;

public class Alumno {
    //Atributos
    private int legajo;
    private String apellido;
    private String nombre;
    
    static HashSet <Materia> materias = new HashSet ();
    static HashSet <Alumno> alumnos = new HashSet ();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = materias;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria (Materia m){
        materias.add(m);
    }
    public void contidadMaterias (){
        materias.size();
    }
}
