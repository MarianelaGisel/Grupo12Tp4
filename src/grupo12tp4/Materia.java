
package grupo12tp4;

public class Materia {
    
    private int idMateria;
    private String nombreMateria;
    private int año;

    public Materia(int idMateria, String nombreMateria, int año) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.año = año;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public int getAño() {
        return año;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
}
