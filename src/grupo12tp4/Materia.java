
package grupo12tp4;

public class Materia {
    
    //Atributos
    private int idMateria;
    private String nombreMateria;
    private int año;

    //Constructor
    public Materia(int idMateria, String nombreMateria, int año) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.año = año;
    }

    //Metodos getter
    public int getIdMateria() {
        return idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public int getAnio() {
        return año;
    }

    //Metodos setter
    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
    //Sobrescribimos los metodos 'hashCode()' y 'equals()' que trabajan en conjunto y son de la clase Object
    
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 29 * hash + this.idMateria ;
        
        return hash ;
    }
    
    /*Revisar bien para que me deje seleccionar el combobox*/
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true; // Si es el mismo objeto, son iguales
        
        if(obj == null)
            return false; // Si el objeto comparado es nulo, no son iguales
    
        if(getClass()!= obj.getClass())
            return false; // Si son de clases diferentes, no son iguales
    
        /*Esta linea de codigo si no se 'coloca' no nos dejara seleccionar libremente los valores del ComboBox.*/
        final Materia other = (Materia) (obj);
        if (this.idMateria != other.idMateria){
            return false;
        }/*fin linea de codigo importante.*/
        return true;
    }
    
    
     //Modificamos el codigo toString para q nos muestre en el JComboBoxS
    @Override
    public String toString(){
        
        return nombreMateria;
    
    }
    
}
