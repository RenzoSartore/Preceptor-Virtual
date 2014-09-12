/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Codigo.*;
import ui.AgregarAlum;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Renzo Sartore
 */
public class Table extends javax.swing.JFrame {

    /**
     * Creates new form Table
     */
    public Table() {
        initComponents();
        refreshTableNombre((String) cmbCurso.getSelectedItem());
        ListaAlumnos.levantarObjetoEntero();
        refreshTable();
        this.setTitle("Control de Alumnos");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        bAgregarAlumno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlum = new javax.swing.JTable();
        bExportar = new javax.swing.JButton();
        bAgregarCurso = new javax.swing.JButton();
        bRecargartbl = new javax.swing.JButton();
        bGuardar1 = new javax.swing.JButton();
        bCargarCurso = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jLabel6.setText("Preceptor:");

        jLabel7.setText("Nombre:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(491, Short.MAX_VALUE))
        );

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Curso:");

        cmbCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1ºA", "1ºB", "1ºC" }));
        cmbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoActionPerformed(evt);
            }
        });

        jLabel13.setText("Alumnos:");

        bAgregarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/student.png"))); // NOI18N
        bAgregarAlumno.setText("Agregar Alumno");
        bAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarAlumnoActionPerformed(evt);
            }
        });

        tblAlum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Título 4", "Título 5"
            }
        ));
        jScrollPane1.setViewportView(tblAlum);

        bExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/export.png"))); // NOI18N
        bExportar.setText("Exportar");
        bExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExportarActionPerformed(evt);
            }
        });

        bAgregarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        bAgregarCurso.setText("Agregar Curso");
        bAgregarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarCursoActionPerformed(evt);
            }
        });

        bRecargartbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/see.png"))); // NOI18N
        bRecargartbl.setText("Ver Todos");
        bRecargartbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRecargartblActionPerformed(evt);
            }
        });

        bGuardar1.setText("Guardar");

        bCargarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh.png"))); // NOI18N
        bCargarCurso.setText("Cagar Curso");
        bCargarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCargarCursoActionPerformed(evt);
            }
        });

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash.png"))); // NOI18N
        btnBorrar.setText("Borrar Fila");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jMenu3.setText("File");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenu5.setText("jMenu5");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenu5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(4, 4, 4)
                        .addComponent(bAgregarAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bRecargartbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBorrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bExportar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bAgregarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCargarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE))
                        .addGap(8, 8, 8))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(511, Short.MAX_VALUE)
                    .addComponent(bGuardar1)
                    .addGap(78, 78, 78)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbCurso)
                    .addComponent(bAgregarCurso)
                    .addComponent(bCargarCurso))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAgregarAlumno)
                    .addComponent(bRecargartbl))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bExportar)
                    .addComponent(btnBorrar))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(bGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(263, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCursoActionPerformed

    private void bAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarAlumnoActionPerformed
        AgregarAlum obj = new AgregarAlum(this);
        obj.setVisible(true);
        //dispose();
    }//GEN-LAST:event_bAgregarAlumnoActionPerformed

    private void bExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExportarActionPerformed
        // TODO add your handling code here:
                new ExportViewer().setVisible(true);
    }//GEN-LAST:event_bExportarActionPerformed

    private void bAgregarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarCursoActionPerformed
        AgregarCurso obj = new AgregarCurso();
        obj.setVisible(true);

    }//GEN-LAST:event_bAgregarCursoActionPerformed

    private void bRecargartblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRecargartblActionPerformed
        refreshTable();
    }//GEN-LAST:event_bRecargartblActionPerformed

    private void bCargarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCargarCursoActionPerformed
        // TODO add your handling code here:
        refreshTableNombre((String) cmbCurso.getSelectedItem());
 
    }//GEN-LAST:event_bCargarCursoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        Alumnos[] aux = new Alumnos[ListaAlumnos.getLista().length - 1];
        int row = tblAlum.getSelectedRow();
        System.out.println("Fila = " + row);
        System.out.println("Value = " + tblAlum.getModel().getValueAt(row, 0));
          String strIdx = (String) tblAlum.getModel().getValueAt(row, 0);
          System.out.println("String = " + strIdx);
           if (strIdx != null && !strIdx.isEmpty()) {
            int indice = Integer.parseInt(strIdx);
            ListaAlumnos.del(indice);
            } 
           else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
             if (ListaAlumnos.getLista()[row] != null) {
         ListaAlumnos.getLista()[row] = null;
         }
              for (int i = 0; i < ListaAlumnos.getLista().length; i++ ) {
         if (ListaAlumnos.getLista()[i] !=null) {
         for (int j = 0; j < aux.length; j++) {
         if (aux[j] == null) {
         aux[j] = ListaAlumnos.getLista()[i];
         break;
         }
         }
         }
         }
         ListaAlumnos.setLista(aux);
         ListaAlumnos.saveLista();
           
        refreshTable();

    
            
           }

        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
                                        
        //TODO: Levantar una ventana o un dialogo con los datos del alumno
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
     
       
                                         
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed
    public javax.swing.JTable getTblAlum() {
        return this.tblAlum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Table().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregarAlumno;
    private javax.swing.JButton bAgregarCurso;
    private javax.swing.JButton bCargarCurso;
    private javax.swing.JButton bExportar;
    private javax.swing.JButton bGuardar1;
    private javax.swing.JButton bRecargartbl;
    private javax.swing.JButton btnBorrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlum;
    // End of variables declaration//GEN-END:variables

        
    private void refreshTableNombre(String curso) {
        Alumnos[] listado = ListaAlumnos.getBuscaCurso(curso);
        //Creamos el modelo de datos de la tabla.
        DefaultTableModel model = new DefaultTableModel() {
            /*
             * Edito un método de la clase "DefaultTableModel" y cada vez que se
             * renderiza un celda, cuando se pregunta si es editable le digo que
             * no. Lo explico mejor en clase;
             */

            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 10) {
                    return true;
                }
                return false;
            }
            Object[][] data = {};
            //
            // This method is used by the JTable to define the default
            // renderer or editor for each cell. For example if you have
            // a boolean data it will be rendered as a check box. A
            // number value is right aligned.

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return getValueAt(0, columnIndex).getClass();

            }
        };

        model.addColumn("Ordenzº");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Asistencia");
        model.addColumn("Obvservacion");
        //model.addColumn("Falta");
        
                for (int i = 0; i < listado.length; i++) {
            if (listado[i] != null) {
                Object[] fila = new Object[5];
                fila[0] = "" +(i+1);
                fila[1] = listado[i].getNombre();
                fila[2] = listado[i].getApellido();
                fila[3] = listado[i].getFaltaIcon();
                fila[4] = "" + listado[i].getObvsrvacion();
                //fila[4] = Boolean.TRUE;                
                model.addRow(fila);
            }
        }

        tblAlum.setModel(model);
    }
    
    
    private void refreshTable() {
        Alumnos[] listado = ListaAlumnos.getLista();
        //Creamos el modelo de datos de la tabla.
        DefaultTableModel model = new DefaultTableModel() {
            /*
             * Edito un método de la clase "DefaultTableModel" y cada vez que se
             * renderiza un celda, cuando se pregunta si es editable le digo que
             * no. Lo explico mejor en clase;
             */

            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 10) {
                    return true;
                }
                return false;
            }
            Object[][] data = {};
            //
            // This method is used by the JTable to define the default
            // renderer or editor for each cell. For example if you have
            // a boolean data it will be rendered as a check box. A
            // number value is right aligned.

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return getValueAt(0, columnIndex).getClass();

            }
        };

        model.addColumn("Orden");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Asistencia");
        model.addColumn("Obvservaciones");
        //model.addColumn("Falta");
        
                for (int i = 0; i < listado.length; i++) {
            if (listado[i] != null) {
                Object[] fila = new Object[5];
                fila[0] = "" +(i+1);
                fila[1] = listado[i].getNombre();
                fila[2] = listado[i].getApellido();
                fila[3] = listado[i].getFaltaIcon();
                fila[4] = "" + listado[i].getObvsrvacion();
                //fila[4] = Boolean.TRUE;                
                model.addRow(fila);
            }
        }

        tblAlum.setModel(model);
    }
    
    
        /*private void Clear_Table(){
        *for (int i = 0; i < tblAlum.getRowCount(); i++) {
        *tblAlum.removeColumn(i);
        *i-=1;
        *}
        *}
        */
    
}
