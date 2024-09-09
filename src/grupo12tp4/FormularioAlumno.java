
package grupo12tp4;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class FormularioAlumno extends javax.swing.JInternalFrame {
    //Creamos una variable que referencia a un 'HashSet <Alumno>'
    private HashSet <Alumno> alumnos;
   
    
    
    //Constructor (pasamos nuestro: HashSet<Alumno>)
    public FormularioAlumno(HashSet<Alumno> alumnos) {
        initComponents();
        this.alumnos = alumnos ; // 'this.alumnos' tiene la direccion de memoria de 'alumnos' original.
        
    }
 
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBAgregarAlumno = new javax.swing.JButton();
        jTfLegajo = new javax.swing.JTextField();
        jTfApellido = new javax.swing.JTextField();
        jTfNombreAlumno = new javax.swing.JTextField();
        jbNuevoAlumno = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Formulario de Alumnos");

        jLabel2.setText("N° legajo:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Nombre:");

        jBAgregarAlumno.setText("Guardar");
        jBAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarAlumnoActionPerformed(evt);
            }
        });

        jbNuevoAlumno.setText("Nuevo");
        jbNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoAlumnoActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jBAgregarAlumno)
                        .addGap(18, 18, 18)
                        .addComponent(jbNuevoAlumno)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTfLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTfNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregarAlumno)
                    .addComponent(jbNuevoAlumno)
                    .addComponent(jbSalir))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //(a)Boton 'Guardar' de Formulario de Alumnos.
    private void jBAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarAlumnoActionPerformed
    
    //control 'guardar datos vacios
    if(jTfLegajo.getText().isEmpty() || jTfApellido.getText().isEmpty() || jTfNombreAlumno.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Por favor, complete los campos");
    }
    else {  
        
    try{ 
        int legajo = Integer.parseInt(jTfLegajo.getText()); // nro Legajo
        String apellidoalumno = jTfApellido.getText(); // Apellido
        String nombrealumno = jTfNombreAlumno.getText(); // Nombre 
        Alumno al = new Alumno (legajo,nombrealumno,apellidoalumno); // 'guardamos' datos del Alumno
        
        //agregamos al Alumno
        if(alumnos.add(al))
            JOptionPane.showMessageDialog(this, "Alumno registrado con exito");
        else
            JOptionPane.showMessageDialog(this, "El alumno ya esta registrado");
        // el id nunca se repite, el apellido y nombre si? PREGUNTAR
    
        //limpiamos los textField
        jTfLegajo.setText("");
        jTfApellido.setText("");
        jTfNombreAlumno.setText("");
       
    }catch(NumberFormatException nf){
        JOptionPane.showMessageDialog(this, "El legajo debe ser un numero"); 
        jTfLegajo.setText("");
        jTfApellido.setText("");
        jTfNombreAlumno.setText("");
     }
    } //fin else
    
    }//GEN-LAST:event_jBAgregarAlumnoActionPerformed

    

    //(b)Boton 'nuevo' en Formulario de Alumno
    private void jbNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoAlumnoActionPerformed
        jTfLegajo.setText("");
        jTfApellido.setText("");
        jTfNombreAlumno.setText("");
    
    }//GEN-LAST:event_jbNuevoAlumnoActionPerformed

    //(c)Boton 'salir' de ventana
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
      this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTfApellido;
    private javax.swing.JTextField jTfLegajo;
    private javax.swing.JTextField jTfNombreAlumno;
    private javax.swing.JButton jbNuevoAlumno;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables
}
