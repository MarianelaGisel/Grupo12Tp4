
package grupo12tp4;

import java.util.HashSet;


public class SistemaAlumnos extends javax.swing.JFrame {
    //HashSet Alumno y Materia
    public  HashSet<Alumno> alumnos = new HashSet<>();
    public  HashSet <Materia> materias = new HashSet<>();
    
    
    //constructor
    public SistemaAlumnos() {
        initComponents();
        this.setLocationRelativeTo(null) ;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlumno = new javax.swing.JMenu();
        jmAgregarAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemMateria = new javax.swing.JMenuItem();
        jMenuInscripcion = new javax.swing.JMenu();
        jmInscripcion = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jMenuAlumno.setText("Alumno");

        jmAgregarAlumno.setText("Agregar Alumno");
        jmAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarAlumnoActionPerformed(evt);
            }
        });
        jMenuAlumno.add(jmAgregarAlumno);

        jMenuBar1.add(jMenuAlumno);

        jMenu2.setText("Materia");

        jMenuItemMateria.setText("Agregar Materia");
        jMenuItemMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemMateria);

        jMenuBar1.add(jMenu2);

        jMenuInscripcion.setText("Registro");

        jmInscripcion.setText("Inscripcion");
        jmInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInscripcionActionPerformed(evt);
            }
        });
        jMenuInscripcion.add(jmInscripcion);

        jMenuBar1.add(jMenuInscripcion);

        jMenuSalir.setText("Salir");

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenuSalir.add(jmiSalir);

        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    //(a)Boton 'Agregar Alumno', paso 'alumnos'
    private void jmAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarAlumnoActionPerformed
       escritorio.removeAll();
       escritorio.repaint();
       FormularioAlumno fa = new FormularioAlumno (alumnos);
       fa.setVisible(true);
       escritorio.add(fa);
       escritorio.moveToFront(fa);
  
    }//GEN-LAST:event_jmAgregarAlumnoActionPerformed

    //(b)Boton 'Agregar Materia', paso 'materias'
    private void jMenuItemMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioMateria fm = new FormularioMateria(materias);
        fm.setVisible(true);
        escritorio.add(fm);
        escritorio.moveToFront(fm);
    }//GEN-LAST:event_jMenuItemMateriaActionPerformed

    
    //(c)Botono 'Registro', paso 'alumnos' y 'materias
    private void jmInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInscripcionActionPerformed
       escritorio.removeAll();
       escritorio.repaint();
       FormularioInscripcion fi = new FormularioInscripcion(alumnos,materias);
       fi.setVisible(true);
       escritorio.add(fi);
       escritorio.moveToFront(fi);
        
    
    }//GEN-LAST:event_jmInscripcionActionPerformed

    //(d)Boton 'Salir'
    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        this.dispose(); //Cierra el JInternalFrame
        
        
        
    }//GEN-LAST:event_jmiSalirActionPerformed

    
   
    
    
    
    
    
    
    //Main
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAlumno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInscripcion;
    private javax.swing.JMenuItem jMenuItemMateria;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenuItem jmAgregarAlumno;
    private javax.swing.JMenuItem jmInscripcion;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables



}
