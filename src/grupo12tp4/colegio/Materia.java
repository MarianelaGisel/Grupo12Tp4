
package grupo12tp4.colegio;

public class Materia {
    //Atributos
    private int idMateria ; 
    private String nombreMateria;
    private int anio ;
   
    
    //Constructor
    public Materia(int idMateria, String nombreMateria, int anio) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.anio = anio;
    }
    
    //Metodos getter
    public int getIdMateria() {
        return idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public int getAnio() {
        return anio;
    }

    //Metodos setter
    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    //sobrescribimos el metodo o
    @Override
    public String toString(){
        return nombreMateria;
    
    }
    
    
    
    //sobresScribimos el metodo 'hashCode'
    @Override
    public int hashCode(){
       int hash = 5;
       hash = 89 * hash + this.idMateria;
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
    
        final Materia other = (Materia) obj;
        if(this.idMateria != other.idMateria){
            return false;
        }
        return true;
    }
    
    
}
