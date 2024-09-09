
package grupo12tp4.colegio;


public class Colegio {

   
    public static void main(String[] args) {
      //Creas 3 materias (con el molde Materia)
       Materia ingles = new Materia (01,"Ingles I",1);   //materia 1, datos cargados []
       Materia matematica = new Materia (02,"Matematica",1); //materia 2
       Materia laboratorio= new Materia (03, "Laboratorio I",1); //materia 3
      
       //Creamos 2 Alumnos (con el molde Alumno)
       Alumno almuno1 = new Alumno (1001,"Lopez", "Martin"); //usa el molde Alumno
       Alumno alumno2 = new Alumno(1002,"Martinez","Brenda"); //usa el molde Alumno
       
   
       //Inscribimos a Lopez en las 3 materias
       almuno1.cargarMaterias(ingles);
       almuno1.cargarMaterias(matematica);
       almuno1.cargarMaterias(laboratorio);
       
       //Inscribir a Martinez en las 3 materias y volver a inscribirlo a Laboratorio 1
       alumno2.cargarMaterias(matematica);
       alumno2.cargarMaterias(ingles);
       alumno2.cargarMaterias(laboratorio);
       alumno2.cargarMaterias(laboratorio);
       
    }
    
}
