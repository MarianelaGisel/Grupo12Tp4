
package grupo12tp4.colegio;

import java.util.HashSet;
import javax.swing.JOptionPane;


public class Alumno {
    //Atributo
    private int nroLegajo;
    private String apellido;
    private String nombre;
    private HashSet <Materia> materias = new HashSet<>(); //static
    
    //Constructor
    public Alumno(int nroLegajo, String apellido, String nombre) {
        this.nroLegajo = nroLegajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }
  
    //metodos getter
    public int getNroLegajo() {
        return nroLegajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }
    
    //metodos setter
    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }
    
   //cargar materia
   public void cargarMaterias(Materia materia){
     if(materias.add(materia))
         //JOptionPane.showMessageDialog(null, "Materia registrada con exito");
           System.out.println("El alumno "+apellido+ " se inscribio correctamente a la materia: "+materia);
     else
         //JOptionPane.showMessageDialog(null, "La materia ya se encuentra registrada");
           System.out.println("El alumno "+apellido+" ya se encuentra inscripto en la materia: "+materia);
   }
   
   public int cantidadMaterias (){
       return materias.size(); //tamaño de mi HashSEet
   
   }
   
  
   @Override
    public String toString(){
        return apellido+" "+nombre;
    
    }
    
  
   @Override
    public int hashCode(){
       int hash = 7;
       hash = 29 * hash + this.nroLegajo;
       return hash;
   }
   
   //sobrescribimos el metodo 'equals'
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;  
        
        if(obj == null)
            return false;
        
        if(getClass() != obj.getClass())
            return false;
    
        //sentencia opcional
        final Alumno other = (Alumno) obj;
        if(this.nroLegajo != other.nroLegajo){
            return false;
        }
        //fin sentencia opcional
        
        
        return true;
    }
   
   
    
    
}
