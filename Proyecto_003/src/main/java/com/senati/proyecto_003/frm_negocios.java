/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.senati.proyecto_003;

import com.senati.proyecto_003.Clase.conexion1;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sound.midi.SysexMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class frm_negocios extends javax.swing.JFrame {
    String mensaje;
    conexion1 obj=new conexion1();

    /**
     * Creates new form frm_negocios
     */
    public frm_negocios() {
        initComponents();
        verTabla();
        /*btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGrabar.setEnabled(false);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscar.setBackground(new java.awt.Color(255, 204, 204));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGrabar.setBackground(new java.awt.Color(255, 204, 204));
        btnGrabar.setText("GRABAR");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 204, 204));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 204, 204));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tbLista.setBackground(new java.awt.Color(255, 255, 204));
        tbLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListaMouseClicked(evt);
            }
        });
        tbLista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbListaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbLista);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 204));
        jLabel1.setText("CODIGO A BUSCAR");

        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 204));
        jLabel2.setText("NOMBRE DEL CURSO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 204));
        jLabel3.setText("PRECIO DEL CURSO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 204));
        jLabel4.setText("FECHA INICIO DEL CURSO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCurso)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(144, 144, 144))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        buscar(txtBuscar.getText());
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        actualizar(txtBuscar.getText(),txtCurso.getText(),Double.parseDouble(txtPrecio.getText()),(txtFecha.getText()));
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        verTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminar(txtBuscar.getText());
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        verTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // TODO add your handling code here:
        grabar();
        btnGrabar.setEnabled(false);
        verTabla();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tbListaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbListaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbListaKeyPressed

    private void txtFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyPressed
        // TODO add your handling code here:
        btnGrabar.setEnabled(true);
    }//GEN-LAST:event_txtFechaKeyPressed

    private void tbListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListaMouseClicked
        // TODO add your handling code here:
        int y;
        try{
            //Guardamos en un entero la fila seleccionada.
            y=tbLista.getSelectedRow();
            if (y == -1){
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila.");
            } else {
               

                //String ayuda = tabla.getValueAt(filaseleccionada, num_columna).toString()); 
                txtBuscar.setText((String) tbLista.getValueAt(y, 0));
                txtCurso.setText((String) tbLista.getValueAt(y, 1));
		  txtPrecio.setText(String.valueOf((Double) tbLista.getValueAt(y, 2)));
                  txtFecha.setText((String) tbLista.getValueAt(y, 3));
   
                           }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex+"\nInténtelo nuevamente", " .::Error En la Operacion::." ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tbListaMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frm_negocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_negocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_negocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_negocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_negocios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLista;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
void buscar(String xcod){
    try{
        obj.preparardb();
        PreparedStatement pst=obj.conectar.prepareStatement("select * from curso where cod_Curso=?");
        pst.setString(1,xcod);
        obj.rs=pst.executeQuery();
        if(obj.rs.next()){
            txtCurso.setText(obj.rs.getString("Nom_Curso"));
            txtPrecio.setText(obj.rs.getString("Precio_Curso"));
            txtFecha.setText(obj.rs.getString("fecha_Inicio"));
        }else{
            mensaje("Codigo no existe");
        }
       
    }catch(Exception ex){
        mensaje(ex.toString());
    }
}
void mensaje(String men){
    JOptionPane.showMessageDialog(this, men);
}
void actualizar(String cod,String nomc,double pen,String fecha){
    try{
        obj.preparardb();
        PreparedStatement pst=obj.conectar.prepareStatement("Update curso set Nom_Curso=?,Precio_Curso=?,fecha_Inicio=? where cod_Curso=?");
        pst.setString(1, nomc);
        pst.setDouble(2, pen);
        pst.setString(3, fecha);
        pst.setString(4, cod);
        pst.executeUpdate();
        mensaje("datos actualizados");
        obj.conectar.close();
        
    }catch(Exception xp){
        mensaje(xp.toString());
    }
}
void eliminar(String xcod){
    try{
        obj.preparardb();
        PreparedStatement pst=obj.conectar.prepareStatement("delete from curso where cod_Curso=?");
        pst.setString(1, xcod);
        pst.executeUpdate();
        mensaje("registro eliminado");
        obj.conectar.close();
        limpiar();
    }catch(Exception xc){
        
    }
}
void verTabla(){
    DefaultTableModel modelo=new DefaultTableModel();
    modelo.addColumn("CODIGO");
    modelo.addColumn("NOMBRE DEL CURSO");
    modelo.addColumn("PRECIO");
    modelo.addColumn("FECHA INICIO");
    try{
        obj.preparardb();
        PreparedStatement pst=obj.conectar.prepareCall("select * from curso");
        obj.rs=pst.executeQuery();
        while(obj.rs.next()){
            Object data[]={
                obj.rs.getString(1),obj.rs.getString(2),
                obj.rs.getDouble(3),obj.rs.getString(4)
            };
            modelo.addRow(data);
        }
        tbLista.setModel(modelo);
        obj.rs.close();
        obj.conectar.close();
                
    }catch(Exception ex){
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }
    
    
}
void grabar(){
    int xr=JOptionPane.showConfirmDialog(null, "desea grabar registros","pregunta",0);
    if(xr==0){
        try{
            obj.preparardb();
            String cod=txtBuscar.getText();
            String nom=txtCurso.getText();
            double pre=Double.parseDouble(txtPrecio.getText());
            String fecha=txtFecha.getText();
            
            String captura="insert into curso(cod_Curso,Nom_Curso,Precio_Curso,fecha_Inicio)values";
            captura=captura+"('"+cod+"','"+nom+"','"+pre+"','"+fecha+"')";
            obj.st=obj.conectar.createStatement();
            obj.st.executeUpdate(captura);
            obj.conectar.close();
            limpiar();
                  
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No Se Puede Guardar,el Codigo es Duplicado","Error",0);
            System.out.println(ex.toString());
        }
        catch(Exception ex1){
            JOptionPane.showMessageDialog(null,"Faltan Llenar Datos","Aviso",0);
            System.out.println(ex1.toString());
        }
    }
}
void limpiar(){
	txtBuscar.setText(null);
	txtCurso.setText(null);
	txtFecha.setText(null);
        txtPrecio.setText(null);
	txtCurso.requestFocus();
}

}
