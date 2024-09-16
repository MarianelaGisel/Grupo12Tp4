
package grupo12tp4;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class Alumno {
    //Atributos
    private int nroLegajo;
    private String apellido;
    private String nombre;
    
    static HashSet <Materia> materias = new HashSet (); //hashSet especial para el Alumno
    

    //Constructor
    public Alumno(int legajo, String apellido, String nombre) {
        this.nroLegajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = materias;
    }

    //Metodos getter
    public int getLegajo() {
        return nroLegajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    //Metodos setter
    public void setLegajo(int legajo) {
        this.nroLegajo = legajo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
  
    
   //Un alumno puede inscribirse a 'muchas' materias distintas.
   public void agregarMateria(Materia materia) {
      if(materias.add(materia))
          JOptionPane.showMessageDialog(null,"El alumno se inscribio correctamente");
      else
          JOptionPane.showMessageDialog(null, "El alumno ya se encuentra inscripto en esa materia");
   }

   
   public int cantidadMaterias (){
       return materias.size(); //tamaño de mi HashSEet
   
   }
    
   
    //Modificamos el codigo toString para q nos muestre en el JComboBoxS
    @Override
    public String toString(){   
        return apellido+" "+nombre ;
    
    }
   
    
    @Override
    public int hashCode(){
        int hash= 7;
        hash = 29 *  hash + this.nroLegajo ;
        return hash;
  
    }
    
    
    //corregir bien
    
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        
        if(obj == null)
            return false;
        
        if(getClass() != obj.getClass())
            return false;
    
        final Alumno other = (Alumno) (obj);
        if(this.nroLegajo != other.nroLegajo){
            return false;
        }
        
        return true;
       
    }
    
    
    
   
}
