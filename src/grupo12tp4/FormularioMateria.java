
package grupo12tp4;

import java.util.HashSet;
import javax.swing.JOptionPane;


public class FormularioMateria extends javax.swing.JInternalFrame {
    // variable que contendra la direccion de memoria de 'materias' original
    private HashSet <Materia> materias; //va apuntar la direccion de memoria de 'materias' orignal
    
   
    //Constructor
    public FormularioMateria(HashSet <Materia> materias) {
        initComponents();
        this.materias = materias;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlFormularioMaterias = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtCodigoMateria = new javax.swing.JTextField();
        jtNombreMateria = new javax.swing.JTextField();
        jtAnioPertenece = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setClosable(true);

        jlFormularioMaterias.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlFormularioMaterias.setForeground(new java.awt.Color(0, 153, 204));
        jlFormularioMaterias.setText("Formulario de Materias");

        jLabel2.setText("Codigo de la materia: ");

        jLabel1.setText("Nombre de la materia: ");

        jLabel3.setText("Año al que pertenece:");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtCodigoMateria)
                                            .addComponent(jtNombreMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtAnioPertenece, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jlFormularioMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlFormularioMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtCodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtAnioPertenece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    //(a)Boton 'guardar'
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       if(jtCodigoMateria.getText().isEmpty() || jtNombreMateria.getText().isEmpty() || jtAnioPertenece.getText().isEmpty())
          JOptionPane.showMessageDialog(this,"Por favor, complete los campos");
       else{
       try{
           //1.Extramos los datos de los tres campos TextField
           int codigoM= Integer.parseInt(jtCodigoMateria.getText()); //convertimos un numero String a un int.
           String nombreMateria = jtNombreMateria.getText();
           int anio = Integer.parseInt(jtAnioPertenece.getText());
       
           //2. Creamos un tipo Materia y agregamos esos datos
           Materia m = new Materia (codigoM, nombreMateria, anio);
           
           //3.Agregamos a la materia
           if(materias.add(m))
               JOptionPane.showMessageDialog(this, "Materia registrada con exito");
           else
               JOptionPane.showMessageDialog(this, "La materia ya se encuentra registrada");
       
           //4.Limpiamos los tres campos TextFaild
           jtCodigoMateria.setText("");
           jtNombreMateria.setText("");
           jtAnioPertenece.setText("");
       }catch(NumberFormatException nf){
           JOptionPane.showMessageDialog(this, "Codigo Materia debe ser un numero");
           jtCodigoMateria.setText("");
           jtNombreMateria.setText("");
           jtAnioPertenece.setText("");
     
       }//fin catch         
       }//fin else   
    }//GEN-LAST:event_jbGuardarActionPerformed

    
    //(b)Boton 'Nuevo'
    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jtCodigoMateria.setText("");
        jtNombreMateria.setText("");
        jtAnioPertenece.setText("");
    }//GEN-LAST:event_jbNuevoActionPerformed

    
    
    //(c)Botono 'Salir'
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
        
        
    }//GEN-LAST:event_jbSalirActionPerformed


    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlFormularioMaterias;
    private javax.swing.JTextField jtAnioPertenece;
    private javax.swing.JTextField jtCodigoMateria;
    private javax.swing.JTextField jtNombreMateria;
    // End of variables declaration//GEN-END:variables


    //(a)Metodo para cargar materias (desde el Main)
    public void cargarMateria(Materia materia){
        jtCodigoMateria.setText(materia.getIdMateria()+""); //Probar
        jtNombreMateria.setText(materia.getNombreMateria());
        jtAnioPertenece.setText(materia.getAnio()+""); // "", para que lo tome como un string
        
        
    }

}
